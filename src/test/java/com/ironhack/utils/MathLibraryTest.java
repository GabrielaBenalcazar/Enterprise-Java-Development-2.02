package com.ironhack.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {


    @Test
    void allNumbers_n() {
        MathLibrary mathLibrary= new MathLibrary();
        int n = 7;
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6},mathLibrary.allNumbers(n));
    }
}