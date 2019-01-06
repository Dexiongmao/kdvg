package 口袋喂鸡;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Adventure extends MainWindow implements ActionListener {

    //for the button dialog
    private JFrame button_frame;

    private JPanel main_panel = new JPanel();
    private JPanel top_panel = new JPanel();
    private JPanel bottom_panel = new JPanel();
    private JPanel button_panel = new JPanel();

    private JLabel speaker_label = new JLabel();
    private JLabel text_label = new JLabel();
    private JLabel character1 = new JLabel();
    private JLabel character2 = new JLabel();
    private JLabel background = new JLabel();

    private JTextField choice = new JTextField();

    private Integer i = 1;
    private Integer j = 0;
    private Integer n = 0;//for button dialog return value
    private Integer button_counter = 0;
    private String button1 = null,button2 = null,button3 = null,button4 = null,button5 = null,button6 = null,button7 = null,button8 = null,button9 = null;





    protected ArrayList<String> text = new ArrayList<>();
    protected ArrayList<String> adv_background = new ArrayList<>();
    //protected ArrayList<String> buttons = new ArrayList<>();
    protected String[][] buttons = new String[50000][10];
    protected ArrayList<String> speaker = new ArrayList<>();
    protected ArrayList<String> ch1 = new ArrayList<>();
    protected ArrayList<String> ch2 = new ArrayList<>();




    public Adventure(ArrayList<String> text, ArrayList<String> adv_background, String[][] buttons, ArrayList<String> speaker, ArrayList<String> ch1, ArrayList<String> ch2) throws HeadlessException {
        super();
        this.text = text;
        this.adv_background = adv_background;
        this.buttons = buttons;
        this.speaker = speaker;
        this.ch1 = ch1;
        this.ch2 = ch2;



        /*speaker_label.setVisible(true);
        text_label.setVisible(true);*/



        JButton next;
        next = new JButton("继续");
        next.addActionListener(this);


        main_panel.setLayout(new BoxLayout(main_panel, BoxLayout.PAGE_AXIS));
        button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.PAGE_AXIS));
        main_panel.add(top_panel);


//        //button panel
//        if (buttons[i][0] == "true") {
//            JButton button = new JButton();
//            while(buttons[i][j] != null && j < 10){
//                button.setText(buttons[i][j]);
//                button_panel.add(button);
//                j++;
//            }
//            j=0;
//            main_panel.add(button_panel);
//            next.setVisible(false);
//        }




        main_panel.add(bottom_panel);
        /*main_panel.addMouseListener(this);
        addMouseListener(this);*/

        top_panel.setLayout(new FlowLayout());




        //character 1 image
        character1.setIcon(new ImageIcon(getClass().getResource(ch1.get(0))));
        top_panel.add(character1, BorderLayout.WEST);


        //background image
        background.setIcon(new ImageIcon(getClass().getResource(adv_background.get(0))));
        top_panel.add(background);

        //character 2 image
        character2.setIcon(new ImageIcon(getClass().getResource(ch2.get(0))));
        top_panel.add(character2, BorderLayout.EAST);



        //bottom panel
        bottom_panel.setLayout(new BorderLayout());
        //JLabel speaker_label = new JLabel(speaker);
        speaker_label.setText(speaker.get(0));
        speaker_label.setFont(speaker_label.getFont().deriveFont(28.0f));
        bottom_panel.add(speaker_label, BorderLayout.NORTH);
        //JLabel text_label = new JLabel(text);
        text_label.setText(text.get(0));
        bottom_panel.add(text_label);
        bottom_panel.add(next, BorderLayout.SOUTH);




        add(main_panel);
    }

    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }

    public ArrayList<String> getAdv_background() {
        return adv_background;
    }

    public void setAdv_background(ArrayList<String> adv_background) {
        this.adv_background = adv_background;
    }

    public String[][] getButtons() {
        return buttons;
    }

    public void setButtons(String[][] buttons) {
        this.buttons = buttons;
    }

    public ArrayList<String> getSpeaker() {
        return speaker;
    }

    public void setSpeaker(ArrayList<String> speaker) {
        this.speaker = speaker;
    }

    public ArrayList<String> getCh1() {
        return ch1;
    }

    public void setCh1(ArrayList<String> ch1) {
        this.ch1 = ch1;
    }

    public ArrayList<String> getCh2() {
        return ch2;
    }

    public void setCh2(ArrayList<String> ch2) {
        this.ch2 = ch2;
    }

//    public String getchoice(){
//        return choice.getText();
//    }

    public Integer getN(){
        return n;
    }
    public void setN(Integer n){
        this.n = n;
    }



    /*public void mouseClicked(MouseEvent e){
        return;
    }
    public void mousePressed(MouseEvent e){
        return;
    }
    public void mouseReleased(MouseEvent e){
        return;

    }
    public void mouseExited(MouseEvent e){
        return;
    }
    public void mouseEntered(MouseEvent e){
        return;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case"继续":



                //if buttons array is not empty at this row (i)
                if(buttons[i][0]=="choice"){
                    //这一段睿智得我要死了
                    button_counter = 0;
                    if(buttons[i][1] != null){ button1 = buttons[i][1];button_counter++;}
                    if(buttons[i][2] != null){ button2 = buttons[i][2];button_counter++;}
                    if(buttons[i][3] != null){ button3 = buttons[i][3];button_counter++;}
                    if(buttons[i][4] != null){ button4 = buttons[i][4];button_counter++;}
                    if(buttons[i][5] != null){ button5 = buttons[i][5];button_counter++;}
                    if(buttons[i][6] != null){ button6 = buttons[i][6];button_counter++;}
                    if(buttons[i][7] != null){ button7 = buttons[i][7];button_counter++;}
                    if(buttons[i][8] != null){ button8 = buttons[i][8];button_counter++;}
                    if(buttons[i][9] != null){ button9 = buttons[i][9];button_counter++;}
                    switch(button_counter){
                        case 2:
                            Object[] options_2 = {button1,button2};
                            n = JOptionPane.showOptionDialog(button_frame, "", "选择！", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options_2, options_2[0]);
                            break;
                        case 3:
                            Object[] options_3 = {button1,button2,button3};
                            n = JOptionPane.showOptionDialog(button_frame, "", "选择！", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options_3, options_3[0]);
                            break;



                        default:
                            break;
                    }

                }else{
                    character1.setIcon(new ImageIcon(getClass().getResource(ch1.get(i))));
                    character2.setIcon(new ImageIcon(getClass().getResource(ch2.get(i))));
                    background.setIcon(new ImageIcon(getClass().getResource(adv_background.get(i))));
                    text_label.setText(text.get(i));
                    speaker_label.setText(speaker.get(i));


                    i++;
                }







                break;

             //exit game by top menu
            case "结束游戏":
                System.exit(0);
                break;

             //when other button appear. ie buttons for choices
            default:

                choice.setText(e.getActionCommand());
                i++;
                break;

        }



    }








}

