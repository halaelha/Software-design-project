/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as1;

/**
 *
 * @author LENOVO
 */
public class main {
  public static void main(String[] args){
     
        // 1. FACULTY
        FACULTIES faculty = new FACULTIES();

        faculty.setid("");
        faculty.setcode("ENG");
        faculty.setname("FACULTY OF ENGINEERING AND NATURAL SCIENCES");
        faculty.setphone("");
        faculty.setemail("@stu.atlas.edu.tr");
        faculty.setis_active(true);


        // 2. DEPARTMENT
        DEPARTMENTS department = new DEPARTMENTS();

        department.setid("0504001");
        department.setcode("0504");
        department.setname("DEPARTMENT OF SOFTWARE ENGINEERING/0504001-DEPARTMENT OF SOFTWARE ENGINEERING (ENGLISH)");

        // Connect Department -> Faculty
        department.setfaculty_id(faculty);

        department.setphone("");
        department.setemail("@stu.atlas.edu.tr");
        department.setis_active(true);


        // 3. INSTRUCTOR
        INSTRUCTORS instructor = new INSTRUCTORS();

        instructor.setid("0000-0003-3116-1184");
        instructor.setemployee_no("");
        instructor.setnational_id("58833416500");
        instructor.setfirst_name("ALI");
        instructor.setlast_name("GUNES");
        instructor.setemail("ali.gines@atlas.edu.tr");

        // Connect Instructor -> Department
        instructor.setdepartment_id(department);

        instructor.settitle("Dr.");
        instructor.setspecialization("Software");
        instructor.sethire_date("not specified");
        instructor.setis_active(true);


        // Now we can connect Department -> Head Instructor
        department.sethead_instructor_id(instructor);

        // Faculty -> Dean
        faculty.setdean_id(instructor);


        // 4. PROGRAM
        PROGRAMS program = new PROGRAMS();

        program.setid("");
        program.setcode("0504");
        program.setname("DEPARTMENT OF SOFTWARE ENGINEERING (ENGLISH)");

        // Program -> Department
        program.setdepartment_id(department);

        program.setdegree_level("bachelor degree");
        program.settotal_credits(240);
        program.setduration_years(4);
        program.setlanguage("English");
        program.setis_active(true);


        // 5. STUDENT
        STUDENTS student = new STUDENTS();

        student.setId("250504518");
        student.setStudent_no("250504518");
        student.setNational_id("");
        student.setFirst_name("HALA");
        student.setLast_name("EL HAJ");
        student.setBirth_date("2007-08-21");
        student.setGender("K/F");
        student.setEmail("250504518@st.atlas,edu.tr");
        student.setPhone("5015428283");
        student.setAddress("Istanbul");

        // Student -> Program
        student.setProgram_id(program);

        student.setEnrollment_year(2025);
        student.setClass_year(2);
        student.setStatus("aktif");
        student.setPhoto_url("");
        student.setCreated_at("2025-09-27");


        // 6. COURSE
        COURSES course = new COURSES();

        course.setId("1413211013");
        course.setCode("1413211013");
        course.setName("Software Design and Architecture");

        // Course -> Department
        course.setDepartment_id(department);

        course.setCredits(6);
        course.setTheory_hours(3);
        course.setLab_hours(2);
        course.setCourse_type("zorunlu");
        course.setLanguage("English");
        course.setDescription("Software Design and Architecture");
        course.setIs_active(true);


        // 7. SECOND COURSE
        // Needed to demonstrate prerequisite
        COURSES course2 = new COURSES();

        course2.setId("1413211013");
        course2.setCode("1413211013");
        course2.setName("Object Oriented Programming");
        course2.setDepartment_id(department);
        course2.setCredits(6);
        course2.setTheory_hours(3);
        course2.setLab_hours(2);
        course2.setCourse_type("zorunlu");
        course2.setLanguage("English");
        course2.setIs_active(true);


        // 8. COURSE PREREQUISITE
        COURSE_PREREQUISITES prerequisite =
                new COURSE_PREREQUISITES();

        prerequisite.setId("pr");

        // SE102 is the course
        prerequisite.setCourse_id(course2);

        // SE101 is required before SE102
        prerequisite.setPrerequisite_course_id(course);

        prerequisite.setType("zorunlu");
        prerequisite.setMin_grade("DD");


        // 9. ACADEMIC TERM
        ACADEMIC_TERMS term = new ACADEMIC_TERMS();

        term.setId("T1");
        term.setCode("2026-1");
        term.setName("2026-27 Güz");
        term.setAcademic_year("2026-2027");
        term.setSemester("güz");
        term.setStart_date("2026-09-14");
        term.setEnd_date("2027-01-20");
        term.setRegistration_start("2026-09-21");
        term.setRegistration_end("2026-09-27");
        term.setAdd_drop_end("2026-10-1");
        term.setIs_active(true);


        // 10. PROGRAM COURSE
        PROGRAM_COURSES programCourse =
                new PROGRAM_COURSES();

        programCourse.setId("PC1");

        // Connect Program + Course
        programCourse.setProgram_id(program);
        programCourse.setCourse_id(course);

        programCourse.setSemester_order(1);
        programCourse.setCourse_type("zorunlu");
        programCourse.setIs_active(true);


        // TEST / PRINT
        System.out.println("Student: "
                + student.getFirst_name()
                + " "
                + student.getLast_name());

        System.out.println("Program: "
                + student.getProgram_id().getname());

        System.out.println("Department: "
                + student.getProgram_id()
                         .getdepartment_id()
                         .getname());

        System.out.println("Course: "
                + course.getName());

        System.out.println("Prerequisite for "
                + course2.getName()
                + ": "
                + prerequisite
                     .getPrerequisite_course_id()
                     .getName());
    System.out.println("Student ID: " + student.getId());
System.out.println("Student Number: " + student.getStudent_no());
System.out.println("National ID: " + student.getNational_id());
System.out.println("Student Name: " + student.getFirst_name() + " " + student.getLast_name());
System.out.println("Birth Date: " + student.getBirth_date());
System.out.println("Gender: " + student.getGender());
System.out.println("Email: " + student.getEmail());
System.out.println("Phone: " + student.getPhone());
System.out.println("Address: " + student.getAddress());
System.out.println("Enrollment Year: " + student.getEnrollment_year());
System.out.println("Class Year: " + student.getClass_year());
System.out.println("Status: " + student.getStatus());
System.out.println("Photo URL: " + student.getPhoto_url());
System.out.println("Created At: " + student.getCreated_at());

System.out.println("Program ID: " + program.getid());
System.out.println("Program Code: " + program.getcode());
System.out.println("Program Name: " + program.getname());
System.out.println("Degree Level: " + program.getdegree_level());
System.out.println("Total Credits: " + program.gettotal_credits());
System.out.println("Duration Years: " + program.getduration_years());
System.out.println("Program Language: " + program.getlanguage());
System.out.println("Program Active: " + program.getis_active());

System.out.println("Course ID: " + course.getId());
System.out.println("Course Code: " + course.getCode());
System.out.println("Course Name: " + course.getName());
System.out.println("Credits: " + course.getCredits());
System.out.println("Theory Hours: " + course.getTheory_hours());
System.out.println("Lab Hours: " + course.getLab_hours());
System.out.println("Course Type: " + course.getCourse_type());
System.out.println("Course Language: " + course.getLanguage());
System.out.println("Description: " + course.getDescription());
System.out.println("Course Active: " + course.getIs_active());

System.out.println("Student Program: " + student.getProgram_id().getname());
System.out.println("Program Department: " + program.getdepartment_id().getname());
System.out.println("Course Department: " + course.getDepartment_id().getname());
}
}
  
