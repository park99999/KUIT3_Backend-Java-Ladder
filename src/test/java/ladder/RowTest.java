package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {

    @Test
    void 참여자_한_명_사다리_이동() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(1);
        Row row = new Row(numberOfPerson);

        //when
        Position position = Position.of(0);

        //then
        assertEquals(0,row.nextPosition(position).getValue());
    }

    @Test
    void 참여자_두_명_사다리_열간_이동() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(2);
        Row row = new Row(numberOfPerson);
        Position position = Position.of(0);
        row.drawLine(position);

        //when
        Position resultPosition = row.nextPosition(position);
        //then
        assertEquals(1,resultPosition.getValue());


        //when
        position = Position.of(1);
        resultPosition = row.nextPosition(position);
        //then
        assertEquals(0, resultPosition.getValue());
    }

    @Test
    void 참여자_세_명_사다리_열간_이동() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);
        row.drawLine(Position.of(0));

        //when
        Position position = Position.of(0);
        Position resultPosition = row.nextPosition(position);
        //then
        assertEquals(1,resultPosition.getValue());


        //when
        position = Position.of(1);
        resultPosition = row.nextPosition(position);
        //then
        assertEquals(0, resultPosition.getValue());

        //when
        position = Position.of(2);
        resultPosition = row.nextPosition(position);
        //then
        assertEquals(2, resultPosition.getValue());
    }

    @Test
    void 사다리_사람수_예외_처리() {
        NaturalNumber person = NaturalNumber.of(0);
        assertThrows(IllegalArgumentException.class, () -> new Row(person));
    }

    @Test
    void 사다리_위치_최대값_초과_예외_처리() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);

        //when
        Position position = Position.of(3);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.nextPosition(position));
    }

    @Test
    void 사다리_위치_최소값_미만_예외_처리() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);

        //when
        Position position = Position.of(-1);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.nextPosition(position));
    }

    @Test
    void 사다리_라인_그리기_위치_초과_예외() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);

        //when
        Position lineStartPosition = Position.of(2);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(lineStartPosition));
    }

    @Test
    void 사다리_라인_그리기_위치_미만_예외() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);

        //when
        Position lineStartPosition = Position.of(-1);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(lineStartPosition));
    }

    @Test
    void 라인_그리기_좌측_라인_중복_예외() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);
        row.drawLine(Position.of(0));

        //when
        Position lineStartPosition = Position.of(1);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(lineStartPosition));

    }

    @Test
    void 라인_그리기_우측_라인_중복_예외() {
        //given
        NaturalNumber numberOfPerson = NaturalNumber.of(3);
        Row row = new Row(numberOfPerson);
        row.drawLine(Position.of(1));

        //when
        Position lineStartPosition = Position.of(0);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(lineStartPosition));

    }

}