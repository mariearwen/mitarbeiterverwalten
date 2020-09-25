package model;



public class Employee {

    private String name;
    private String gender;
    private String branch;
    private String position;
    private String salary;

    public Employee() {}




    public void setName(String n) { this.name = n; }

    public String getName() { return name; }

    public void setGender(Object g) { this.gender = g.toString(); }

    public String getGender() { return gender; }

    public void setBranch(String b) { this.branch = b; }

    public String getBranch() { return branch; }

    public void setPosition(String p) { this.position = p; }

    public String getPosition() { return position; }

    public void setSalary(String s) { this.salary = s; }

    public String getSalary() { return salary; }
}