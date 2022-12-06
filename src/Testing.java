public class Testing {

    public static void main(String[] args) {
        int p = 100;
        int d = 1;
        int m = 1;
        int s = 99;
        int count = 0;
        System.out.println(s + " " + p + " " + count);
        while(s >= m && s >= p) {
            s = s - p;
            p = p - d >= m ? p - d : m;
            count++;
            System.out.println(s + " " + p + " " + count);
        }
        System.out.println(count);
    }
}
