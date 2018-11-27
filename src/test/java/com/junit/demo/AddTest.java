package com.junit.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AddTest {
    @Test
    public void testAdd() {
        //fail("Not yet implemented");
        int  z = new Add().add(3, 5);
        //assertEquals(5, z);
        assertTrue("z is too small",z>6);
        assertThat(z, is(9));
    }
}
