// 包装类型
// demo 把int基本类型变成引用类型
// 实际上，因为包装类型非常有用，Java核心库为每种基本类型都提供了对应的包装类型

public class GWrapType {
    public static void main(String[] args) {
        // int 基本类型和Integer引用类型相互转换
        Integer n1 = null;
        Integer n2 = new Integer(99);
        int n3 = n2.intValue();
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Integer {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }
}