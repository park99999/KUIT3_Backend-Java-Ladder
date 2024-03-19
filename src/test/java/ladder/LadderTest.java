package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    void 사다리_생성_확인() {
        //given
        NaturalNumber numberOfRows = NaturalNumber.of(3);
        NaturalNumber numberOfPerson = NaturalNumber.of(5);

        //when
        LadderCreator ladder  = new LadderCreator(numberOfRows, numberOfPerson);

        //then
        assertNotNull(ladder);
    }

    @Test
    void 사다리_시작위치_예외_처리() {
        //given
        NaturalNumber numberOfRows = NaturalNumber.of(3);
        NaturalNumber numberOfPerson = NaturalNumber.of(1);
        LadderCreator ladder = new LadderCreator(numberOfRows, numberOfPerson);

        //when
        int position = 3;

        //then
        //assertThrows(IllegalArgumentException.class, () -> ladder.run(3));
    }

    @Test
    void 사다리_결과_확인() {
        //given
        NaturalNumber numberOfRows = NaturalNumber.of(4);
        NaturalNumber numberOfPerson = NaturalNumber.of(4);
        LadderCreator ladder = new LadderCreator(numberOfRows, numberOfPerson);
        ladder.drawLine(Position.of(1),Position.of(0));
        ladder.drawLine(Position.of(1),Position.of(2));
        ladder.drawLine(Position.of(2),Position.of(1));

        LadderGame ladderGame = new LadderGame(ladder);

        //when
        Position position = Position.of(0);
        int resultPosition = ladderGame.run(position);
        //then
        assertEquals(2, resultPosition);

        //when
        position = Position.of(1);
        resultPosition = ladderGame.run(position);
        //then
        assertEquals(0, resultPosition);

        //when
        position = Position.of(2);
        resultPosition = ladderGame.run(position);
        //then
        assertEquals(3, resultPosition);

        //when
        position = Position.of(3);
        resultPosition = ladderGame.run(position);
        //then
        assertEquals(1, resultPosition);



    }
    @Test
    void 사다리_프린트_확인() {
        //given
        NaturalNumber numberOfRows = NaturalNumber.of(4);
        NaturalNumber numberOfPerson = NaturalNumber.of(4);
        LadderCreator ladder = new LadderCreator(numberOfRows, numberOfPerson);
        ladder.drawLine(Position.of(1), Position.of(0));
        ladder.drawLine(Position.of(1), Position.of(2));
        ladder.drawLine(Position.of(2), Position.of(1));

        LadderGame ladderGame = new LadderGame(ladder);
        Position position = Position.of(0);
        int resultPosition = ladderGame.run(position);
    }
}