import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total subjects");
        int noOfSubjects=sc.nextInt();
        int subjectMarks[]=new int[noOfSubjects];
        int totalMarks=0;
        for(int i=0;i<noOfSubjects;i++){
            subjectMarks[i]=sc.nextInt();
            totalMarks+=subjectMarks[i];
        }
        char Grade;
        double avgPercentage=totalMarks/noOfSubjects;
        if(avgPercentage>90){
            Grade='A';
        }else if(avgPercentage>80 && avgPercentage<=90){
            Grade='B';
        }else if(avgPercentage>70 && avgPercentage<=80){
            Grade='C';
        }else if(avgPercentage>60 && avgPercentage<=60){
            Grade='D';
        }else{
            Grade='F';
        }
        System.out.println("Total marks obtained are :"+ totalMarks);
        System.out.println("Total average % is "+avgPercentage);
        System.out.println("Grade is "+Grade);
    }
}