package com.phangji.houseutils.policy;

import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;

/**
 * @author akaydg77
 * <p>
 * 가격이 특정 범위일 때 상한효율과 상한금액을 가지는 클래스
 */
@AllArgsConstructor
public class BrokerageRule {

    private Double brokeragePercent;

    @Nullable
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
