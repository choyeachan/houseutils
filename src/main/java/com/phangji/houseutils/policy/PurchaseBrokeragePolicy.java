package com.phangji.houseutils.policy;

/**
 * @author akaydg77
 *
 * 매매일 때 중개수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy implements  BrokeragePolicy{
    public BrokerageRule createBrokerageRule(Long price){
        BrokerageRule rule;
        if(price < 50_000_000){
            rule= new BrokerageRule(0.6,250_000L);
        } else if(price < 200_000_000){
            rule= new BrokerageRule(0.5,850_000L);
        } else if(price < 600_000_000){
            rule= new BrokerageRule(0.6,null);
        } else if(price < 900_000_000){
            rule= new BrokerageRule(0.5,null);
        } else {
            rule= new BrokerageRule(0.9,null);
        }
        return rule;
    }
}
