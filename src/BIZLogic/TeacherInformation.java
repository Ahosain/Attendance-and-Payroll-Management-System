/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIZLogic;

/**
 *
 * @author Anwar Hosain
 */
public class TeacherInformation {
    private String teacherid;
    private String name;
    private String department;
    private String email;
    private String contact;
    private String password;

    public TeacherInformation(String teacherid, String name, String department, String email, String contact, String password) {
        this.teacherid = teacherid;
        this.name = name;
        this.department = department;
        this.email = email;
        this.contact = contact;
        this.password = password;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
