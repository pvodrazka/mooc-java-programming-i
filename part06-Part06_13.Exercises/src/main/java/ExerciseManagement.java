import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Excercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Excercise exercise:exercises){
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercisea) {
        this.exercises.add(new Excercise(exercisea));
    }

    public void markAsCompleted(String exercise) {
        for (Excercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Excercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}