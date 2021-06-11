package com.scg.annotation;

import java.lang.reflect.Method;

import com.scg.annotation.Message;
import com.scg.annotation.MultivalueAnnotation;

public class MultivalueAnnotationMain
{

    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        Message msg = new Message();
        Method method = msg.getClass().getMethod("displayHi");

        MultivalueAnnotation ma = method.getAnnotation(MultivalueAnnotation.class);

        System.out.println("value is: " + ma.getValue());
        System.out.println("message is: " + ma.getMessage());
        System.out.println("DoubleValue is: " + ma.getDoubleValue());

    }
}