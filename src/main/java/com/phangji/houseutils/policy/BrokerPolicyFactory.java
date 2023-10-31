package com.phangji.houseutils.policy;

import com.phangji.houseutils.constants.ActionType;

/**
 * packageName    : com.phangji.houseutils.policy
 * fileName       : BrokerPolicyFactory
 * author         : akaydg77
 * date           : 2023-10-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-31        akaydg77       최초 생성
 */
public class BrokerPolicyFactory {
    public static BrokeragePolicy of(ActionType actionType){
        switch (actionType){
            case RENT : return new RentBrokeragePolicy();
            case PURCHASE : return new PurchaseBrokeragePolicy();
            default : throw new IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
