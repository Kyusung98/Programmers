package com.example.programmers.lv0;

public class Solution_day4 {
    //머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
    //피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
    //n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution1(int slice, int n) {
        int answer = 0;
        if(n <= slice){
            return 1;
        }else {
            if(n%slice == 0){
                answer = answer + (n/slice);
            } else {
                answer = answer + (n/slice) + 1;
            }
        }
        return answer;
    }

    //머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    public int solution2(int price) {
        double answer = 0;

        if(price >= 500000) {
            answer = price * 0.8;
        } else if(500000 > price && price >= 300000) {
            answer = price * 0.9;
        } else if(300000 > price && price >= 100000) {
            answer = price * 0.95;
        } else {
            answer = price;
        }
        return (int)answer;
    }

    //머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
    //머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    //머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution3(int money) {
        int[] answer = {0,0};
        int coffee = money/5500;
        int change = money-(5500*coffee);

        answer[0] = coffee;
        answer[1] = change;

        return answer;
    }

    //머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    //양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
    //정수 n과 k가 매개변수로 주어졌을 때,
    //양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.

    public int solution4(int n, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i = 10; i <= n; i+=10){
            cnt++;
        }
        answer = (n * 12000) + (k * 2000) - (cnt * 2000);

        return answer;
    }
}
