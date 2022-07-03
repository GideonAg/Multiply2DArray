package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        multiply(array1, array2);

    }

    public static void multiply(int [][] arrayOne, int [][] arrayTwo){
        int [][] answer = new int[arrayOne.length][arrayTwo[0].length];

        if(arrayOne[0].length != arrayTwo.length){
            System.out.println("Multiplication undefined");
        }else {
            for (int row = 0; row < arrayOne.length; row++){
                for (int column = 0; column < arrayTwo[0].length; column++){
                    for (int i = 0; i < arrayOne[0].length; i++){
                        answer[row][column] += arrayOne[row][i] * arrayTwo[i][column];
                    }
                }
            }
        }

        for (int [] row : answer){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
