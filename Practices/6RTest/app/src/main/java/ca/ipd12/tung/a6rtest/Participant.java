package ca.ipd12.tung.a6rtest;

public class Participant {

    private String email;
    private int score;

    public Participant() {}

    public Participant(String email, int score) {
        this.email = email;
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Email: " + email + " | Score: " + score;
    }
}
