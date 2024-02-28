package com.example.programmers.starter;

import java.util.Scanner;

public class Solution_day6 {
    //문자열 my_string이 매개변수로 주어집니다.
    //my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution1(String my_string) {
        String answer = "";
        int length = my_string.length() - 1;
        for (int i = length; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    //"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
    //정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
    public class Solution2 {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = 0; j <=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    //정수가 담긴 리스트 num_list가 주어질 때,
    //num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution3(int[] num_list) {
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2 == 0) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        int[] answer = {cnt1, cnt2};

        return answer;
    }

    //문자열 my_string과 정수 n이 매개변수로 주어질 때,
    //my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution4(String my_string, int n) {
        String answer = "";
        int r = n;
        for(int i = 0; i < my_string.length(); i++){
            while(n > 0){
                answer += my_string.charAt(i);
                n--;
            }
            n = r;
        }
        return answer;
    }
}
