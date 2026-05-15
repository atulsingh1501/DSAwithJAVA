package impactQuestions;
import java.util.Scanner;

public class EmployeeSalaryTotal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double grandTotal = 0;
            for (int i = 0; i < 5; i++) {
                String name = sc.next();
                int id = sc.nextInt();
                int salary = sc.nextInt();

                double tax = 0;
                if (salary <= 15000) {
                    tax = 0;
                } else if (salary <= 50000) {
                    tax = salary * 0.10;
                } else {
                    tax = salary * 0.15;
                }

                double afterTax = salary - tax;
                grandTotal = grandTotal + afterTax;
            }

            System.out.println((int)grandTotal);

            sc.close();
        }
    }

//Design an Employee Salary Management System using OOP principles in C++. The system should calculate salary deductions based on specific conditions and display tatal salary of all employee.
//
//Employee Attributes: • name (string) → Employee’s name. • employee_id (integer) → Unique ID for the employee. • salary (integer) → Monthly salary. • deduction (float) → Deducted amount based on salary. • final_salary (float) → Salary after deduction.
//Deduction Conditions: • If salary < 15,000, 0% tax is deducted. • If salary is between 15,001 - 50,000, 10% tax is deducted. • If salary > 50,000, 15% tax is deducted.
//Methods to Implement: • calculateDeduction() → Calculate tax deduction based on salary. • getFinalSalary() → Return the final salary after deduction.
//Additional Features: • The system should support exactly 5 employees. • Employees should be stored in a static array. • The program should calculate and display the total salary paid after deductions.
//Input Format
//
//Example Input: Enter details for 5 employees (Name ID Salary): Employee 1: Raju 101 14000 Employee 2: Shyam 102 18000 Employee 3: Maya 103 25000 Employee 4: Radha 104 36000 Employee 5: Ajay 105 65000
//
//Constraints
//
//✅ Salary should be a positive integer. ✅ The system should support exactly 5 employees (no dynamic allocation). ✅ The deduction must be calculated automatically based on salary range. ✅ The program should use object-oriented principles (Encapsulation & Constructors).
//
//Expected Output: (total salary :) 140350
//
//Output Format
//
//Expected Output: (total salary :) 140350
//
//Sample Input 0
//
//ajay 44 4444
//sandeep 99 9999
//didi 22 2222
//pari 88 8888
//lucky 55 5555
//Sample Output 0
//
//31108