package level.level1;

import java.util.Scanner;

public class Main2 {

<<<<<<< HEAD
    public static void main(String[] args){
=======
    public static void main(String[] args){ 
        
>>>>>>> f2a97924e2a19f5338474f189aec3b33d9dd1263
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
<<<<<<< HEAD
}
=======
}
>>>>>>> f2a97924e2a19f5338474f189aec3b33d9dd1263
