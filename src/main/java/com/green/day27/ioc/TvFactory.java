package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    //싱글톤 ( SingleTon ) 패턴
    private static TvFactory tvFactory;

    public static TvFactory getInstance() {
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    //외부 객체화 방지
    private TvFactory() {
    }

    public Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        Tv tv = switch (tvName) {
            case "lg" -> new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;
        };
        return tv;
    }
}