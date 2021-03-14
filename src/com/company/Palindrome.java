package com.company;

public class Palindrome {
    public static String reverseString(String t){ // получает строку, возвращает перевернутую
        String nov = "";
        for(int n = 0; n < t.length();n++) {
            nov = t.charAt(n) + nov;
        }
        return nov;
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        for(int i = 0; i < args.length; i++) {
            String s = args[i];
            if (s.equals(reverseString(s))) { //сравнивает все слова в строке с их перевернутыми версиями
                System.out.println("палиндром ");
            }
            else {
                System.out.println("нет ");
            }
        }
    }
}
