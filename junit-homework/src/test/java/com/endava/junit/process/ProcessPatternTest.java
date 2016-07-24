package com.endava.junit.process;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ddragan on 7/22/2016.
 */
public class ProcessPatternTest {
    ProcessPattern pp;

    @Before
    public void setUp() throws Exception {
        pp = new ProcessPattern();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void testJuniorDeveloper() throws Exception {
        String res = pp.generatePosition("junior", 3);
        Assert.assertEquals("Test Junior Developer", "Junior Developer", res);
    }

    @Test
    public void testDeveloper1() throws Exception {
        String res = pp.generatePosition("middle", 1);
        Assert.assertEquals("Test Developer 1", "Developer 1", res);
    }

    @Test
    public void testDeveloper2() throws Exception {
        String res = pp.generatePosition("middle", 3);
        Assert.assertEquals("Test Developer 2", "Developer 2", res);
    }

    @Test
    public void testSenior1() throws Exception {
        String res = pp.generatePosition("senior", 3);
        Assert.assertEquals("Test Senior 1", "Senior 1", res);
    }

    @Test
    public void testSenior2() throws Exception {
        String res = pp.generatePosition("senior", 7);
        Assert.assertEquals("Test Senior 2", "Senior 2", res);
    }

    @Test
    public void testUnknownPosition() throws Exception {
        String res = pp.generatePosition("unknown position", 3);
        Assert.assertEquals("Test Unknown Position", "Unknown Position", res);
    }


    @Test
    public void testNullGrade() throws Exception {
        String res = pp.generatePosition(null, 3);
        Assert.assertEquals("Test Null Grade", null, res);
    }
}