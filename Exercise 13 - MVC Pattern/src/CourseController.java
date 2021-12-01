public class CourseController {

  CourseModel model;
  CourseView view;

  public CourseController(CourseModel model, CourseView view){
    this.model = model;
    this.view = view;
  }

  public void set_CourseName(String name) {

    model.set_CourseName(name);

  }

  public void set_CourseNumber(int number) {

    model.set_CourseNumber(number);

  }

  public void set_CourseDescription(String description) {

    model.set_CourseDescription(description);

  }

  public String get_CourseName() {

    return model.get_CourseName();

  }

  public int get_CourseNumber() {

    return model.get_CourseNumber();

  }

  public String get_CourseDescription() {

    return model.get_CourseDescription();

  }

  public void updateView() {

    view.printCourseView(model.get_CourseNumber(), model.get_CourseName(), model.get_CourseDescription());

  }

}