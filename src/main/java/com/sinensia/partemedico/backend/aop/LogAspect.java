package com.sinensia.partemedico.backend.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	private Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Before("execution(* com.sinensia.partemedico.business.services.impl..*(..))")
	public void advices1() {
		logger.info("Ejecutamos método de business");	
	}
	
	@Before("execution(* com.sinensia.partemedico.presentation..*.*(..))")
	public void advices2args(JoinPoint joinPoint) {
		
		Object[] joinPointArgs = joinPoint.getArgs();
		
		for (Object joinPointArg : joinPointArgs) {
			logger.info(joinPointArg.toString());
		}
	}
	
	@AfterReturning(pointcut = "execution(* com.sinensia.partemedico.presentation..*.*(..))", returning = "returnValue")
	public void advices2return(Object returnValue) {
		
		logger.info(returnValue.toString());
	}

	@Before("execution(* com.sinensia.partemedico.integration..*.*(..))")
	public void advices3() {
		
	}
}

//TODO

	//Advices de creación de logs (INFO) para todos los métodos de la capa de business. Añadir información del método que ha devuelto el logger
	// Advices de creación de logs (INFO) para todos los end-points de los controladores REST. Quiero saber qué parámetros entran y qué objetos devuelven dichos end-points	
	// Advices de creación de logs (INFO) para todos los métodos de la capa de integración. (interceptamos métodos de interfaces)