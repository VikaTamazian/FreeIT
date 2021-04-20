package com.homework6.tasks.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyServiceAnnotationProcessor {

    public void process(Class<MyService> myClass) throws Exception {
        boolean annotationPresent = myClass.isAnnotationPresent(Version.class);
        if (annotationPresent) {
            System.out.println("Annotation detected.");
            Version annotation = myClass.getAnnotation(Version.class);
            System.out.println("annotation version is " + annotation.version());
            System.out.println("annotation name is " + annotation.name());
            System.out.println("annotation isActive: " + annotation.isActive());

            Constructor<MyService> constructor = myClass.getConstructor(String.class, String.class);
            MyService toffee = constructor.newInstance("1.7.2", "Toffee");
            System.out.println("My service version is " + toffee.getVersion());
            System.out.println("My service name is " + toffee.getName());

            if (annotation.isActive()) {
                printData(myClass, toffee);
            }

        } else {
            System.out.println("Annotation not detected.");
        }
    }

    public static void printData(Class<MyService> myClass, MyService toffee) throws Exception {
        Method thisClassInfo = myClass.getDeclaredMethod("thisClassInfo");
        thisClassInfo.setAccessible(true);
        thisClassInfo.invoke(toffee);
    }
}



