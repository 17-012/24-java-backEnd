package com.green.day27.ioc;

import com.green.day27.Tv;

public class TvTest {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();

        String tvName = "apple";
        String speakerName = "genelec";
        String wooferName = "marten";

        Tv tv = tvFactory.factory(tvName,speakerName,wooferName);
        tv.sound();

    }
}
