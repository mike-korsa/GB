package com.company.lesson8;

import javax.swing.*;

public class ActionButton extends JButton {
    private String actionType;
    private boolean isMathOperator;

    public String getActionType() { return actionType; }
    public boolean isMathOperator() { return isMathOperator; }
    public void setActionType(String actionType) { this.actionType = actionType; }
    public void setMathOperator(boolean MathOperator) { this.isMathOperator = MathOperator; }
}
