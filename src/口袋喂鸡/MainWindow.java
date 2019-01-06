package 口袋喂鸡;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class MainWindow extends JFrame implements ActionListener{
    public MainWindow() throws HeadlessException{
        setTitle("口袋喂鸡！");
        //setSize(1900,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //MenuBar
        JMenuBar mainMenuBar = new JMenuBar();
        setJMenuBar(mainMenuBar);

        JMenu menubar_Game = new JMenu();
        menubar_Game.setText("游戏");
        mainMenuBar.add(menubar_Game);

        JMenuItem menubarItem_Exit = new JMenuItem();
        menubarItem_Exit.setText("结束游戏");
        menubarItem_Exit.addActionListener(this);
        menubar_Game.add(menubarItem_Exit);





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
