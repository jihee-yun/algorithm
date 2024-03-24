class Solution {
    public String[] solution(String[] names) {
        int groupCount = (names.length + 4) / 5; // 그룹 수 계산
        
        String[] answer = new String[groupCount]; // 결과 배열 초기화
        int index = 0; // 결과 배열의 인덱스
        
        for (int i = 0; i < groupCount; i++) {
            answer[i] = names[index]; // 그룹의 첫 번째 사람 이름 추가
            index += 5; // 다음 그룹의 첫 번째 사람 인덱스로 이동
            
            // 마지막 그룹에서는 5명 미만일 수 있으므로 범위를 조정
            if (index >= names.length) {
                index = names.length;
            }
        }
        
        return answer;
    }
}
