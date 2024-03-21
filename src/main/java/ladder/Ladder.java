package ladder;

import model.NaturalNumber;
import model.Position;

public class Ladder {

    private Row[] rows;

    public Ladder(NaturalNumber numberOfRows, NaturalNumber numberOfPerson) {
        rows = new Row[numberOfPerson.getNaturalNumber()];

        for(int i = 0; i < numberOfRows.getNaturalNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position row, Position col) {
        rows[row.getPosition()].drawLine(col);
    }

    public Position run(Position position) {

        for(int i = 0; i < rows.length; i++) {
            position = rows[i].nextPosition(position);
        }

        return position;
    }
}
