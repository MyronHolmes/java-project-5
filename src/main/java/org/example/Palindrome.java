package org.example;

public class Palindrome {
    public static boolean checkPalin(String abc){
        StringBuilder stringNoPunctuation = new StringBuilder(abc.length());
        String lowerCase = abc.toLowerCase();

        for ( int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
            }
        }

        String copy1 = stringNoPunctuation.toString();
        StringBuilder reverseString = new StringBuilder(stringNoPunctuation.reverse());
        String copy2 = reverseString.toString();


        if (copy1.equals(copy2)){
            return true;
        }else {
            return false;

        }
    }

    public static void main(String[] args){

        System.out.println("Output: " + checkPalin("I did, did i?"));
        System.out.println("Output: " + checkPalin("abccba"));
        System.out.println("Output: " + checkPalin("Was it a car or a Cat I saW"));
        System.out.println("Output: " + checkPalin("Don't nod"));
        System.out.println("Output: " + checkPalin("hello"));

    }
}

