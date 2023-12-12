class Payroll {
    public static void main(String[] args) {
        long hoursWorked;
        hoursWorked = 40;
        double payRate, taxRate;
        payRate = 10.0;
        taxRate = 0.10;

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Amount  : " + (hoursWorked * payRate));
        System.out.println("Tax Amount  : " + (hoursWorked * payRate * taxRate));
    }
}