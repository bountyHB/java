package collection;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeeMap {

	public static void main(String[] args) {
TreeMap<Integer,String> boxOffice = new TreeMap<>();
		
		boxOffice.put(1, "닥터 스트레인지 : 대혼돈의 멀티버스");
		boxOffice.put(2, "배드 가이즈");
		boxOffice.put(5, "신비한 동물들과 덤블도어의 비밀");
		boxOffice.put(3, "극장판 엉덩이 탐정 : 수플레 섬의 비밀");
		boxOffice.put(4, "니 부모 얼굴이 보고 싶다");
		
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("===================================");
			System.out.println("1. 순위로 박스오피스 검색하기");
			System.out.println("2. 입력한 순위보다 한 단계 높은 순위를 출력");
			System.out.println("3. 입력한 순위보다 한 단계 낮은 순위를 출력");
			System.out.println("4. 현재 박스오피스 가장 높은 순위 보기");
			System.out.println("5. 현재 박스오피스 가장 낮은 순위 보기");
			System.out.println("6. 전체 박스오피스 보기");
			System.out.println("7. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("원하시는 메뉴를 입력하세요 > ");
			
			int num = sc.nextInt(); 
			
			switch (num) {
			case 1:
				System.out.print("검색하려는 박스오피스 순위 > ");
				num = sc.nextInt();
				System.out.println(num + "위 = [" + boxOffice.get(num)+"]");
				break;
			case 2:
				System.out.print("검색하려는 박스오피스 순위 > ");
				num = sc.nextInt();
				System.out.println("[" + boxOffice.lowerEntry(num) + "]");

				break;
			case 3:
				System.out.print("검색하려는 박스오피스 순위 > ");
				num = sc.nextInt();
				System.out.println("[" + boxOffice.higherEntry(num) + "]");
				break;
			case 4:
				System.out.println("현재 박스오피스 1위 > " + "[" + boxOffice.firstEntry() + "]");
				break;
			case 5:
				System.out.println("현재 박스오피스 5위 > " + "[" + boxOffice.lastEntry()+ "]");
				break;
			case 6:
				for (Entry<Integer, String> entry : boxOffice.entrySet()) {
					Integer key = entry.getKey();
					String val = entry.getValue();
					System.out.println(entry.getKey() + "위 " + entry.getValue());
				}
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;

			default: 
				System.out.println("");
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("");
				break;
			}
		}
	}
}
