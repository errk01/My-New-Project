package entity;

import javax.persistence.*;

@Entity
@Table(name="Employees")
@NamedQuery(query = "SELECT e FROM EmployeeEntity e WHERE e.id = :id", name="Find employee by id")
public class EmployeeEntity {
    @Id
    @Column(name = "employeeNumber")
    int employeeNumber;

    @Basic
    @Column(name="firstName")
    String firstName;

    @Basic
    @Column(name="lastName")
    String lastName;

    @Basic
    @Column(name="email")
    String email;

    @Basic
    @Column(name="officeCode")
    int officeCode;

    @Basic
    @Column(name="salary")
    double salary;

    @Basic
    @Column(name="extension")
    double extension;

    @Basic
    @Column(name="jobTitle")
    String jobTitle;


    // Default constructor
    public EmployeeEntity() {
    }
    // Constructor
    public EmployeeEntity(int employeeNumber, String firstName, String lastName, String email, int officeCode) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.officeCode = officeCode;
    }
// Getters and Setters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
