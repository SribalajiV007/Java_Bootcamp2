package PavanJava.MiniProject;

public class Student {
    String name;
    int rollNumber;
    int mark1, mark2, mark3;

    public Student(String name,int rollNumber, int mark1, int mark2,int mark3){
       this.name = name;
       this.rollNumber = rollNumber;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.mark3 = mark3;
    }

    public int totalMarks(){
        return mark1+mark2+mark3;
    }

    public void displayReport() {
        int total = totalMarks();
        double average = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }

}

