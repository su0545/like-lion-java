package week4.algorithm;

public class SumOfDigit {
    public int solution(int n) { // % 연산 이용 몫, 나머지, Currency
        int result = 0;
        int origin = n;

        // i = 0
        System.out.println(n / 10); //1234를 10으로 나누니까 몫이 123
        System.out.println(n % 10); //나머지 4

        //i = 1
        System.out.println(n / 10); //123 / 10 몫 12
        System.out.println(n % 10); //나머지3


        result += n % 10; //나머지를 먼저 구해야해서 result를 먼저 써줌
        origin = origin / 10;

        while (origin > 0) {
            result += origin % 10;
            origin = origin / 10;
            System.out.printf("origin:%d result:%d\n", origin, result);
        }
        return result;
    }


    public static void main(String[] args){
        //687 = 6+8+7 = 21

        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1 == 10){
            System.out.println("테스트통과 했습니다.");
        }else{
            System.out.printf("테스트 실패 result:%d\n", result1);
        }

    }
}
