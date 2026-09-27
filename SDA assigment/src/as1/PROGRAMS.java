/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class PROGRAMS {
    private String id;
    private String code;
    private String name;
    private DEPARTMENTS department_id;
    private String degree_level;
    private int total_credits;
    private int duration_years;
    private String language;
    private boolean is_active;
    
    
    
    public PROGRAMS(){
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
    public DEPARTMENTS getdepartment_id(){
        return department_id;
    }
    public void setdepartment_id(DEPARTMENTS department_id){
        this.department_id=department_id;
    }
    public String getdegree_level(){
        return degree_level;
    }
    public  void setdegree_level(String degree_level){
        this.degree_level=degree_level;
        
    }
    public int gettotal_credits(){
        return total_credits;
        
    }
    public void settotal_credits(int total_credits){
        this.total_credits=total_credits;
    }
      public int getduration_years(){
        return duration_years;
        
    }
    public void setduration_years(int duration_years){
        this.duration_years=duration_years;
    }
         public String getlanguage(){
        return language;
    }
    public void setlanguage(String language){
        this.language=language;
        
    }
    public boolean getis_active(){
        return is_active;
        
    }
    public void setis_active(boolean is_active){
        this.is_active=is_active;
    }

    
    
    
    
    }

