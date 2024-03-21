package ladder;

import model.Direction;
import model.ExceptionMessage;
import model.NaturalNumber;
import model.Node;

public class Row {
    private Node[] row;

    public Row(NaturalNumber numberOfPerson) {
        //validateNumberOfPerson(numberOfPerson); NaturalNmber에서 하니깐 생략 가능
        row = new Node[numberOfPerson.getNaturalNumber()];
        for (int i =0; i< numberOfPerson.getNaturalNumber(); i ++){
            row[i]= Node.of(Direction.CENTER);
        }
    }

    public void drawLine(int lineStartPosition) {
        validateDrawLinePosition(lineStartPosition);
        row[lineStartPosition] = Node.of(Direction.RIGHT);
        row[lineStartPosition + 1] = Node.of(Direction.LEFT);
    }

    public int nextPosition(int position) {

        validatePosition(position);

        int nextPosition = row[position].move(position);

        return nextPosition;
    }

//    private boolean isLeft(int position) {
//        return row[position] == -1;
//    }
//
//    private boolean isRight(int position) {
//        return row[position] == 1;
//    }

//    private void validateNumberOfPerson(int numberOfPerson) {
//        if(numberOfPerson < 1) {
//            throw new IllegalArgumentException(ExceptionMessage.AT_LEAST_ONE.getExceptionMessage());
//        }
//    }

    private void validateDrawLinePosition(int lineStartPosition) {
        if(lineStartPosition < 0 || lineStartPosition >= row.length - 1 || row[lineStartPosition].getDirection().getDirect() == -1 || row[lineStartPosition + 1].getDirection().getDirect() == 1) {
            throw new IllegalArgumentException(ExceptionMessage.IMPOSSIBLE_LOCATION_LINE.getExceptionMessage());
        }
    }

    private void validatePosition(int position) {
        if(position >= row.length || position < 0 ) {
            throw new IllegalArgumentException(ExceptionMessage.NOTVALIDATE_LOCATION.getExceptionMessage());
        }
    }




}
