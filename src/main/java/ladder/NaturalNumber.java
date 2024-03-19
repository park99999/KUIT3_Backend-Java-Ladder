package ladder;

public class NaturalNumber {

    private final int naturalNum;

    private NaturalNumber(int num) {
        check_natural(num);
        this.naturalNum = num;
    }
    public int get(){
        return this.naturalNum;
    }
    public static NaturalNumber of(int num){
        return new NaturalNumber(num);
    }
    private void check_natural(int num) {
        if(num <= 1){
            throw new IllegalArgumentException(ExceptionMessage.s_notNaturalNumber.getErrorMessage());
        }
    }
}
