import java.util.*;


class StandardTen {
    //
    String name;
    int rollno;
    int mark[] = new int[5];
    double average;

    void initialize(String name, int rollno, int mark[]) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
        avgMark();
    }

    int avgMark(int[]) {
        int total = 0;
        for(marks : mark) {
            total += 1;
        }
        this.average = total/5;
    }

    void display() {
        System.out.printf("Name: %s\tRoll no: %d\tAvg Mark:%.2f",name,rollno,average);
    }


}

public class Standard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StandardTen ten = new StandardTen();

        System.out.println("Enter no of students: ");
        int num = scan.nextInt();

        StandardTen[] student = new StandardTen[num];
        
        int rollno;
        String name;
        int mark[] = new int[5];

        /* ----- Student Details ----- */
        for(int i = 0; i < num; i++) {
            System.out.print("Enter Roll: ");
            rollno = scan.nextInt();
            System.out.print("Enter Name: ");
            name = scan.nextLine();
            System.out.println("Enter marks for 5 Subjects: ");
            for(int j = 0; j < 5; j++) {
                mark[i] = scan.nextInt();
            }
            student[i] = new StandardTen();
            student[i].initialize(name, rollno, mark);
        }

        Arrays.sort(student, (s1))
    }
}
