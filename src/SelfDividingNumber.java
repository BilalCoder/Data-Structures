import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public static void main(String[] args) {
        SelfDividingNumber selfDividingNumber = new SelfDividingNumber();
        System.out.println("First = " + selfDividingNumber.selfDividingNumbers(1, 22));
        System.out.println("Second = " + selfDividingNumber.selfDividingNumbers(47, 85));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            int rem = 0;
            int num = i;
            boolean selfDividing = true;
            while(num>0) {
                rem = num % 10;
                num = num/10;
                if(rem == 0 || i%rem != 0) {
                    selfDividing = false;
                    break;
                }
            }
            if(selfDividing == true) list.add(i);
        }

        return list;
    }
}
