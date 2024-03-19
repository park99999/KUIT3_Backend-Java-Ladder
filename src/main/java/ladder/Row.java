package ladder;

public class Row {
    private Node[] row;

    public Row(NaturalNumber numberOfPerson) {
        row = new Node[numberOfPerson.get()];
        for (int i = 0; i < numberOfPerson.get(); i++) {
            row[i] = Node.of(Direction.center);
        }

    }
    public String makeString_row(int _row, int col){
        String s = "";
        for(int i = 0; i < row.length; i ++){
            if(i == col && )
            s+= String.valueOf(n.getDirection().getVal_direction())+' ';
        }
        s+= '\n';

        return s;
    }
    public void drawLine(Position lineStartPosition) {
        //validateDrawLinePosition(lineStartPosition);
        row[lineStartPosition.getValue()] = Node.of(Direction.right);
        row[lineStartPosition.next().getValue()] = Node.of(Direction.left);
    }

    public Position nextPosition(Position position) {

        validatePosition(position);
        System.out.println(Direction.left);
        System.out.println(position.getValue());
        System.out.println(row[position.getValue()]);
        if (isLeft(position)) {
            return position.prev();
        }
        if (isRight(position)) {
            return position.next();
        }
        return position;
    }

    private boolean isLeft(Position position) {
        return row[position.getValue()].getDirection() == Direction.left;
    }

    private boolean isRight(Position position) {
        return row[position.getValue()].getDirection() == Direction.right;
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
