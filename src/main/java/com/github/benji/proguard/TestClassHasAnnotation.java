package com.github.benji.proguard;

import java.lang.annotation.Annotation;

public class TestClassHasAnnotation {

	public static void main(String[] args) throws Exception {
		String className = TheAnnotatedClass.class.getName();
		System.out.println("Class name: " + className);

		Class c = Class.forName(className);
		Annotation[] annotations = c.getDeclaredAnnotations();

		if (annotations.length == 0) {
			System.out.println("No annotation found on class " + className);
		} else {
			for (Annotation an : annotations) {
				System.out.println("Annotation found: " + an.annotationType().getName());
			}
		}
	}

}
