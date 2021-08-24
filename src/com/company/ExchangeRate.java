package com.company;

public class ExchangeRate {
    /*
    AMD$USD -- USD$AMD -- AMD$RUR -- RUR$AMD -- AMD$EUR -- EUR$AMD
    RUR$EUR -- EUR$RUR -- RUR$USD -- USD$RUR -- EUR$USD -- USD$EUR
     */
    public static float AMD$USD(float amd){
        float value = 494.5F;
        float usd =amd/value;
        return usd;
    }
    public static float USD$AMD(float usd){
        float value = 486.5F;
        float amd =value*usd;
        return amd;
    }

    public static float AMD$RUR(float amd){
        float value = 6.75F;
        float rur =amd/value;
        return rur;
    }
    public static float RUR$AMD(float rur){
        float value = 6.5F;
        float amd =value*rur;
        return amd;
    }

    public static float AMD$EUR(float amd){
        float value = 580;
        float eur =amd/value;
        return eur;
    }
    public static float EUR$AMD(float eur){
        float value = 565.5F;
        float amd =value*eur;
        return amd;
    }
    public static float RUR$EUR(float rur){
        float value = 83.5F;
        float eur =rur/value;
        return eur;
    }
    public static float EUR$RUR(float eur){
        float value = 83.1F;
        float rur =value*eur;
        return rur;
    }
    public static float RUR$USD(float rur){
        float value = 72.5F;
        float usd =rur/value;
        return usd;
    }
    public static float USD$RUR(float usd){
        float value = 71.4F;
        float rur =value*usd;
        return rur;
    }
    public static float EUR$USD(float eur){
        float value = 1.15F;
        float usd =eur/value;
        return usd;
    }
    public static float USD$EUR(float usd){
        float value = 1.14F;
        float eur =value*usd;
        return eur;
    }


}
