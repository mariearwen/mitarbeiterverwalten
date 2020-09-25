package control;

import model.Employee;

import javax.swing.*;

public class MainController {

    public Employee e1;

    public MainController(){
        e1 = new Employee();
    }

    public void setEmployeeName(String n){ e1.setName(n); }
    public String getEmployeeName(){ return e1.getName(); }
    public void setGender (Object g){ e1.setGender(g); }
    public String getGender() {return e1.getGender(); }
    public void setBranch(String b) {e1.setBranch(b); }
    public String getBranch() { return e1.getBranch(); }
    public void setPosition(String p) {e1.setPosition(p);}
    public String getPosition() {return e1.getPosition();}
    public void setSalary (String s) {e1.setSalary(s);}
    public String getSalary () { return e1.getSalary();}
}