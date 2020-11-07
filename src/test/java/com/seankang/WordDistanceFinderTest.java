package com.seankang;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class WordDistanceFinderTest {

    @Test
    void test1() {
        WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
        assert(finder.distance("fox", "the") == 3);
        assert(finder.distance("quick", "fox") == 1);
    }
}
