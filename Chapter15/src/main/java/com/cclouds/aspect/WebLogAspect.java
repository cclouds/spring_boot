package com.cclouds.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Description:Spring Boot实现AOP
 * 前置通知（Before）：在目标方法被调用之前调用通知功能
 * 后置通知（After）：在目标方法完成之后调用通知，此时不会关心方法的输出是什么
 * 返回通知（After-returning）：在目标方法成功执行之后调用通知
 * 环绕通知（Around）：通知包裹了被通知的方法，在被通知的方法调用之前和调用之后执行自定义的行为
 * 异常通知（After-throwing）：在目标方法抛出异常后调用通知
 * @Order(i)注解来标识切面的优先级
 * 在切入点前的操作，按order的值由小到大执行
 * 在切入点后的操作，按order的值由大到小执行
 *
 * @author cclouds
 * @Date Create on 2017/4/01
 * @since version1.0
 */
@Aspect
@Order(5)
@Component
public class WebLogAspect {

    private Logger logger = Logger.getLogger(getClass());

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.cclouds.web..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

    @After("webLog()")
    public void doAfter(JoinPoint joinPoint){
        System.out.print("后置通知After");
    }

    @AfterThrowing("webLog()")
    public void logAfterThrow(){
        System.out.println("异常通知AfterThrowing");
    }


//    @Around("webLog()")
//    public void logAround(ProceedingJoinPoint jp){
//        try {
//            System.out.println("自定义前置通知Before");
//            jp.proceed();//将控制权交给被通知的方法，也就是执行sayHello方法
//            System.out.println("自定义后置通知After");
//        } catch (Throwable throwable) {
//            System.out.println("异常处理~");
//            throwable.printStackTrace();
//        }
//    }
}

