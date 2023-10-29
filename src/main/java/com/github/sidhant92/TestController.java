package com.github.sidhant92;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

@Controller ("/api/v1/test")
@Slf4j
public class TestController {
    @Get ("/")
    public String test() {
        log.info("Thread Sleeping");
        try {
            Thread.sleep(15000);
        } catch (final Exception ex) {
            log.error("exception occurred", ex);
        }
        return "hello world";
    }
}
