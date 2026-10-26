package J04007;

import java.util.Scanner;
class Employee {
    private static int count = 0;
    public String idEmployee;
    public String name;
    public String sex;
    public String address;
    public long idFax;
    public String birthDay;
    public String contractSigningDay;

    public static String formatDate(String birthDay){
        String[] parts = birthDay.trim().split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        return String.format("%02d/%02d/%02d", day, month, year);
    }
    public static String formatContractSigningDay(String contractSigningDay){
        String[] parts = contractSigningDay.trim().split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        return String.format("%02d/%02d/%04d", day, month, year);
    }
    public Employee(Scanner sc){
        count ++;
        idEmployee = String.format("000%02d", count);
        name = sc.nextLine();
        sex = sc.nextLine();
        birthDay = formatDate(sc.nextLine());
        address = sc.nextLine();
        idFax = sc.nextLong();
        sc.nextLine();
        contractSigningDay = formatContractSigningDay(sc.nextLine());
    }
    @Override
    public String toString(){
        return idEmployee+" "+name+" "+sex+" "+birthDay+" "+address+" "+idFax+" "+contractSigningDay;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee(sc);
        System.out.println(employee);
    }
}
