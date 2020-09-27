// 给类设置私有属性，这是不希望外部代码直接影响它，以免产生错误
// 可以再设置公有方法去改变同一个类里的属性
// 在设置的时候还可以检查设置是否正确，这样分权限的好处就在这，保证了有条理，有逻辑

public class Awhyfeild {
    public static void main(String[] args) {
        Defense fen = new Defense();
        fen.setName("gjmscydcxw");
        fen.setName("gjm");
        fen.setAge(8);
        fen.printInfo();
        String copyname = fen.getName();
        int copyage = fen.getAge();
        System.out.println(copyname + " " + copyage);
    }
}

class Defense {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.length() > 3) {
            System.out.println("Name too long.");
        }
        else {
            // 如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this指示是类的私有属性
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error.");
        }
        else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }
}