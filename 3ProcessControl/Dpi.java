public class Dpi {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 10001; ++i) {
            pi += (Math.pow(-1, (i+1) % 2) * 1 / (2 * i - 1)) * 4;
        }
        System.out.println(pi);
    }
}

