import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Integer> seznam;
    private Scanner scanner;
    private PassedAverage passed;
    private PassPercentage percentage;
    private Grades grades;
    private int count;

    public UserInterface() {
        this.seznam = new ArrayList<Integer>();
        this.scanner = new Scanner(System.in);
        this.passed = new PassedAverage(seznam);
        this.percentage = new PassPercentage(seznam);
        this.grades = new Grades(seznam);
    }

    public void totalAverage() {
        System.out.println("Enter point totals, -1 stops:");
        this.count = 0;
        int points = 0;

        String inputString = "";
        while (true) {
            inputString = this.scanner.nextLine();
            if (inputString.equals("-1")) {
                break;
            }
            int number = Integer.parseInt(inputString);
            if (number < 0 || number > 100) {
                continue;
            }
            this.seznam.add(number);
            this.count= this.count+1;

        }
        for (int i = 0; i < this.seznam.size(); i++) {
            points += this.seznam.get(i);

        }
        double average = points/count;
        System.out.println("Point average (all): " +average);
        passed.passedAverage();
        percentage.passPercentage();
        grades.Grades();
    }




    }


