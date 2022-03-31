public class App {
    public static void main(String[] args) throws Exception {
        Time t = new Time(1, 20, 50);
        t.addSecondi(60);
        Time t2 = new Time(6000);

        System.out.println(t.convertiSecondi());
        System.out.println(t2.toString());
    }
}
