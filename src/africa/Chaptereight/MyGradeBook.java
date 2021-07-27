package africa.Chaptereight;

public class MyGradeBook {
    public static void main(String[] args) {
        int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to java programming", gradesArray);
        System.out.printf("welcome to the grade book for%n%s%n%n",
                myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}




