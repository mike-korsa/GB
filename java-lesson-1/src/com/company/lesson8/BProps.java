package com.company.lesson8;

public class BProps {
    int x;
    int y;
    String caption;
    String actionType;
    boolean isNumeric;
    boolean isMathOperator;

    public boolean isNumericButton() {
        return isNumeric;
    }
    public String getCaption() { return caption; }

    public String getActionType() { return actionType; }
    public boolean isMathOperator() { return isMathOperator; }

    public BProps(String action, String caption, boolean isNumericButton, boolean isMathOperator) {
        this.actionType = action;
        this.caption = caption;
        this.isNumeric=isNumericButton;
        this.isMathOperator = isMathOperator;
    }
}
