package com.company.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import static com.company.lesson8.Actions.*;

public class Window extends JFrame {
    Double var1;
    Double var2;
    boolean isActionChoosen = false;
    String choosenActionType;

    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        BProps[][] bPropsArr = initbPropsArr();
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 460);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 340, 32);
        field.setHorizontalAlignment(4);
        add(field);
        int buttonSize = 68;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= 0 && i < 3 && j > 0 && j < 4) {
                    String butttonText = Integer.toString(10 - 3 + i - (j - 1) * 3);
                    ActionButton button = createButton(20 + i * buttonSize, 60 + j * buttonSize, buttonSize, buttonSize,
                            butttonText, true, null, false);
                    button.addActionListener(createAction(field, true, button));
                    add(button);
                } else {
                    BProps bp = bPropsArr[i][j];
                    if (bp != null) {
                        ActionButton button = createButton(20 + i * buttonSize, 60 + j * buttonSize, buttonSize, buttonSize,
                                bp.getCaption(), bp.isNumeric(), bp.getActionType(), bp.isMathOperator());
                        button.addActionListener(createAction(field, bp.isNumeric(), button));
                        add(button);
                    }
                }

            }
        }
        setVisible(true);
    }

    ActionButton createButton(int x, int y, int witdh, int heigth, String caption, boolean isNumeric, String actionType, boolean isMathOperator) {
        ActionButton button = new ActionButton();
        button.setText(caption);
        button.setBounds(x, y, witdh, heigth);
        button.setActionType(actionType);
        button.setMathOperator(isMathOperator);
        return button;
    }

    ActionListener createAction(JTextField field, boolean isNumeric, ActionButton button) {
        return (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String actionType = button.getActionType();
                if (isNumeric) {
                    if (isActionChoosen) {
                        field.setText("");
                        isActionChoosen = false;
                    }
                    field.setText(field.getText() + button.getText());
                    field.setText(field.getText().replace(",", "."));
                } else {
                    List<String> actions = Arrays.asList(PLUS, DEDUCTION);
                    if (actionType.equals(BACKSPACE)) {
                        field.setText(field.getText().substring(0, field.getText().length() - 1));
                    }
                    if (actionType.equals(RESETALL)) {
                        var1 = null;
                        var2 = null;
                        choosenActionType = null;
                        isActionChoosen = false;
                        field.setText("");
                    }
                    if (button.isMathOperator()) {
                        var1 = Double.parseDouble(field.getText());
                        isActionChoosen = true;
                        choosenActionType = actionType;
                    }
                    if (actionType.equals(CALC)) {
                        var2 = Double.parseDouble(field.getText());
                        Double result = null;
                        if (choosenActionType.equals(PLUS))
                            result = var1 + var2;
                        if (choosenActionType.equals(DEDUCTION))
                            result = var1 - var2;
                        if (choosenActionType.equals(DIVISION))
                            result = var1 / var2;
                        if (choosenActionType.equals(MULTIPLICATION))
                            result = var1 * var2;
                        field.setText(Double.toString(result));
                    }

                }
            }
        });
    }

    BProps[][] initbPropsArr() {
        BProps[][] bPropsArr = new BProps[4][5];
        bPropsArr[0][0] = new BProps(RESETALL, "C", false, false);
        bPropsArr[1][0] = new BProps(BACKSPACE, "<", false, false);
        bPropsArr[3][0] = new BProps(DIVISION, "/", false, true);
        bPropsArr[3][1] = new BProps(MULTIPLICATION, "x", false, true);
        bPropsArr[3][2] = new BProps(DEDUCTION, "-", false, true);
        bPropsArr[3][3] = new BProps(PLUS, "+", false, true);
        bPropsArr[3][4] = new BProps(CALC, "=", false, false);
        bPropsArr[0][4] = new BProps(NEGATIVE, "+/-", false, false);
        bPropsArr[1][4] = new BProps("", "0", true, false);
        bPropsArr[2][4] = new BProps("", ",", true, false);
        return bPropsArr;
    }
}



