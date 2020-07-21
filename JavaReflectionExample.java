package mj.programs.java8_Practice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
 }

public class JavaReflectionExample {
    public static void main(String[] args){
        Class<Employee> student =Employee.class;
       
        Method[] methods = student.getMethods();
        List<String> methodList =  Arrays.stream(methods).map(Method::getName).collect(Collectors.toList());
        List<Integer> modifierList =  Arrays.stream(methods).map(Method::getModifiers).collect(Collectors.toList());
       
        /* for(Method mthd : methods){
            methodList.add(mthd.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.print(name);
        }*/
        System.out.println("Method Names ---> ");
        methodList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("Mdifiers Names ---> ");
        modifierList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

    }

}