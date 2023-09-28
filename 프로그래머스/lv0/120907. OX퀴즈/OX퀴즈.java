class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[2]);
            int Z = Integer.parseInt(arr[4]);
            char operator = arr[1].charAt(0);

            boolean isCorrect = false;

            if (operator == '+') {
                isCorrect = (X + Y == Z);
            } else if (operator == '-') {
                isCorrect = (X - Y == Z);
            }

            answer[i] = isCorrect ? "O" : "X";
        }

        return answer;
    }
}
