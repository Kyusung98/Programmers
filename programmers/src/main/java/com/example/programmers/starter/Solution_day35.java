package com.example.programmers.starter;

public class Solution_day35 {
    //덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    //수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            String[] tmp = quiz[i].split(" ");

            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[2]);
            int z = Integer.parseInt(tmp[4]);

            switch (tmp[1]){
                case "+" :
                    answer[i] = (x + y == z) ? "O" : "X";
                    break;
                case "-" :
                    answer[i] = (x - y == z) ? "O" : "X";
                    break;
            }
        }
        return answer;
    }
}
