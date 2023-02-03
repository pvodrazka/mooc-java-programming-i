
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> komplet;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.komplet = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {

        this.grades.add(pointsToGrade(points));
        this.komplet.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        double secteno = 0;
        for (int i = 0; i<this.grades.size(); i++){
            secteno+=this.grades.get(i);
        }
        return secteno/this.grades.stream().count();
    }

    public double averageOfPoints() {
        if (this.komplet.isEmpty()) {
            return -1;
        }
        double secteno = 0;
        for (int i = 0; i<this.komplet.size(); i++){
            secteno+=this.komplet.get(i);
        }
        return secteno/this.komplet.stream().count();
    }
}
