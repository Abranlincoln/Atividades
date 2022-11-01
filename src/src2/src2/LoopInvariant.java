package src2;
public class LoopInvariant {
    private String variable;
    private String initialValue;
    private String condition;
    private String increment;

    public LoopInvariant(String variable, String initialValue, String condition, String increment) {
        this.variable = variable;
        this.initialValue = initialValue;
        this.condition = condition;
        this.increment = increment;
    }

    public String getVariable() {
        return variable;
    }

    public String getInitialValue() {
        return initialValue;
    }

    public String getCondition() {
        return condition;
    }

    public String getIncrement() {
        return increment;
    }
}
