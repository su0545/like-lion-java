package week03.calculator2;

public class Calculator {

   private NumberMaker numberMaker;
   private int baseNum = 10; //baseNum 10 생성해서 뒤에 받기

   public Calculator(NumberMaker numberMaker) {
      this.numberMaker = numberMaker;
   }

   public Calculator(NumberMaker numberMaker, int baseNum) {
      this.numberMaker = numberMaker;
      this.baseNum = baseNum;
   }

   public void plus(int num) { //parameter을 int형 하나 받아줌
      int result = num + this.numberMaker.make(this.baseNum);//num에다가 numberMaker에서 정해준 숫자를 더해주는것
      System.out.println(result);
   }
}
   //NumberMaker에서 만들어준 숫자를 가지고 사칙 연산한 결과를 출력한다.


