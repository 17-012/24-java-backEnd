package com.green.day27.nonioc;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class JblSpeaker implements Speaker {
    private Woofer woofer;

    public JblSpeaker() {
        woofer = new MartenWoofer();
    }

    @Override
    public void sound() {
        System.out.println("Jbl Speaker : 소리가 깔끔하다.");
        woofer.soundBase();
    }
}
