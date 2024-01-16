package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day26 {
    //문자열 s가 매개변수로 주어집니다.
    //s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    //한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
    public String solution(String s) {
            String answer = "";
            String[] tmp = s.split("");
            Arrays.sort(tmp);

            for (int i = 0; i < tmp.length; i++){
                int count = 0;

                for (int j = 0; j < tmp.length; j++){
                    if (tmp[i].equals(tmp[j])){
                        count++;
                    }
                }
                if (count == 1){
                    answer += tmp[i];
                }
            }
            return answer;
    }
}
