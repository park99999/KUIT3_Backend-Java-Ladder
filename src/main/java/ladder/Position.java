package ladder;

public class Position {
    private final int position;

    private Position(int position){
        this.position = position;
    }
    public static Position of(int position){
        validatePosition(position);
        return new Position(position);
    }
    public int getValue() {
        return this.position;
    }
    public Position prev() {
        return new Position(position - 1);
    }

    public Position next() {
        return new Position(position + 1);
    }
    private static void validatePosition(int num){
        if (num<0)
            throw new IllegalArgumentException(ExceptionMessage.s_notvalid_location.getErrorMessage());
    }
}



