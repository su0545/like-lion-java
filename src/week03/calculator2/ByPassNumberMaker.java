package week03.calculator2;

public class ByPassNumberMaker implements NumberMaker {
    @Override
    public int make(int num) {
        return num;
    }
}
