/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class PROGRAM_COURSES {

    private String id;
    private PROGRAMS program_id;
    private COURSES course_id;
    private int semester_order;
    private String course_type;
    private boolean is_active;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public PROGRAMS getProgram_id() {
        return program_id;
    }

    public void setProgram_id(PROGRAMS program_id) {
        this.program_id = program_id;
    }


    public COURSES getCourse_id() {
        return course_id;
    }

    public void setCourse_id(COURSES course_id) {
        this.course_id = course_id;
    }


    public int getSemester_order() {
        return semester_order;
    }

    public void setSemester_order(int semester_order) {
        this.semester_order = semester_order;
    }


    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }


    public boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
