package com.endava.junit.process;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ddragan on 7/24/2016.
 */
public class SplitPatternTest {
    SplitPattern sp = null;

    @Before
    public void setUp() {
        sp = new SplitPattern();
        System.out.println("setUp");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void testSmall() {
        String s = sp.getStringLength("ana");
        Assert.assertEquals("Test small", "small", s);
    }


    @Test
    public void testMedium() {
        String s = sp.getStringLength("crocodil");
        Assert.assertEquals("Test medium", "medium", s);
    }


    @Test
    public void testLong() {
        String s = sp.getStringLength("anashcbjshckjsdacjsbdkcjhDBKCJHASBJHDBCJHDBCAJB");
        Assert.assertEquals("Test long", "long", s);
    }


    @Test
    public void testNull() {
        String s = sp.getStringLength(null);
        Assert.assertEquals("Test small", null, s);
    }


    @Test
    public void testSplitByLength() {
        List<String> in = new ArrayList<String>();
        in.add("ana");
        in.add("mere si pere");
        in.add("capsuni");
        List<String> st = sp.splitByLength(in);

        Assert.assertEquals("Test split by length", 3, st.size());
    }
}
