package mini.movie;

import java.util.Scanner;

public class movieseats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int size[][] = new int[10][8];
		// 배열 초기화
		for (int i = 0; i < size.length; i++) {
			for (int j = 0; j < size[i].length; j++) {
				size[i][j] = 0;
				System.out.print(size[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		// 총 좌석수를 의미하는 count 변수
		int count = size.length * size[0].length;
		while (true) {
			// count가 0이면 더 이상 좌석이 없는 것
			if (count == 0) {
				System.out.println("더 이상 좌석이 없습니다.");
				break;
			}
			System.out.print("예약할 좌석의 번호를 입력하세요((1~10) (1~8))(종료 -1) : ");
			a = sc.nextInt();
			b = sc.nextInt();
			if ((a | b) == -1) {
				System.out.print("프로그램 종료!!!");
				break;
			}
			/*
			 * do { System.out.println("잘못된 입력입니다!!!");
			 * System.out.print("예약할 좌석의 번호를 입력하세요((1~10) (1~8))(종료 -1) : "); a =
			 * sc.nextInt(); b = sc.nextInt(); } while(!(a < 1 || b <= 1) || (a > 10 || b >
			 * 10));
			 */
			System.out.println("count = " + count);
			if (size[a - 1][b - 1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
			} else {
				// 예약이 되면 해당 좌석에 1을 넣고 count를 -1 해준다.
				size[a - 1][b - 1] = 1;
				count--;
			}

			for (int i = 0; i < size.length; i++) {
				for (int j = 0; j < size[i].length; j++) {
					System.out.print(size[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
