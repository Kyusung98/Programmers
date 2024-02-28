package com.example.programmers.starter;

import java.util.Arrays;

public class Solution_day10 {
    //사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
    //x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    //x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    //x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    //x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    //x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
    //좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
    public int solution1(int[] dot) {
        if(dot[0] > 0 && dot[1] > 0 ) {
            return 1;
        }else if(dot[0] > 0 && dot[1] < 0) {
            return 4;
        }else if(dot[0] < 0 && dot[1] < 0) {
            return 3;
        }else {
            return 2;
        }
    }

    //정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
    //num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
    //num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
    //2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
    public int[][] solution2(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int cnt = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++, cnt++){
                answer[i][j] = num_list[cnt];
            }
        }
        return answer;
    }

    //머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
    //공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
    //친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
    //k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
    public int solution3(int[] numbers, int k) {
        int answer = numbers[2 * (k - 1) % numbers.length];

        return answer;
    }

    //정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    //배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution4(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
            int[] right = Arrays.copyOfRange(numbers, 0, numbers.length-1);
            answer[0] = numbers[numbers.length - 1];
            System.arraycopy(right, 0, answer, 1, right.length);
        } else {
            int[] left = Arrays.copyOfRange(numbers, 1, numbers.length);
            answer[numbers.length-1] = numbers[0];
            System.arraycopy(left, 0, answer, 0, left.length);
        }
        return answer;
    }
}
