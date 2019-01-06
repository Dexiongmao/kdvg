package 口袋喂鸡;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button_frame extends JFrame implements ActionListener {

    public button_frame(String buttons[]) throws HeadlessException {
        //setTitle("口袋喂鸡！");
        setSize(400,800);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);












    }


    @Override
    public void actionPerformed (ActionEvent e){
        switch (e.getActionCommand()){
            case "结束游戏":
                System.exit(0);
                break;

        }
    }





}
