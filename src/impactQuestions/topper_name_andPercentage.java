package impactQuestions;
//Write a C++ program that takes input for multiple students, including their name and marks in 5 subjects. The program should compute each student's percentage and determine the topper (student with the highest percentage). Finally, display the topper's name along with their percentage.
//
//Input Format
//
//An integer n (number of students). n lines of input: Each line contains A string (student’s name). Five space-separated integers (marks in 5 subjects, each out of 100).
//
//Constraints
//
//• 1 ≤ n ≤ 100 (Number of students) • 0 ≤ marks[i] ≤ 100 (Marks must be within a valid range) • There will be at least one student. • If multiple students have the same highest percentage, the first encountered student should be selected.
//
//Output Format
//
//• A single line displaying the topper’s name and their percentage. EXAMPLE AJAY WADEKAR 85%
//
//Sample Input 0
//
//3
//AJAY
//90 85 88 92 95
//VIJAY
//80 75 78 85 90
//SANJAY
//95 90 92 96 94
//Sample Output 0
//
//SANJAY 93.4%
import java.util.Scanner;
public class topper_name_andPercentage{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String topperName = "";
            double maxPercentage = 0;

            for (int i = 0; i < n; i++) {
                String name = sc.next();

                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();
                int m4 = sc.nextInt();
                int m5 = sc.nextInt();

                int total = m1 + m2 + m3 + m4 + m5;
                double percentage = total / 5.0;

                if (percentage > maxPercentage) {
                    maxPercentage = percentage;
                    topperName = name;
                }
            }

            System.out.println(topperName + " " + maxPercentage + "%");

            sc.close();
        }
    }
