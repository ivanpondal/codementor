package com.codementor;

import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;
import sun.security.x509.X500Name;

import javax.transaction.InvalidTransactionException;
import java.io.IOException;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SampleTest {

    @Test
    public void testTautology() {
        assertTrue(true);
    }


    @Test
    public void testX500NameDenyIllegalAccess() throws IOException {
        new X500Name("test");

        assertTrue(true);
    }

    @Test
    public void testX500NameFixed() throws IOException {
        new X500Name("test");

        assertTrue(true);
    }

    /**
     * java --describe-module jdk.unsupported
     * exports com.sun.nio.file
     * exports sun.misc
     * exports sun.reflect
     * requires java.base mandated
     * opens sun.reflect
     * opens sun.misc
     */
    @Test
    public void testUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        unsafe.addressSize();

        assertTrue(true);
    }

//    @Test
//    public void testJavaEE() throws InvalidTransactionException {
//        InvalidTransactionException exception = new InvalidTransactionException();
//
//        throw exception;
//    }
}