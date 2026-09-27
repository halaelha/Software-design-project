/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class COURSE_PREREQUISITES {

    private String id;
    private COURSES course_id;
    private COURSES prerequisite_course_id;
    private String type;
    private String min_grade;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public COURSES getCourse_id() {
        return course_id;
    }

    public void setCourse_id(COURSES course_id) {
        this.course_id = course_id;
    }


    public COURSES getPrerequisite_course_id() {
        return prerequisite_course_id;
    }

    public void setPrerequisite_course_id(COURSES prerequisite_course_id) {
        this.prerequisite_course_id = prerequisite_course_id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getMin_grade() {
        return min_grade;
    }

    public void setMin_grade(String min_grade) {
        this.min_grade = min_grade;
    }
}
