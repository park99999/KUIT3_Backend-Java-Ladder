package ladder;

public class LadderRunner {
    private final Row[] rows;

    public LadderRunner(Row[] rows){
        this.rows = rows;
    }
    public int run(Position position){
        for (int i = 0 ; i < rows.length; i ++){
            printLadder(LadderPosition.of(position,i)); // before
            position = rows[i].nextPosition(position);
            printLadder(LadderPosition.of(position,i)); //after
        }
        return position.getValue();
    }
    public void printLadder(LadderPosition lp){
        StringBuilder s = new StringBuilder();
        for (int i=0; i < rows.length; i ++){
            s.append(rows[i].makeString_row(lp,i));
        }
        System.out.println(s);
    }
}
