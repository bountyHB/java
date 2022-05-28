package level.level1;

public class level1 {

    public void solution() {
        // 1. new_id를 소문자로 치환
    	String test = "...!@BaT#*..y.abcdefghijklm";
    	String s1 = test.toLowerCase();
    	String s2;
    	System.out.println(s1);
        
        
        // 2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거
        // 유니코드 값 얻기.
//      char ch = '.';
//      System.out.println((int)ch);
      // 소문자 a : 97~122 
      // 대문자 A : 65~90 
      // 빼기 - : 45 
      // 밑줄 _ : 95 
      // 마침표 . : 46
      // string을 char 배열에 담아서 하나씩 검사
      // String.toCharArray(); 이용
    	char[] ch = s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
    		if ((97<= (int)ch[i] && (int)ch[i] <= 122) || (int)ch[i] == 45 || (int)ch[i] == 46 || (int)ch[i] == 95) {
				ch[i] = ch[i]; 
			}else {
				ch[i] = '\u0000';
			}
		}
    	System.out.print(ch);
    	
    	System.out.println();
        // 3. 마침표가 2번이상 연속되면 하나의 마침표로 치환
    	
    	String  str = "()괄호를 변경";
        System.out.println(str.replaceAll("\\(", "이렇게 "));
        // 이렇게 )괄호를 변경

    	
    	
        // 4. 마침표가 처음이나 끝에 위치한다면 제거
            
        // 5. 빈 문자열이라면 a를 대입
            
        // 6. 16자 이상이라면, 첫 15를 제외한 나머지 문자를 모두 제외
        // 단, 마지막 문자가 . 일 경우 마침표 문자를 제거
            
        // 7. 길이가 2자 이하라면 마지막 문자를 길이가 최소 3이 될때까지 반복
            
        
        
    }

}
