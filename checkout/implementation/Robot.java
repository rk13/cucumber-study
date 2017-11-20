package implementation;

public class Robot {
    public enum Mood {
        GOOD, BAD
    }

    public enum Action {
        GIGLE, CRY
    }

    private Mood mood;

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Action tackle() {
        switch (mood) {
            case GOOD:
                return Action.GIGLE;
            case BAD:
                return Action.CRY;
            default:
                throw new RuntimeException();
        }
    }

    public Action kick() {
        return Action.CRY;
    }
}