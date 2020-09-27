public class CDesignChainOperation {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(3)
             .add(5)
             .inc();
        System.out.println(adder.sum());
    }
}

// 不能在静态上下文中引用非静态 变量 this
class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int sum() {
        return sum;
    }
}