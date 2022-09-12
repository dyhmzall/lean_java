class AutoArray {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("в " + month + " месяце " + month_days[month] + " дней");
    }
}