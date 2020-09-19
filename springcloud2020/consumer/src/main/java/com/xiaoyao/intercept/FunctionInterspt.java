package com.xiaoyao.intercept;

import com.xiaoyao.Function;
import jdk.net.SocketFlow;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author liulei
 * @date 2020/9/19
 */
public class FunctionInterspt implements HandlerInterceptor {

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        Function annotation = method.getAnnotation(Function.class);
        if (annotation == null) {
            return true;
        }
        String current = annotation.value();

        String expect = request.getParameter("function");

        if (current.equals(expect)) {
            return true;
        } else {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("没有访问权限！");
            return false;
        }

    }
}
