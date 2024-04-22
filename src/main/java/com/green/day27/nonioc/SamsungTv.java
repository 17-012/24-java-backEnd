package com.green.day27.nonioc;


import com.green.day27.Speaker;
import com.green.day27.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv() {
//        speaker = new HarmanSpeaker();
    speaker = new JblSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv : 소리가 난다.");
        speaker.sound();
    }
}