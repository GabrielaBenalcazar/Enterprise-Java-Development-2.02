package com.ironhack.utils;

import javax.lang.model.SourceVersion;

public class KeyWords {
    public boolean isKeyWord(String sentence){
        String[] separatedStrings = sentence.split(" ");
        boolean isTrue = false;
        for (String word : separatedStrings){
            if (SourceVersion.isKeyword(word))
                isTrue = true;
        }
        return  isTrue;

    }
}
