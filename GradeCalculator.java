import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many grades do you want to enter?");
        int count = scanner.nextInt();

        double total = 0;
        double highest = 0;
        double lowest = 100;

        for(int i = 1; i <= count; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            total = total + grade;

            if(grade > highest) {
                highest = grade;
            }
            if(grade < lowest) {
                lowest = grade;
            
            }
        }
        double average = total / count;

        System.out.println("Average: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade " + lowest);

        if(average >= 90) {
            System.out.println("Letter grade: A");
         } else if(average >= 80) {
                System.out.println("Letter grade: B");
          } else if(average >= 70) {
                    System.out.println("Letter grade: C");
           } else if(average >= 60) {
                        System.out.println("Letter grade: D");
           } else {
            System.out.println("Letter grade: F");
           }
           scanner.close();

    }     
}       
        
    
    

