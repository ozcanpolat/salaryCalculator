public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
            return tax;
        }
        return 0;
    }

    public int bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int yearNow = 2021;
        double riseCount = 0;
        if (yearNow - this.hireYear <= 10) {
            return riseCount = this.salary * 0.05;
        } else if ((yearNow - this.hireYear > 9) && (yearNow - this.hireYear < 20)) {
            return riseCount = this.salary * 0.1;
        } else if (yearNow - this.hireYear > 19) {
            return riseCount = this.salary * 0.15;
        }
        return 0;
    }

    public String toString() {
        System.out.println("------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary +
                "\nWork Hours: " + workHours + "\nHire Year: " + hireYear +
                "\nTax: " + tax() + "\nBonus: " + bonus() + "\nsalary increase: " + raiseSalary() +
                "\nSalary including tax and bonus: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + raiseSalary());

    }
}