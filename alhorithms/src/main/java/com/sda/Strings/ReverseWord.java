package com.sda.Strings;

public class ReverseWord {


    public String reverse(String word) {


        return new StringBuilder(word).reverse().toString();
    }



    //przypisanie do znaków, potem wykorzystanie pętli od tyłu i przypisanie znaków do stringbuilder.
    public String reverseWithIf(String word){

        StringBuilder stringBuilder = new StringBuilder();
        char[]chars =  word.toCharArray();

        for(int i = chars.length; i >= 0; i --){
            stringBuilder.append(chars[i]);
        }


        return stringBuilder.toString();
    }

}



