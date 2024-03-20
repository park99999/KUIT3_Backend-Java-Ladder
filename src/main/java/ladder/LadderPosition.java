package ladder;

public class LadderPosition {
    private final Position row;
    private final int col;

    private LadderPosition(Position row, int col){
        this.col = col;
        this.row = row;
    }

    public static LadderPosition of(Position row, int col){
        return new LadderPosition(row,col);
    }

    public Position getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }

}
