public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Random number: " + r);
            if (r == 100) {
                System.out.println("Dropped num 100, let's finish on this");
                break;
            }
        }
    }
}
