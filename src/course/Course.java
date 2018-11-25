/*
 * 
 * Course class with variables and method
 * 
 *      --------------------------------
 *      |           Course             |
 *      --------------------------------
 *      | + name: String               |
 *      | + semester: String           |
 *      | + noOfModules: int           |
 *      --------------------------------
 *      | + createModule()             |
 *      --------------------------------
 *      
 * 
 * A course has a default name: "Course" + n++
 * The user can rename the course's name
 * The courses are stored in a CourseDB as an ArrayList
 * The user can type in a date that is displayed on the course??
 * The course holds a number of modules, the number of modules are 
 * displayed on the course
 * 1 method: createModule
 * allows the user to select how many modules should be attached to the 
 * individual course
 */
package course;


public class Course {
    
    public String name;
    public String semester;
    public int noOfModules;
    
    public Course() {
        /**
         * default name of the course item, if the user doesn't name it
         * default name of the semester item, if the user doesn't name it
         * 
         */
        name = "Course";    //can a number be added as well? n++
        semester = "Semester";  //
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
