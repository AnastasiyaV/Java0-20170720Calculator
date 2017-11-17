package calculator.model;

public class CalculateResult {
    private Long date;
    private Boolean result;

    public CalculateResult(Long date, Boolean result) {
        this.date = date;
        this.result = result;
    }

    public Long getDate() {
        return date;
    }

    public Boolean getResult() {
        return result;
    }
}
