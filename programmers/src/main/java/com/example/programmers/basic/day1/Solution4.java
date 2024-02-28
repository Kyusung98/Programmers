package com.example.programmers.basic.day1;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        //영어 알파벳으로 이루어진 문자열 str이 주어집니다.
        // 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] s = a.split("");
        for (int i = 0; i < s.length; i++){
            if (s[i] == s[i].toUpperCase()){
                System.out.print(s[i].toLowerCase());
            }else {
                System.out.print(s[i].toUpperCase());
            }
        }
    }
}
