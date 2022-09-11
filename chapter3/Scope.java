class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if(x == 10) {
            int y = 20;
            System.out.println("х и у: " + x + " " + y);
            x = y * 2;
        }

        //y = 100;
        System.out.println("х равно " + x);

        //if (true) int z;
        //z = 10;
        //System.out.println("z равно " + z);z
    }
}