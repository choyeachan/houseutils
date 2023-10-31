package com.phangji.houseutils.controller;

import com.phangji.houseutils.constants.ActionType;
import com.phangji.houseutils.policy.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.phangji.houseutils.controller
 * fileName       : BrokerageQueryController
 * author         : akaydg77
 * date           : 2023-10-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-31        akaydg77       최초 생성
 */
@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {

        // TODO : 중개수수료 계산하는 로직
        BrokeragePolicy policy = BrokerPolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
