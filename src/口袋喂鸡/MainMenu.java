package 口袋喂鸡;

import 口袋喂鸡.story.CH1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends MainWindow {
    private JPanel main_panel = new JPanel();
    private JPanel button_panel = new JPanel();
    private JPanel blank1 = new JPanel();
    private JPanel blank2 = new JPanel();
    private JPanel blank3 = new JPanel();
    private JPanel blank4 = new JPanel();
    private JPanel blank5 = new JPanel();
    private JPanel blank6 = new JPanel();
    private JPanel blank7 = new JPanel();
    private JPanel blank8 = new JPanel();
    private JPanel blank9 = new JPanel();

    private JButton 继续 = new JButton("继续");
    private JButton 开始游戏 = new JButton("开始游戏");
    private JButton 画廊 = new JButton("画廊");
    private JButton 退出游戏 = new JButton ("退出游戏");


    public MainMenu() throws HeadlessException{
        super();

        main_panel.setLayout(new BorderLayout());

        //background image
        final JLabel background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/口袋喂鸡/images/mainMenuBackground.png")));
        main_panel.add(background);


        //blank panels
        JLabel empty = new JLabel("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        empty.setForeground(Color.WHITE);
        blank1.add(empty);
        blank1.setBackground(Color.WHITE);
        blank2.setBackground(Color.WHITE);
        blank3.setBackground(Color.WHITE);
        blank4.setBackground(Color.WHITE);
        blank5.setBackground(Color.WHITE);



        //button
        main_panel.add(button_panel, BorderLayout.EAST);

        button_panel.setBackground(Color.WHITE);
        button_panel.setLayout(new GridLayout(11,1));

        button_panel.add(blank1);
        button_panel.add(blank2);
        button_panel.add(继续);
        button_panel.add(blank3);
        button_panel.add(开始游戏);
        button_panel.add(blank4);
        button_panel.add(画廊);
        button_panel.add(blank5);
        button_panel.add(退出游戏);




        继续.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "施工中");
            }
        });
        开始游戏.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu.this.setVisible(false);
                CH1 Ch1 = new CH1();

            }
        });
        画廊.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "施工中");
            }
        });
        退出游戏.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });














        add(main_panel);
    }









}
