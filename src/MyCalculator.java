import java.util.Scanner;
class MyCalculator {
    public long power(int n, int p) throws Exception {
        double pow = Math.pow(n, p);
        if (n == 0 || p == 0) {
            throw new Exception("n or p  should not be zero");
        } else if (n < 0 || p < 0)
            throw new Exception("n or p  should be negative");
        else
            return (long) Math.pow(n, p);
    }
}

class Test
{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        final MyCalculator obj=new MyCalculator();

        while(sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                System.out.println(obj.power(n, p));
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
