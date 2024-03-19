package ladder;

public class LadderPosition {
    private Position row;
    private Position col;

    private LadderPosition(Position row, Position col){
        this.col = col;
        this.row = row;
    }

    public static LadderPosition of(Position row, Position col){
        return new LadderPosition(row,col);
    }

}
