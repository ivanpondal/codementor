package com.codementor;

import org.objenesis.instantiator.sun.UnsafeFactoryInstantiator;
import sun.misc.Unsafe;
import sun.security.x509.X500Name;

import java.io.IOException;
import java.lang.reflect.Field;

public class Sample {
    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException, IOException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        unsafe.addressSize();

        new X500Name("dafg");

        UnsafeFactoryInstantiator<String> factory = new UnsafeFactoryInstantiator<String>(String.class);
        String asdf = factory.newInstance();
        System.out.println(asdf);
    }
}
