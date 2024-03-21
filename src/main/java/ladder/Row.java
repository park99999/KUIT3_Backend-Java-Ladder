package ladder;

import model.Direction;
import model.ExceptionMessage;
import model.NaturalNumber;

public class Row {
    private int[] row;

    public Row(NaturalNumber numberOfPerson) {
        //validateNumberOfPerson(numberOfPerson); NaturalNmber에서 하니깐 생략 가능
        row = new int[numberOfPerson.getNaturalNumber()];
    }

    public void drawLine(int lineStartPosition) {
        validateDrawLinePosition(lineStartPosition);
        row[lineStartPosition] = Direction.RIGHT.getDirect();
        row[lineStartPosition + 1] = Direction.LEFT.getDirect();
    }

    public int nextPosition(int position) {

        validatePosition(position);

        if (isLeft(position)) {
            return position - 1;
        }
        if (isRight(position)) {
            return position + 1;
        }

        return position;
    }

    private boolean isLeft(int position) {
        return row[position] == -1;
    }

    private boolean isRight(int position) {
        return row[position] == 1;
    }

//    private void validateNumberOfPerson(int numberOfPerson) {
//        if(numberOfPerson < 1) {
//            throw new IllegalArgumentException(ExceptionMessage.AT_LEAST_ONE.getExceptionMessage());
//        }
//    }

    private void validateDrawLinePosition(int lineStartPosition) {
        if(lineStartPosition < 0 || lineStartPosition >= row.length - 1 || row[lineStartPosition] == -1 || row[lineStartPosition + 1] == 1) {
            throw new IllegalArgumentException(ExceptionMessage.IMPOSSIBLE_LOCATION_LINE.getExceptionMessage());
        }
    }

    private void validatePosition(int position) {
        if(position >= row.length || position < 0 ) {
            throw new IllegalArgumentException(ExceptionMessage.NOTVALIDATE_LOCATION.getExceptionMessage());
        }
    }




}
