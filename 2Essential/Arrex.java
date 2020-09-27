//字符串数组，因为字符串是引用数据类型，所以字符串数组的Array[i]是堆区的指向
public class Arrex {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?很显然是XYZ
    }
}