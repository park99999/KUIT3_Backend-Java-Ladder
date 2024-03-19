package ladder;

public class Row {
    private Node[] row;

    public Row(NaturalNumber numberOfPerson) {
        row = new Node[numberOfPerson.get()];
    }

    public void drawLine(Position lineStartPosition) {
        //validateDrawLinePosition(lineStartPosition);
        row[lineStartPosition.getValue()] = Node.of(Direction.right);
        row[lineStartPosition.next().getValue()] = Node.of(Direction.left);
    }

    public Position nextPosition(Position position) {

        validatePosition(position);


        return row[position.getValue()].move(position);
    }

    private void validateNumberOfPerson(int numberOfPerson) {
        if(numberOfPerson < 1) {
            throw new IllegalArgumentException(ExceptionMessage.s_atleast_person.getErrorMessage());
        }
    }

    /*private void validateDrawLinePosition(int lineStartPosition) {
        if(lineStartPosition < 0 || lineStartPosition >= row.length - 1 || row[lineStartPosition] == -1 || row[lineStartPosition + 1] == 1) {
            throw new IllegalArgumentException(ExceptionMessage.s_impossible_location.getErrorMessage());
        }
    }*/

    private void validatePosition(Position position) {
        if(position.getValue() >= row.length || position.getValue() < 0 ) {
            throw new IllegalArgumentException(ExceptionMessage.s_notvalid_location.getErrorMessage());
        }
    }





}
