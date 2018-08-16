package ca.ipd12.tung.a6rtest;

import android.provider.BaseColumns;

public class TestContract {

    private TestContract() {}

    public static class TestTable implements BaseColumns {
        public static final String TABLE_QUESTIONS = "questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

        public static final String TABLE_PARTICIPANTS = "participants";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_SCORE = "score";
    }
}
