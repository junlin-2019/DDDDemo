package com.example.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @Description:
 * @Author: admin
 * @Date: 2020/9/28 9:04
 */
@Component
@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    private final static String TRACE_ID = "traceId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String remoteIp = request.getRemoteAddr();
        String traceId = UUID.randomUUID().toString();
        log.info("traceId id:{}, client ip:{}",traceId,remoteIp);
        MDC.put(TRACE_ID,traceId);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        MDC.remove(TRACE_ID);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
