class Switch1 {
    public static void main(String[] args) {
        // Suppose we have a day represented by a number (1 for Sunday, 2 for Monday, and so on)
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
