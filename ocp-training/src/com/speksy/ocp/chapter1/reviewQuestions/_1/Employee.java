package com.speksy.ocp.chapter1.reviewQuestions._1;
/*
    1. What is the result of the following code?

    A. Success
    B. Failure
    C. The hashCode() method fails to compile.
    D. The equals() method fails to compile.
    E. Another line of code fails to compile.
    F. A runtime exception is thrown.

    Result: A. Success - (equals does not have override annotation and it compile )

    A. Based on the equals() method in the code, objects are equal if they have the same
    employeeId. The hashCode() method correctly overrides the one from Object. The
    equals() method is an overload of the one from Object and not an override. It would be
    better to pass Object since an override would be better to use here. It is odd to override
    hashCode() and not equals().
*/

public class Employee {
    public int employeeId;
    public String firstName, lastName;

    public boolean equals(Employee e) {
        return this.employeeId == e.employeeId;
    }

    @Override
    public int hashCode() {
        return employeeId;
    }

    public static void main(String args[]) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    }
}
