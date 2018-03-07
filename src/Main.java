public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DollHouseSingleton d1 = DollHouseSingleton.getInstance();
        DollHouseSingleton d2 = DollHouseSingleton.getInstance();

        if (d1.equals(d2)) {
            System.out.println("De to dollhouses er det samme sgu!");
        }
        else
        {
            System.out.println("De to dollhouses er sgu IKKE DET SAMME!");

        }

    }
}
