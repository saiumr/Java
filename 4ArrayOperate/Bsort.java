import java.util.Arrays;

public class Bsort {
    public static void main(String[] args) {
        int[] ns = {3, 8, 4, 1, 7, 5, 6};
        System.out.println("Before sorted: " + Arrays.toString(ns));

        for (int i = 0; i < ns.length - 1; ++i) {
            for (int j = 0; j < ns.length - 1 - i; ++j) {
                if (ns[j] > ns[j+1]) {
                    int tmp = 0;
                    tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }

        System.out.println("After sorted: " + Arrays.toString(ns));

        int[] sn = {3,6,2,8,10,7,5};
        System.out.println();
        System.out.println("Before sorted: " + Arrays.toString(sn));
        Arrays.sort(sn);  //内置的排序方法
        System.out.println("After sorted: " + Arrays.toString(sn));
    }
}