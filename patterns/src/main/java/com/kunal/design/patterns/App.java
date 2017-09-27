package com.kunal.design.patterns;

import com.kunal.design.patterns.singleton.SingleTonClassic;
import com.kunal.design.patterns.singleton.SingletonEnum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SingleTonClassic classicSingleTon = SingleTonClassic.getInstance();
        System.out.println(classicSingleTon.getInstanceCount());
        
        SingleTonClassic classicSingleTon1 = SingleTonClassic.getInstance();
        System.out.println(classicSingleTon1.getInstanceCount());
        
        SingleTonClassic classicSingleTon2 = SingleTonClassic.getInstance();
        System.out.println(classicSingleTon2.getInstanceCount());
        
        
        
        SingletonEnum singleton = SingletonEnum.LOGGERINSTANCE;
        singleton.setInstanceVariable(1);
        singleton.printDB("Kunal");
        
        SingletonEnum singleton2 = SingletonEnum.LOGGERINSTANCE;
        singleton2.setInstanceVariable(0);
        singleton2.printDB("Kunal");
        
    }
}
