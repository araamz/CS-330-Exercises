public class CourseModel {

  private int CourseNumber;
  private String CourseName;
  private String CourseDescription;

  public int get_CourseNumber() {

    return this.CourseNumber;

  }

  public String get_CourseName() {
    
    return this.CourseName;
    
  }
  
  public String get_CourseDescription() {

    return this.CourseDescription;

  }
  

  public void set_CourseNumber(int number){
    this.CourseNumber = number;
  }

   public void set_CourseName(String name){
    
    this.CourseName = name;

  }

   public void set_CourseDescription(String description){

    this.CourseDescription = description;
    
  }
  
}