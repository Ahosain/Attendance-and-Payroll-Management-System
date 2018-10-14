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
public class TeacherStatus {
    private String teacherid;
    private String name;
    private Boolean status;

    public TeacherStatus(String teacherid, String name, Boolean status) {
        this.teacherid = teacherid;
        this.name = name;
        this.status = status;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
