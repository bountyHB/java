package level.level1;

class Solution {
    public String solution(String new_id) {
    	// 1. new_id를 소문자로 치환
        String answer = new_id.toLowerCase();
        System.out.println("1단계 : " + answer);
        
        // 2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        System.out.println("2단계 : " + answer);
    
        // 3. 마침표가 2번이상 연속되면 하나의 마침표로 치환
        answer = answer.replaceAll("[.]{2,}", ".");
        System.out.println("3단계 : " + answer);
        
        // 4. 마침표가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        System.out.println("4단계 : " + answer);
        
        // 5. 빈 문자열이라면 a를 대입
        answer = answer.isEmpty() ? "a" : answer;
        System.out.println("5단계 : " + answer);
        
        // 6. 16자 이상이라면, 첫 15를 제외한 나머지 문자를 모두 제외
        // 단, 마지막 문자가 . 일 경우 마침표 문자를 제거
        if (answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        } 
        answer = answer.replaceAll("[.]$", "");
        System.out.println("6단계 : " + answer);
        
        // 7. 길이가 2자 이하라면 마지막 문자를 길이가 최소 3이 될때까지 반복
        if (answer.length() <= 2) {
        	while(answer.length()< 3) {
        	answer += answer.charAt(answer.length()-1);
        	}
        }
        System.out.println("7단계 : " + answer);
        
        return answer;
    }
}