package org.example;


public class Main {
    public static void main(String[] args) {
        VowelCounter vowelCounter = new VowelCounterLogic();

        String text1 = "hello";
        String text2 = "I love testing";

        System.out.println(vowelCounter.countVowel(text1));
        System.out.println(vowelCounter.countVowel(text2));






        SymbolReplacer replacer = new SymbolReplacer();

        String text3 = "lela";
        String text4 = "Gabelaia";

        System.out.println(replacer.replaceSymbolA(text3));
        System.out.println( replacer.replaceSymbolB(text4));



                int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};


                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {

                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }


                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    if (i < arr.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }



