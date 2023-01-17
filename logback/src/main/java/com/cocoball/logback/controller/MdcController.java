package com.cocoball.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MdcController {

    /**
     * MDC : 멀티쓰레드 환경에서 로그를 남길 때 사용하는 개념
     */

    @GetMapping("/mdc")
    public String mdc() {

        // put-clear를 페어로 사용

        MDC.put("job", "dev"); // key-value로 저장됨

        log.trace("log -> TRACE");
        log.debug("log -> DEBUG");
        log.info("log -> INFO");
        log.warn("log -> WARN");
        log.error("log -> ERROR");

        MDC.clear();

        return "mdc";
    }
}
