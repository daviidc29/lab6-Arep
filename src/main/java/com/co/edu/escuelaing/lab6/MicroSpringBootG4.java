package com.co.edu.escuelaing.lab6;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class MicroSpringBootG4 {
    public static void main(String[] args)  throws ClassNotFoundException{
        static Map<String, Method> controllerMethods = new HashMap<>();
        System.out.println("Load comments ...");

        Class c = Class.forName(args[0]);

        if (c.isAnnotationPresent(RestController.class)) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.isAnnotationPresent(GetMapping.class)) {
                    GetMapping a = m.getAnnotation(GetMapping.class);
                    String path = a.value();
                    controllerMethods.put(path, m);
                }
            }
        }
        System.out.println("Invoking method for path: " + args[1]);

        Method m = controllerMethods.get(args[1]);
        System.out.println(m.invoke(null));
    }
}
