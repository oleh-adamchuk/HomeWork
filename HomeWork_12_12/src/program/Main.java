package program;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        ClassTest classTest = new ClassTest();
        Class clss = classTest.getClass();
        System.out.println("Class name: " + clss.getName());

        System.out.println();
        System.out.println("Constructors: ");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println("Constructor name: " + constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println("Parameter: " + parameter.getName());
                System.out.println("Constructor typ: " + parameter.getType().getName());
            }
        }
        System.out.println();
        System.out.println("Methods: ");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("Method name: " + method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println("Parameter: " + parameter.getName());
                System.out.println("Method typ: " + parameter.getType().getName());
            }
            System.out.println("Modifier: " + Modifier.toString(method.getModifiers()));
            System.out.println("Return: " + method.getReturnType().getName());
            method.setAccessible(true);
            method.invoke(classTest, "World");
        }
        System.out.println();
        System.out.println("Fields: ");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Field name: " + field.getName());
            System.out.println("Field typ: " + field.getType().getName());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            field.setAccessible(true);
            System.out.println(field.getInt(classTest));
            field.setInt(classTest, 5);
            System.out.println(field.getInt(classTest));
        }
    }

}
