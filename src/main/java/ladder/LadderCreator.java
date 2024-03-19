package ladder;

public class LadderCreator {
    private Row[] rows;
    public LadderCreator(NaturalNumber numberOfRow, NaturalNumber numberOfPerson) {
        rows = new Row[numberOfRow.get()];
        for (int i = 0; i < numberOfRow.get(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }
    public void drawLine(Position row, Position col) {
        rows[row.getValue()].drawLine(col);
    }

    public Row[] getRows() {
        return rows;
    }
}
