package com.example.programmers.starter;

public class Solution_day30 {
    //my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    //문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
    public int solution(String my_string) {
        int answer = 0;
        String[] tmp = my_string.split(" ");
        answer += Integer.parseInt(tmp[0]);

        for (int i = 1; i < tmp.length; i++){
            if (tmp[i].equals("+")){
                answer += Integer.parseInt(tmp[i+1]);
            }if (tmp[i].equals("-")){
                answer -= Integer.parseInt(tmp[i+1]);
            }
        }
        return answer;
    }
}
