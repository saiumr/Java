public class Doverload {
    public static void main(String[] args) {
        Miss me = new Miss();
        me.hello();
        System.out.println(me.getReply());
        me.hello("I miss you");
        System.out.println(me.getReply());

    }
}

class Miss {
    private String sweetWords;

    public void hello() {
        this.sweetWords = "...";
    }

    public void hello(String sweetWords) {
        this.sweetWords = sweetWords + ", too";
    }

    public String getReply() {
        return sweetWords;
    }
}