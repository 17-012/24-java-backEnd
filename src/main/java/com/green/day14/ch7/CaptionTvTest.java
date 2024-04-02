package com.green.day14.ch7;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();

        cTv.channel = 10;
        cTv.power();
        System.out.println(cTv.power);
        cTv.channelUp();
        System.out.println(cTv.channel);
        cTv.channelDown();
        System.out.println(cTv.channel);
        cTv.displayCaption("dddd");
        cTv.caption();
        cTv.displayCaption("test");

    }
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

class videoTv extends Tv {

}

class CaptionTv extends Tv{
    boolean caption;
    void caption(){
        caption = !caption;
    }
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}