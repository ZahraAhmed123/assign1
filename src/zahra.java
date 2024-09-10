public class zahra {
    static int K = 0;
    int z=20;
    public void add() {
        int Y = 5;
        K++;
        System.out.println("Static : " + K);
        z++;
        System.out.println("Instances: " +z);
        System.out.println("Local Variable: " + Y);
    }

    public static void main(String[] args) {
        zahra one = new zahra();

        one.add();

    }
}

