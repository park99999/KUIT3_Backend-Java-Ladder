package ladder;

public class LadderGame {

    private LadderCreator ladderCreator;
    public LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }
    public int run(Position position){
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
        return ladderRunner.run(position);
    }


}
