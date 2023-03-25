public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        int a = 0, b = 1000;
        primeNumber.primeNumbersBetween(a, b);
    }

    private void primeNumbersBetween(int a, int b) {
        int i, j, flag;
        System.out.println(" Prime numbers between and are  ");
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + ", ");
        }
    }
}
