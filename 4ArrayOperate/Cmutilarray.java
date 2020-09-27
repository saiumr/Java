// 打印一个二维数组
public class Cmutilarray {
    public static void main(String[] args) {
        int[][] ns = {
            {1,3,5,7},
            {2,4,6,8}
        };

        for (int[] n : ns) {
            for (int m : n) {
                System.out.print(m + ",");
            }
        }
    }
}