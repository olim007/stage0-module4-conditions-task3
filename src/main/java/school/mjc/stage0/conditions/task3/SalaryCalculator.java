package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public double result(int salary, int rate) {
        return salary - salary * rate / 100.0;
    }
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println(this.result(salary, 15));
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(this.result(salary, 18));
        } else if (salary > 20000) {
            System.out.println(this.result(salary, 20));
        }
    }
}
