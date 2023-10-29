package com.github.sidhant92;

import static io.micronaut.http.annotation.Filter.MATCH_ALL_PATTERN;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.MDC;
import io.micronaut.context.annotation.Value;
import io.micronaut.core.propagation.MutablePropagatedContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.RequestFilter;
import io.micronaut.http.annotation.ResponseFilter;
import io.micronaut.http.annotation.ServerFilter;
import lombok.extern.slf4j.Slf4j;

@ServerFilter (MATCH_ALL_PATTERN)
@Slf4j
public class LogFilter {
    @RequestFilter
    public void myRequestFilter(HttpRequest<?> request, MutablePropagatedContext mutablePropagatedContext) {
        log.info("Request Started");
    }

    @ResponseFilter
    public void doFilter(final HttpRequest<?> request, final MutableHttpResponse<?> mutableHttpResponse) {
        log.info("Request Ended");
    }
}
