package ladder;

import model.Position;

public class LadderRunner {

    private final LadderCreator lc;

    public LadderRunner(LadderCreator lc) {
        this.lc = lc;
    }



    public Position run(Position position) {

        for(int i = 0; i < lc.getRows().length; i++) {
            position = lc.getRows()[i].nextPosition(position);
        }

        return position;
    }
}
