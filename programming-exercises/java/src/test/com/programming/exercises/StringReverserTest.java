package com.programming.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserTest {
    @Test
    public void testReverse() throws Exception {
        StringReverser stringReverser = new StringReverserImpl();
        char[] charArray = {'a', 'b', 'c', 'd'};
        stringReverser.reverse(charArray);
        assertEquals("dcba", new String(charArray));
    }

    @Test
    public void testReverseWords() throws Exception {
        StringReverser stringReverser = new StringReverserImpl();
        String myName = "elizabeth flores";
        char[] charArray = myName.toCharArray();
        stringReverser.reverseWords(charArray);
        assertEquals("flores elizabeth", new String(charArray));
    }
}
