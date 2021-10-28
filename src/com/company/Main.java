package com.company;

import java.util.Scanner;

public class Main {

    static String str = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        ////////////////////1///////////////////////////

        String[] strArray = str.split("_");
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i = 0; i < strArray.length - 1; i++) {
            stringBuilder1.append(strArray[i]).append("_");

        }
        stringBuilder1.deleteCharAt(stringBuilder1.length() - 1);

        System.out.println("1: " + stringBuilder1);


        ///////////////////2////////////////////
        String[] result4 = str.split("_");;
        int wordLength = result4[1].length();
        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < wordLength; i++)
        {
            stringBuilder2.append("#");
        }

        result4[1] = stringBuilder2.toString();

        stringBuilder1 = new StringBuilder();
        for (int i = 0; i < result4.length; i++) {
            stringBuilder1.append(result4[i]).append("_");

        }
        stringBuilder1.deleteCharAt(stringBuilder1.length() - 1);

        System.out.println("2: " + stringBuilder1);


        ////////////////3//////////////////////////

        stringBuilder1 = new StringBuilder(str);
        stringBuilder1.deleteCharAt(7);

        System.out.println("3: " + stringBuilder1);


        ///////////////////4//////////////////

        stringBuilder1 = new StringBuilder(strArray[2]);
        char first_sym = Character.toLowerCase(stringBuilder1.charAt(0));
        stringBuilder1.deleteCharAt(0);

        System.out.println("4: " + first_sym + stringBuilder1);


        ///////////////////5//////////////////////

        stringBuilder1 = new StringBuilder(strArray[strArray.length-1]);
        stringBuilder1.reverse();

        System.out.println("5: " + stringBuilder1);



        /////////////////6////////////////////////
        stringBuilder1 = new StringBuilder(strArray[2]);

        for (int i =0; i < 10; i ++)
        {
            int lastSymIndex = stringBuilder1.length() - 1;
            char lastSym = stringBuilder1.charAt(lastSymIndex);
            stringBuilder1.deleteCharAt(lastSymIndex);
            stringBuilder1.reverse();
            stringBuilder1.append(lastSym);
            stringBuilder1.reverse();

        }

        System.out.println("6: " + stringBuilder1);




        ///////////////////////////////7/////////////////////////

        String[] resultArray6 = str.split("_");;

        for (int i = 0; i < strArray.length; i++)
        {
            if (i%2 == 0)
            {
                stringBuilder1 = new StringBuilder(resultArray6[i]);
                char firstSym = Character.toLowerCase(stringBuilder1.charAt(0));
                stringBuilder1.deleteCharAt(0);
                stringBuilder1.reverse();
                stringBuilder1.append(firstSym);
                stringBuilder1.reverse();

                resultArray6[i] = stringBuilder1.toString();
            }
        }

        StringBuilder result6 = new StringBuilder();
        for (String s : resultArray6)
        {
            result6.append(s).append("_");
        }

        result6.deleteCharAt(result6.length()-1);

        System.out.println("7: " + result6);

    }
}
