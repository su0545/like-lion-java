package week03.calculator2;

public class RandomNumberMaker implements NumberMaker{
    @Override
    public int make(int num) {
        return (int)(Math.random() * num); // RandomNumberMaker의 make 메소드는 랜덤 번호를 생성하고 int로 캐스팅
    }
}
