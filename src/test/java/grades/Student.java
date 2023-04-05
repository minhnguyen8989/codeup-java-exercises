package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGradesList(){
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeTotal = 0;
        double gradeAverage = 0;
        for (int i = 0; i < grades.size(); i++){
            gradeTotal += grades.get(i);
            gradeAverage = gradeTotal / grades.size();
        }
        return gradeAverage;
    }

}
