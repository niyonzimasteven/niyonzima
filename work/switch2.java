class switch2 {
    public static void main(String[] args) {
        // Suppose we have a student's score
        int score = 85;

        // Using switch to determine the grade
        char grade;

        switch (score / 10) {
            case 9:
            case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("Your grade is: " + grade);
    }
}
