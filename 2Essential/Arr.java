// 数组是引用数据类型
public class Arr {
    public static void main(String[] args) {
        int[] ns = new int[] {1, 2, 3, 4, 5};  //分配五个int类型的数据空间，ns指向首位置
        System.out.println(ns.length);
        ns = new int[] {7, 8, 9};
        System.out.println(ns.length);  //长度并没有变,只是指向另一个堆了，新开辟了三个数据空间
    }
}
