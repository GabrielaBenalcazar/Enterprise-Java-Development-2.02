package com.ironhack.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyWordsTest {

    @Test
    void isKeyWord_singleWord() {
        KeyWords keyWords=new KeyWords();
        String words1 = "Gaby is great";
        String words2 = "this is a boolean";
        assertFalse(keyWords.isKeyWord(words1));
        assertTrue(keyWords.isKeyWord(words2));
    }

}