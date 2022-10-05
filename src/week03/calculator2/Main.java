package week03.calculator2;

public class Main {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(20);

        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker(), 200);
        //위에서 객체생성한 방법과 바로 선언하는 방법이 있음
        byPassNumberCalculator.plus(50);
    }
}
