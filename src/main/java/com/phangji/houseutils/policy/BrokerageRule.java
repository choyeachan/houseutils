package com.phangji.houseutils.policy;

import lombok.AllArgsConstructor;

/**
 * packageName    : com.phangji.houseutils.policy
 * fileName       : BrokerageRule
 * author         : akaydg77
 * date           : 2023-10-31
 * description    : 가격이 특정범위일 때 상한효율과 상한 금액을 가지는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-31        akaydg77       최초 생성
 */
@AllArgsConstructor
public class BrokerageRule {

    private Double brokeragePercent;
    private Long limitAmout;

    public Long calcMaxBrokerage(Long price) {
        if (limitAmout == null) {
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmout);
    }

    private Long multiplyPercent(Long price) {
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
}
