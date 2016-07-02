package com.cookie.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        
        List<Integer> bigData = Filter.filter(data, (Integer i ) -> i > 2 );
        
        System.out.println(bigData);
    }
}
