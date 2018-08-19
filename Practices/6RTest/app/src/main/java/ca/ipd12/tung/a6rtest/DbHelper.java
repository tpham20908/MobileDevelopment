package ca.ipd12.tung.a6rtest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

import ca.ipd12.tung.a6rtest.TestContract.*;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "6rtest.db";
    private static final int DATABASE_VERSION = 6;
    private SQLiteDatabase db;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                TestTable.TABLE_QUESTIONS + " (" +
                TestTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TestTable.COLUMN_QUESTION + " TEXT, " +
                TestTable.COLUMN_OPTION1 + " TEXT, " +
                TestTable.COLUMN_OPTION2 + " TEXT, " +
                TestTable.COLUMN_OPTION3 + " TEXT, " +
                TestTable.COLUMN_OPTION4 + " TEXT, " +
                TestTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        final String SQL_CREATE_PARTICIPANTS_TABLE = "CREATE TABLE " +
                TestTable.TABLE_PARTICIPANTS + "(" +
                TestTable.COLUMN_EMAIL + " TEXT, " +
                TestTable.COLUMN_SCORE + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        db.execSQL(SQL_CREATE_PARTICIPANTS_TABLE);
        fillQuestionsTable();
        fillParticipant();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TestTable.TABLE_QUESTIONS);
        db.execSQL("DROP TABLE IF EXISTS " + TestTable.TABLE_PARTICIPANTS);
        onCreate(db);
    }

    private void addQuestions(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(TestTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(TestTable.COLUMN_OPTION1, question.getOption1());
        cv.put(TestTable.COLUMN_OPTION2, question.getOption2());
        cv.put(TestTable.COLUMN_OPTION3, question.getOption3());
        cv.put(TestTable.COLUMN_OPTION4, question.getOption4());
        cv.put(TestTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(TestTable.TABLE_QUESTIONS, null, cv);
    }

    private void fillQuestionsTable() {
        List<Question> questionList = new ArrayList<Question>();
        questionList.add(
            new Question("Holders of learner or probationary licenses in Quebec are not permitted to ride with a blood-alcohol concentration of more than...?", "02", "03", "01", "00", 4)
        );
        questionList.add(
            new Question("As you put your transmission into higher gear, you should release your clutch...?", "Similtaneously", "Any of these", "Beforehand", "Afterward", 1)
        );
        questionList.add(
            new Question("As you ride, your knees should be...?", "Kept as high up as possible", "Hugging the gas tank", "Sticking out 45°", "Sticking out 90°", 2)
        );
        questionList.add(
            new Question("Where would you usually find the engine emergency cut-off switch on your motorcycle?", "Underneath the seat", "On the left handlebar", "On the right handlebar", "Below the tank", 3)
        );
        questionList.add(
            new Question("A tachometer on your motorcycle will show...?", "Total distance travelled since new", "Total distance travelled that day", "Engine revolutions", "Speed", 3)
        );
        questionList.add(
            new Question("When you are taking a curve, you should be focused on...?", "The apex","The exit", "The centre line", "The road in front of you", 2)
        );
        questionList.add(
                new Question("In normal riding, the ball of your right hand should be where, in relation to the throttle?", "Slightly below it","Level with it", "Any of these", "Slightly above it", 1)
        );
        questionList.add(
                new Question("The choke on a motorcycle is used for what?", "Improving fuel consumption","Accelerating", "Starting from cold", "Engine braking", 3)
        );
        questionList.add(
                new Question("When you're passing another vehicle, you shift from 3rd to 5th gear, missing out 4th. What effect will this have on the time it takes you to pass?", "Considerably increase","Considerably decrease", "It will stay the same", "Any of these depending on conditions", 1)
        );
        questionList.add(
                new Question("You should release the clutch when changing gear...?", "Sharply","Gradually", "Slowly", "In jerk", 2)
        );

        for (Question question : questionList) {
            addQuestions(question);
        }
    }

    public List<Question> getQuestionList() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TestTable.TABLE_QUESTIONS, null);
        if (c.moveToFirst()) {
            do {
                Question q = new Question();
                q.setQuestion(c.getString(c.getColumnIndex(TestTable.COLUMN_QUESTION)));
                q.setOption1(c.getString(c.getColumnIndex(TestTable.COLUMN_OPTION1)));
                q.setOption2(c.getString(c.getColumnIndex(TestTable.COLUMN_OPTION2)));
                q.setOption3(c.getString(c.getColumnIndex(TestTable.COLUMN_OPTION3)));
                q.setOption4(c.getString(c.getColumnIndex(TestTable.COLUMN_OPTION4)));
                q.setAnswerNr(c.getInt(c.getColumnIndex(TestTable.COLUMN_ANSWER_NR)));
                questionList.add(q);
            } while (c.moveToNext());
        }
        c.close();

        return questionList;
    }

    public void addParticipant(Participant participant) {
        db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TestTable.COLUMN_EMAIL, participant.getEmail());
        cv.put(TestTable.COLUMN_SCORE, participant.getScore());
        db.insert(TestTable.TABLE_PARTICIPANTS, null, cv);
    }

    public ArrayList<String> getParticipantList() {
        ArrayList<String> participantList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TestTable.TABLE_PARTICIPANTS, null);
        if (c.moveToFirst()) {
            do {
                Participant p = new Participant();
                p.setEmail(c.getString(c.getColumnIndex(TestTable.COLUMN_EMAIL)));
                p.setScore(c.getInt(c.getColumnIndex(TestTable.COLUMN_SCORE)));
                participantList.add(p.toString());
            } while (c.moveToNext());
        }
        c.close();
        Collections.reverse(participantList);

        return participantList;
    }

    public void fillParticipant() {
        Participant p1 = new Participant("email1@email.ca", 8);
        Participant p2 = new Participant("email2@email.ca", 9);
        addParticipant(p1);
        addParticipant(p2);
    }
}