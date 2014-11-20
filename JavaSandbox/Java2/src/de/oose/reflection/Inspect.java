package de.oose.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspect {

	public static void main(String[] args) throws Exception {
		// get class
		Class<?> clazz = Fussballfan.class;
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getSimpleName());
		
		// instanciate
		Fussballfan fan = (Fussballfan) Class.forName("de.oose.reflection.Fussballfan").newInstance();
		fan.verein = "Pauli";
		fan.schlachtruf();
		
		// inspect
		Class[] interfaces = clazz.getInterfaces();
		for (Class<?> interface1 : interfaces) {
			System.out.println(interface1);
		}
		
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}

		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		// invoke
		Method methode = clazz.getDeclaredMethod("schlachtruf", null);
		methode.invoke(fan, null);
		
		methode = clazz.getDeclaredMethod("geheimnis", null);
		methode.setAccessible(true);
		methode.invoke(fan, null);
		
		

	}

}
