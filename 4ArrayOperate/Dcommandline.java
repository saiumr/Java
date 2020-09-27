public class Dcommandline {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-hello".equals(arg) || "--hello".equals(arg)) {
                System.out.println("Hello! You just enter a commandline.");
            }
            else {
                System.out.println("Give me a argument \"hello\"");
            }
        }
    }
}