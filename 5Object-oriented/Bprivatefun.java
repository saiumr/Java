// 这个程序里我们设置了人的生日就可以获得他的年龄
// 对用户而言他们并不需要关心其中是否真的有age字段

public class Bprivatefun {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("yiteng");
        ming.setBirth(2002);
        System.out.println(ming.getName() + "：" + ming.getAge());
    }
}

class Person {
    private String name;
    private int birth;

    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }

    public int getAge() {
        return calcAge(2020);
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setName(String... name) {
        this.name = name[0];  //数组
    }
    // 传入字符串数组也行，但是要先构造
//     Group g = new Group();
// g.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"});


    public String getName() {
        return name;
    }
}