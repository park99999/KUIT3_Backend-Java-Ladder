package ladder;

import model.NaturalNumber;
import model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    void 사다리_생성_확인() {
        //given
        //when
        Ladder ladder  = new Ladder(NaturalNumber.of(3), NaturalNumber.of(5));

        //then
        assertNotNull(ladder);
    }

    @Test
    void 사다리_시작위치_예외_처리() {
        //given
        Ladder ladder = new Ladder(NaturalNumber.of(3), NaturalNumber.of(1));

        //when
        int position = 3;

        //then
        assertThrows(IllegalArgumentException.class, () -> ladder.run(Position.of(3)));
    }

    @Test
    void 사다리_결과_확인() {
        //given
        Ladder ladder = new Ladder(NaturalNumber.of(4), NaturalNumber.of(4));
        ladder.drawLine(Position.of(1),Position.of(0));
        ladder.drawLine(Position.of(1),Position.of(2));
        ladder.drawLine(Position.of(2),Position.of(1));


        //when
        Position resultPosition = ladder.run(Position.of(0));
        //then
        assertEquals(2, resultPosition.getPosition());

        //when
        resultPosition = ladder.run(Position.of(1));
        //then
        assertEquals(0, resultPosition.getPosition());

        //when

        resultPosition = ladder.run(Position.of(2));
        //then
        assertEquals(3, resultPosition.getPosition());

        //when

//        resultPosition = ladder.run(position);
//        //then
//        assertEquals(1, resultPosition);



    }
}