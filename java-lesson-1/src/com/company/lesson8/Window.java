package com.company.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.lesson8.Actions.*;

class bProps {
    int x;
    int y;
    String caption;
    String action;
    boolean isNumericButton;

    public boolean isNumericButton() {
        return isNumericButton;
    }
    public String getCaption() { return caption; }

    public String getAction() { return action; }

    public bProps( String action, String caption, boolean isNumericButton) {
        this.action = action;
        this.caption = caption;
        this.isNumericButton=isNumericButton;
    }
}

public class Window extends JFrame {

    public static void main(String[] args) {

        new Window();
    }

    bProps[][] initbPropsArr (){
        bProps[][] bPropsArr = new bProps[4][5];
        bPropsArr[0][0] = new bProps(RESETALL,"C",false );
        bPropsArr[1][0] = new bProps(BACKSPACE,"<" ,false );
        bPropsArr[3][0] = new bProps(DIVISION,"/" ,false );
        bPropsArr[3][1] = new bProps(MULTIPLICATION,"x",false  );
        bPropsArr[3][2] = new bProps(DEDUCTION,"-" ,false );
        bPropsArr[3][3] = new bProps(PLUS,"+",false  );
        bPropsArr[3][4] = new bProps(CALC,"=",false  );
        bPropsArr[0][4] = new bProps(NEGATIVE,"+/-",false  );
        bPropsArr[1][4] = new bProps("","0" ,true);
        bPropsArr[2][4] = new bProps("","," ,true);
        return bPropsArr;
    }

    public Window() {
        bProps[][] bPropsArr = initbPropsArr();
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(300, 300, 400, 460);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 340, 32);
        field.setHorizontalAlignment(4);
        add(field);
        int buttonSize = 68;
        for (int i=0;i<4;i++) {
            for (int j=0;j<5;j++) {
                if (i>=0 && i<3 && j>0 && j<4) {
                    String butttonText = Integer.toString( 10 - 3 + i - (j - 1) * 3);
                    JButton button = createButton(20 + i * buttonSize, 60 + j * buttonSize, buttonSize, buttonSize,
                            butttonText, true);
                    button.addActionListener(createAction(field, true, button));
                    add(button);
                }
                else {
                    bProps bp = bPropsArr[i][j];
                    if (bp != null) {
                        add(createButton(20 + i * buttonSize, 60 + j * buttonSize, buttonSize, buttonSize,
                                bp.getCaption(), bp.isNumericButton));
                    }
                }

            }
        }
        setVisible(true);
    }

    JButton createButton(int x, int y, int witdh , int heigth, String caption, boolean isNumeric) {
        JButton button = new JButton(caption);
        button.setBounds(x, y, witdh, heigth);
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isNumeric) {
                    //field
                }
                //button.setText("Нажал!");
            }
        });*/

        return button;
    }

    ActionListener createAction(JTextField field, boolean isNumeric, JButton button ) {
        return (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isNumeric) {
                    field.setText(field.getText() + button.getText());
                }
                //button.setText("Нажал!");
            }
        });

    }



}



