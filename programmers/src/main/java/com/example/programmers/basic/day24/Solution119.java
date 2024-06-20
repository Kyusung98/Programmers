package com.example.programmers.basic.day24;

public class Solution119 {
    //알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
    //알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
    public String solution(String myString) {
        String answer = "";
        for (String s : myString.split("")){
            if (s.equals("m")||s.equals("n")||s.equals("o")||s.equals("p")
                ||s.equals("q")||s.equals("r")||s.equals("s")||s.equals("t")
                ||s.equals("u")||s.equals("v")||s.equals("w")||s.equals("x")
                ||s.equals("y")||s.equals("z")){
                answer += s;
            }else {
                answer += "l";
            }
        }
        return answer;
    }
}
lmnopqrstuvwxyz
