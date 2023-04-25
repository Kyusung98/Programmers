package com.example.programmers.lv0;

import java.util.Arrays;
import java.util.HashMap;

public class Solution_day7 {
    //문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    //my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution1(String my_string, String letter) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    //numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution2(int[] numbers, int num1, int num2) {

        return Arrays.copyOfRange(numbers,num1,num2+1);
    }

    //우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    //a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    //나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
    public String solution3(int age) {
        String answer = "";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "a");
        map.put(1, "b");
        map.put(2, "c");
        map.put(3, "d");
        map.put(4, "e");
        map.put(5, "f");
        map.put(6, "g");
        map.put(7, "h");
        map.put(8, "i");
        map.put(9, "j");

        for(int i = age; i > 0; i /= 10){
            int pro = i % 10;
            answer = map.get(pro) + answer;
        }
        return answer;
    }
}
