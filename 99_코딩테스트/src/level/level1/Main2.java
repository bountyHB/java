package level.level1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){ 
        
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int count = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int value : arr) {
            count++;

            if(value>max){
                max = value;
                index = count;
            }
        }

//        for(int i=0; i<9; i++) {
//            if(arr[i]>max) {
//                max = arr[i];
//                index = i+1;
//            }
//        }

        System.out.printf(max + "\n" + index);
    }
}
