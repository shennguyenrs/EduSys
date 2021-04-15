package EduSys.com;

public class CourseInfo {

  // Private variables
  private int courseId;
  private String name;
  private String description;
  private String lecturer;
  private String enrolBegin;
  private String enrolEnd;
  private String startFrom;
  private String endAfter;

  // Constructor
  public CourseInfo(
    int id,
    String name,
    String description,
    String lecturer,
    String enrolBegin,
    String enrolEnd,
    String startFrom,
    String endAfter
  ) {
    this.courseId = id;
    this.name = name;
    this.description = description;
    this.lecturer = lecturer;
    this.enrolBegin = enrolBegin;
    this.enrolEnd = enrolEnd;
    this.startFrom = startFrom;
    this.endAfter = endAfter;
  }

  // Set functions
  public void setId(int id) {
    this.courseId = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setEnrolBegin(String enrolBegin) {
    this.enrolBegin = enrolBegin;
  }

  public void setEnrolEnd(String enrolEnd) {
    this.enrolEnd = enrolEnd;
  }

  public void setStartFrom(String startFrom) {
    this.startFrom = startFrom;
  }

  public void setEndAfter(String endAfter) {
    this.endAfter = endAfter;
  }

  // Get functions
  public int getId() {
    return courseId;
  }

  public String getName() {
    return name;
  }

  public String getLecturer() {
    return lecturer;
  }

  public String getDescription() {
    return description;
  }

  public String getEnrolBegin() {
    return enrolBegin;
  }

  public String getEnrolEnd() {
    return enrolEnd;
  }

  public String getStartFrom() {
    return startFrom;
  }

  public String getEndAfter() {
    return endAfter;
  }
}
