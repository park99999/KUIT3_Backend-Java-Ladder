package ladder;

public enum Direction {
    right(1),
    center(0),
    left(-1);

    public final int val_direction;

    Direction(int val_direction) {
        this.val_direction = val_direction;
    }
    public int getVal_direction(){
        return val_direction;
    }
}