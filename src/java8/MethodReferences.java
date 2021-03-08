package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReferences {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,33,43,39,234);
        list.forEach(System.out::println);
        MethodReferences methodReferences = new MethodReferences();
        Myinterface3 myinterface3 = methodReferences::display;
        System.out.println(myinterface3.msg());

        BiFunction<Integer,Integer,Integer> addition =Myinterface4::add;
        int i=addition.apply(2,3);
        System.out.println(i);


    }

    private String display(){
        return "Hiii";
    }
}
@FunctionalInterface
interface Myinterface3{
    String msg();
}

interface Myinterface4{
    public static int add(int i,int j){
        return i+j;
    }
}
