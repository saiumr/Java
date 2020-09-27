public class Javabean {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(Bean.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}

class Bean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/**
** JavaBean是一种符合命名规范的class，它通过getter和setter来定义属性；

** 属性是一种通用的叫法，并非Java语法规定；

** 可以利用IDE快速生成getter和setter；

** 使用Introspector.getBeanInfo()可以获取属性列表。
**/