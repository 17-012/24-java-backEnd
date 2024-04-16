package com.green.day23;

// VO = Value Object
public class BuySelVo {
    private String memId;
    private int buyCount;

    @Override
    public String toString() {
        return "BuySelVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}' + '\n';
    }

    public BuySelVo(String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }
}