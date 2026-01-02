package com.java.core;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String str = "Akash Anil Khot";

        StringTokenizer tokenizer = new StringTokenizer(str);

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            char [] ch = token.toCharArray();
            StringBuilder rev = new StringBuilder();
            for(int i=0,j=token.length()-1; i<j; i++,j--){
                char ch1 = token.charAt(i);
                ch[i] = ch[j];
                ch[j] = ch1;
            }
            token = new String(ch);
            System.out.println(token);
        }
    }
}
