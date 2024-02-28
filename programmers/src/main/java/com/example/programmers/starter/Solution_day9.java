package com.example.programmers.starter;

public class Solution_day9 {
    //가위는 2 바위는 0 보는 5로 표현합니다.
    //가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
    //rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
    public String solution1(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.split("")[i].equals("2")){
                answer += "0";
            } else if(rsp.split("")[i].equals("0")){
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }

    //머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    //머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    //balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
    public int solution2(int balls, int share) {
        int answer = 0;

        answer = combination(balls, share);

        return answer;
    }

    private int combination(int n, int m) {
        if (m == 0 || n == m) {
            return 1;
        } else {
            return combination(n - 1, m - 1) + combination(n - 1, m);
        }
    }
}
