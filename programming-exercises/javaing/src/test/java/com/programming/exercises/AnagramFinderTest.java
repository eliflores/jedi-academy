package com.programming.exercises;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class AnagramFinderTest {
    @Test
    public void areAnagrams() throws Exception {
        AnagramFinder anagramFinder = new AnagramFinderImpl();
        assertTrue(anagramFinder.areAnagrams("postmaster", "stamp store"));
        assertTrue(anagramFinder.areAnagrams("a telescope", "to see place"));
        assertTrue(anagramFinder.areAnagrams("ZZYZX", "X Y ZZZ"));
        assertTrue(anagramFinder.areAnagrams("toto", "OTOT"));
        assertFalse(anagramFinder.areAnagrams("toto", "abc"));
        assertFalse(anagramFinder.areAnagrams("toto", "otxo"));
        assertFalse(anagramFinder.areAnagrams("otxo", "toto"));
        assertFalse(anagramFinder.areAnagrams("oto", "toto"));
    }
}
