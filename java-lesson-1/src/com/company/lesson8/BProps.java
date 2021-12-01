package com.company.lesson8;

public class BProps {
    private int x;
    private int y;
    private String caption;
    private String actionType;
    private boolean isNumeric;
    private boolean isMathOperator;

    public boolean isNumeric() {
        return isNumeric;
    }

    public String getCaption() {
        return caption;
    }

    public String getActionType() {
        return actionType;
    }

    public boolean isMathOperator() {
        return isMathOperator;
    }

    public BProps(String action, String caption, boolean isNumericButton, boolean isMathOperator) {
        this.actionType = action;
        this.caption = caption;
        this.isNumeric = isNumericButton;
        this.isMathOperator = isMathOperator;
    }
}
