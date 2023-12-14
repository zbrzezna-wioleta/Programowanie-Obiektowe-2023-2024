package math.logaritm;
import java.lang.Math;

public class SimpleLogarithmCalculator implements LogarithmCalculator{
    @Override
    public double calculateLog(int number) {
        return Math.log(number);
    }

    @Override
    public boolean isGreaterThanOne(int number) {
        if(number>1){
            return true;
        }
        return false;
    }
}
