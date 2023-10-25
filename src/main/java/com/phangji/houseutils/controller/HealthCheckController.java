package com.phangji.houseutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.phangji.houseutils.controller
 * fileName       : HealthCheckController
 * author         : akaydg77
 * date           : 2023-10-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-26        akaydg77       최초 생성
 */
@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String ping(){
        return "ok";
    }

}
