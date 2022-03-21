package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};

        int number = index(arr, 32);

        int count = 0;
        for (int i = number + 1; i < arr.length; i++) {
            if (arr[number] == arr[i]) {
                count++;
            }
        }

        int bigBooks = (arr.length - 1) - number - count;
        System.out.println("Только " + bigBooks + " книги на полке строго больше " + arr[number] + " страниц!");
    }


        public static int index ( int[] arr, int elementToFind){
            int startIndex = 0;
            int endIndex = arr.length - 1;
            int middleIndex;

            while (startIndex <= endIndex) {
                middleIndex = startIndex + (endIndex - startIndex) / 2;
                if (arr[middleIndex] == elementToFind) {
                    return middleIndex;
                }
                if (arr[middleIndex] > elementToFind) {
                    endIndex = middleIndex - 1;
                } else {
                    startIndex = middleIndex + 1;
                }
            }
            return -1;
        }
    }

