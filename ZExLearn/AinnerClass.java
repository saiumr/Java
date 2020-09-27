public class AinnerClass {
    public static void main(String[] args)  {
        //创建成员内部类实例对象
        //第一种方式：
        Outter outter = new Outter();
        Outter.Inner inner = outter.new Inner();  //必须通过Outter对象来创建
         
        //第二种方式：
        Outter.Inner inner1 = outter.getInnerInstance();

        //初始化Bean1
        AinnerClass innerclass = new AinnerClass();
        Bean1 bean1 = new innerclass.Bean1();

        //创建静态内部类实例对象
        //初始化Bean2
        Bean2 bean2 = new Bean2();
    }

    class Bean1 {
        public int I = 1;
    }

    static class Bean2 {
        public int I = 1;
    }
}
 
class Outter {
    private Inner inner = null;
    public Outter() {
         
    }
     
    public Inner getInnerInstance() {
        if(inner == null)
            inner = new Inner();
        return inner;
    }
      
    class Inner {
        public Inner() {
             
        }
    }
}