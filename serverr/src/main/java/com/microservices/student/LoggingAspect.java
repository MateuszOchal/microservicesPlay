package com.microservices.student;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//
//@Aspect
//@Component
//public class LoggingAspect {
//    @Before("execution(* com.example.blabla.demo.com.microservices.com.microservices.student.StudentController.addStudent(..))")
//    public void before(){
//        System.out.println("Super before Request Received");
//    }
//@Around("execution(* com.example.blabla.demo.com.microservices.com.microservices.student.StudentController.addStudent(..))")
//    public Object addStudentAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
//    System.out.println("::Post Method Request Received::");
//    Object proceed = joinPoint.proceed();
//    System.out.println("::Post Method Request Accepted::");
//    return proceed;
//}
//    @After("execution(* com.example.blabla.demo.com.microservices.com.microservices.student.StudentController.addStudent(..))")
//    public void after(){
//        System.out.println("Super after Request Received");
//    }
//}
