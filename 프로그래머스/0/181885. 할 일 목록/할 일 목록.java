import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> unfinishedList = new ArrayList<>();
        
        // todo_list를 순회하면서 아직 마치지 못한 일들을 새로운 리스트에 추가
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) { // finished 배열의 값이 false인 경우에 해당하는 일을 추가
                unfinishedList.add(todo_list[i]);
            }
        }
        
        // List를 배열로 변환하여 반환
        return unfinishedList.toArray(new String[0]);
    }
}
