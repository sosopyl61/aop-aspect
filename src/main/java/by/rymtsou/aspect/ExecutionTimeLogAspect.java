package by.rymtsou.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeLogAspect {

    @Around("execution(* by.rymtsou..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        if (executionTime > 1000) {
            System.out.printf("Method %s worked %d ms.\n", joinPoint.getSignature(), executionTime);
        }
        return result;
    }

    @Around("@annotation(by.rymtsou.annotation.LogAnnotation)")
    public Object logAnnotationExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        System.out.printf("Method %s worked %d ms.\n", joinPoint.getSignature(), executionTime);
        return result;
    }
}
