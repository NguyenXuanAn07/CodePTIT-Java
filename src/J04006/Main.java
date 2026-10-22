
package J04006;

import java.util.Scanner;

class Student {
    private String name;
    private String stuId;
    private String stuClass;
    private String birthdate;
    private float GPA;

    public Student() {
        stuId = "B20DCCN001";
        name = "";
        stuClass = "";
        birthdate = "";
        GPA = 0;
    }

    public void input(Scanner sc) {
        name = sc.nextLine();
        stuClass = sc.nextLine();
        birthdate = sc.nextLine();
        GPA = Float.parseFloat(sc.nextLine());

        String[] s = birthdate.split("/");
        String date = s[0];
        String month = s[1];
        String year = s[2];

        if (date.length() == 1) date = "0" + date;
        if (month.length() == 1) month = "0" + month;

        birthdate = date + "/" + month + "/" + year;
    }

    @Override
    public String toString() {
        return stuId + " " + name + " " + stuClass
                + " " + birthdate + " "
                + String.format("%.2f", GPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.input(sc);

        System.out.println(student);
        sc.close();
    }
}
