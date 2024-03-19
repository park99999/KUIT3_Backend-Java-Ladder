package ladder;

public class LadderRunner {
    private Row[] rows;

    public LadderRunner(Row[] rows){
        this.rows = rows;
    }
    public int run(Position position){
        for (int i = 0 ; i < rows.length; i ++){
            printLadder(i,position.getValue()); // before
            position = rows[i].nextPosition(position);
            printLadder(i,position.getValue()); //after
        }
        return position.getValue();
    }
    public void printLadder(int a, int col){
        String s = "";
        for (int i=0; i < rows.length; i ++){
            s+=rows[i].makeString_row(i,col);
        }
        System.out.println(s);
    }
}
