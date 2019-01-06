package 口袋喂鸡.story;

import 口袋喂鸡.Adventure;

import java.util.ArrayList;
import java.util.Arrays;

public class CH1{
    private ArrayList<String> text = new ArrayList<>();
    private ArrayList<String> adv_background = new ArrayList<>();
    private String[][] buttons = new String[50000][10];
    private ArrayList<String> speaker = new ArrayList<>();
    private ArrayList<String> ch1 = new ArrayList<>();
    private ArrayList<String> ch2 = new ArrayList<>();
    private Integer choice=-1;

    private Integer i;//for clearing button array

    public CH1(){


        //blank img path
        //"/口袋喂鸡/images/blank.png"

        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/blank.png");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("一所位于京东都大抱崖区的传统高校“撕鸡♂佬们开心地yooooo养殖基地");

        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/blank.png");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("正因为财政问题而面临着废校的危机。");

        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("其中有一只少年想到一只妙计————成为偶像");

        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("只要他能成为偶像，学校的名气便会增加，然后成为一个有名的濒临破产的高校");


        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("就这样，这个女♂孩♂子决定走上旅途，重建已遭遗忘的四大偶像");


        adv_background.add("/口袋喂鸡/images/darkness!.png");
        ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
        ch2.add("/口袋喂鸡/images/blank.png");
        speaker.add("旁白");
        text.add("要去哪儿拉拢四大偶像的第二名成员呢");


//        adv_background.add("/口袋喂鸡/images/darkness!.png");
//        ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
//        ch2.add("/口袋喂鸡/images/blank.png");
//        speaker.add("旁白");
//        text.add("要去哪儿拉拢四大偶像的第二名成员呢yoooo");
        buttons[6][0] = "choice";
        buttons[6][1] = "看起来很安全的路边草丛";
        buttons[6][2] = "看起来很危险的黑森林";
        buttons[6][3] = "看起来很安逸的梦梦家";













//CH1.setVisible(true);

        Adventure CH1 = new Adventure(text, adv_background, buttons, speaker, ch1, ch2);

        choice = CH1.getN();

        //"看起来很安全的路边草丛"
        if(choice == 0){

            //CH1_1 ch1_1 = new CH1_1();
//            //cleaning up
//            text.clear();
//            adv_background.clear();
//            for(i = 0; i < buttons.length; i++){
//                Arrays.fill(buttons[i], null);
//            }
//            speaker.clear();
//            ch1.clear();
//            ch2.clear();




            adv_background.add("/口袋喂鸡/images/野炮的小情侣.jpg");
            ch1.add("/口袋喂鸡/images/喂鸡001.jpg");
            ch2.add("/口袋喂鸡/images/blank.png");
            speaker.add("旁白");
            text.add("野生哦不野炮的小情侣出现了！");

            buttons[8][0] = "choice";
            buttons[8][1] = "暗中观察";
            buttons[8][2] = "尝试加入";
            buttons[8][3] = "转身离开";





//            Adventure CH1_1 = new Adventure (text, adv_background,buttons, speaker, ch1, ch2);
//            CH1.dispose();
        }


















    }












}
