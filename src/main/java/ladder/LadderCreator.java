package ladder;

import model.NaturalNumber;
import model.Position;

public class LadderCreator {
    private Row[] rows;

    public LadderCreator(NaturalNumber numberOfRows, NaturalNumber numberOfPerson){
        rows = new Row[numberOfPerson.getNaturalNumber()];
        for(int i = 0; i < rows.length; i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }
    public void drawLine(Position row, Position col) {
        rows[row.getPosition()].drawLine(col);
    }
    public Row[] getRows(){
        return rows;
    }
}
