package com.example.securitydemo;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class SimpleTest {

	// PrePostAnnotationSecurityMetadataSource 
	// private <A extends Annotation> A findAnnotation(Method method, Class<?> targetClass,	Class<A> annotationClass) {
	// trying to find the @PreAuthorize
	@Test
	void getMostSpecificMethodWorks() throws Exception {
		// public abstract java.lang.String com.example.securitydemo.IEntityService.methodWithParameter(java.lang.Object)
		// DemoService.class
		Method method = IEntityService.class.getMethod("methodWithParameter", Object.class);
		Class<?> targetClass = DemoService.class;
		
//		Method result = ClassUtils.getMostSpecificMethod(method, targetClass);
		Method result = targetClass.getMethod(method.getName(), method.getParameterTypes());
		
		assertThat(result.getDeclaringClass()).isEqualTo(DemoService.class);
	}
}
