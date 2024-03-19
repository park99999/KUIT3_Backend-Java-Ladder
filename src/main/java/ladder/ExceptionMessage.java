package ladder;

public enum ExceptionMessage {
    s_atleast_person("게임의 참여자 수는 1명 이상이어야 합니다."),
    s_impossible_location("라인 생성이 불가능한 위치 입니다."),
    s_notvalid_location("유효하지 않는 위치 입니다."),

    s_notNaturalNumber("자연수가 아닙니다.");

    public final String exceptionMessage;

    ExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getErrorMessage() {
        return exceptionMessage;
    }
}
