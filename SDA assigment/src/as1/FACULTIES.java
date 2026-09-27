/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;


/**
 *
 * @author LENOVO
 */
public class FACULTIES {
    private String id;
    private String code;
    private String name;
    private INSTRUCTORS dean_id;
    private String phone;
    private String email;
    private boolean is_active;
    private String created_at; 
    
    public FACULTIES(){
        
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
    public INSTRUCTORS getdean_id(){
        return dean_id;
    }
    public void setdean_id(INSTRUCTORS dean_id){
        this.dean_id=dean_id;
        
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
      public String getcreated_at(){
        return created_at;
    }
    public void setcreated_at(String created_at){
        this.created_at=created_at;
        
    }



   
}
