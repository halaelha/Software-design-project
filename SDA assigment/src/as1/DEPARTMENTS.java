/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class DEPARTMENTS {
      private String id;
    private String code;
    private String name;
    private FACULTIES faculty_id;
    private INSTRUCTORS head_instructor_id;
    private String phone;
    private boolean is_active;
    private String email; 
    
    public DEPARTMENTS(){
        
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id=id;
    }
    public String getcode(){
        return code;
    }
    public void setcode(String code){
        this.code=code;
        
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
        
    }
    public FACULTIES getfaculty_id(){
        return faculty_id;
    }
    public void setfaculty_id(FACULTIES faculty_id){
        this.faculty_id=faculty_id;
        
    }
      public String getphone(){
        return phone;
    }
    public void setphone(String phone){
        this.phone=phone;
        
    }
      public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
        
    }
    public boolean setis_active(boolean par){
       return is_active; 
    }
    public void getis_active(boolean is_active){
        this.is_active=is_active;
            }
      public INSTRUCTORS gethead_instructor_id(){
        return head_instructor_id;
    }
    public void sethead_instructor_id(INSTRUCTORS head_intructor_id){
        this.head_instructor_id=head_instructor_id;
        
    }
}


