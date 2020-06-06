package com.wood.wood.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLambda表达式 {
    public static void main(String[] args) {
        //ArrayList list =new ArrayList();
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e +"aaa") );

        //List<String> list = Arrays.asList( "a", "b", "g","d" );
        //for(String e:list){
        //System.out.println(e+"有");
        //}
    }
}
