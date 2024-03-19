package ladder;

public class LadderGame {

    private LadderCreator ladderCreator;
    public LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }
    public void run(Position position){
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
    }


}
