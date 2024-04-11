package Test ;

import People.EmployeeFulltime;
import People.EmployeeParttime;

public class testPerson {
    public static void main(String[] args) {
        EmployeeParttime staff = new EmployeeParttime();
        staff.inputInformation();
        staff.caculatedSalary();

        EmployeeFulltime staff2 = new EmployeeFulltime();
        staff2.inputInformation();
        staff2.caculatedSalary(staff2.namkinhnghiem);

        staff2.outputPosition();
        staff2.outputInformation();
        System.out.println();
        staff.outputPosition();
        staff.outputInformation();
    }
}