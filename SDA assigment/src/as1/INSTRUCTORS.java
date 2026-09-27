/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class INSTRUCTORS {
    public String id;
    public String employee_no;
    public String national_id;
    public String first_name;
    public String last_name;
    public String email;
    public DEPARTMENTS department_id;
    public String title;
    public String specialization;
    public String hire_date;
    public boolean is_active;

public INSTRUCTORS(){
}
public String getid(){
    return id;
}
public void setid(String id){
    this.id=id;
}
public String getemployee_no(){
    return employee_no;
}
public void setemployee_no(String employee_no){
    this.employee_no=employee_no;
}
public String getnational_id(){
    return national_id;
}
public void setnational_id(String national_id){
    this.national_id=national_id;
}
public String getfirst_name(){
    return first_name;
}
public void setfirst_name(String first_name){
    this.first_name=first_name;
}
public String getlast_name(){
    return last_name;
}
public void setlast_name(String last_name){
    this.last_name=last_name;
}
public String getemail(){
    return email;
}
public void setemail(String email){
    this.email=email;
}
public DEPARTMENTS getdepartment_id(){
    return department_id;
}
public void setdepartment_id(DEPARTMENTS depratment_id){
    this.department_id=department_id;
}
public String getitle(){
    return title;
}
public void settitle(String title){
    this.title=title;
}
public String getspecialization(){
    return specialization;
}
public void setspecialization(String specialization){
    this.specialization=specialization;
}
public String gethire_date(){
    return hire_date;
}
public void sethire_date(String hire_date){
    this.hire_date=hire_date;
}
public boolean getis_active(){
    return is_active;
}
public void setis_active(boolean is_active){
    this.is_active=is_active;
}

}