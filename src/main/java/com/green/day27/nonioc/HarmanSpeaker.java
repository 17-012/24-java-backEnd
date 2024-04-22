package com.green.day27.nonioc;


import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }

    @Override
    public void sound() {
        System.out.println("Harman Speaker : 소리가 웅장하다.");
        woofer.soundBase();
    }
}
