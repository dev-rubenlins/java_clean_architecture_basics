package br.dev.rubenlins.clean_architecture.basics;

import java.lang.reflect.InvocationTargetException;

public class ReflectionUtils {

    public static <T extends Object> T newInstance(Class<T> clazz){
        try {
            return clazz
                    .getDeclaredConstructor(null)
                    .newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}
