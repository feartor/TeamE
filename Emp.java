/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheMonster
 */
public class Emp {

    //attributes
    private String nameF;
    private String nameL;
    private String department;
    private String ID;

    //constructors methods
    public Emp() {
        nameF = "Unknown";
        nameL = "Unknown";
        department = "Unknown";
        ID = "Unknown";
    }

    //paramaterized constructor
    public Emp(String nameF, String nameL, String department, String ID) {
        this.setNameF(nameF);
        this.setNameL(nameL);
        this.setDepartment(department);
        this.setID(ID);
    }

    //behaviors 
    @Override
    public String toString() {
        return nameL + ", " + nameF + ": " + this.department + " department.";
    }

    //get and set
    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
