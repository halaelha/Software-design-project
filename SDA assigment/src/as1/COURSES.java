/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class COURSES {

    private String id;
    private String code;
    private String name;
    private DEPARTMENTS department_id;
    private int credits;
    private int theory_hours;
    private int lab_hours;
    private String course_type;
    private String language;
    private String description;
    private boolean is_active;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public DEPARTMENTS getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(DEPARTMENTS department_id) {
        this.department_id = department_id;
    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    public int getTheory_hours() {
        return theory_hours;
    }

    public void setTheory_hours(int theory_hours) {
        this.theory_hours = theory_hours;
    }


    public int getLab_hours() {
        return lab_hours;
    }

    public void setLab_hours(int lab_hours) {
        this.lab_hours = lab_hours;
    }


    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
