package com.codementor;

import org.junit.jupiter.api.Test;
import org.objenesis.instantiator.sun.UnsafeFactoryInstantiator;
import sun.misc.Unsafe;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SampleTest {

    @Test
    public void asdf() {
        UnsafeFactoryInstantiator<String> factory = new UnsafeFactoryInstantiator<String>(String.class);
        String asdf = factory.newInstance();
        assertTrue(false);
    }
}