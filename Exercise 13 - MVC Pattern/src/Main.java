// Nasrin Juana
// Araam Zaremehrjardi
class Main {
  public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      CourseModel model  = retriveCourseFromDatabase();

      //Create a view : to write student details on console
      CourseView view = new CourseView();

      CourseController controller = new CourseController(model, view);

      controller.updateView();

      //update model data
      controller.set_CourseNumber(330);
      controller.set_CourseDescription("Design Patterns and Implementation.");

      controller.updateView();
   }

   private static CourseModel retriveCourseFromDatabase(){
      CourseModel course = new CourseModel();
      course.set_CourseName("CS");
      course.set_CourseNumber(425);
      course.set_CourseDescription("Software Engineering and Senior Capstone Design.");
      return course;
   }
}