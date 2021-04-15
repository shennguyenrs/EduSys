package EduSys.com;

import EduSys.com.CancelCourse;
import EduSys.com.EditUser;
import EduSys.com.EnrolCourse;
import EduSys.com.ShowEnrolledCourses;
import EduSys.com.UserInfo;
import java.util.Scanner;

public class UserScreen {

  // Private variables
  private int studentId;
  public static Scanner input = new Scanner(System.in);

  // Set functions
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  // Get function
  public int getStudentId() {
    return this.studentId;
  }

  // UserScreen main function
  public void userScreen(int StudentId) throws Exception {
    // Set current user id
    setStudentId(studentId);

    // User guide
    System.out.println("- User Screen -");
    System.out.println("Welcome student " + getStudentId());
    System.out.println();
    System.out.println("Choose a function:");
    System.out.println("1 - View user information");
    System.out.println("2 - Edit current user information");
    System.out.println("3 - Show user's enrolled course(s)");
    System.out.println("4 - Enrol a new course(s)");
    System.out.println("5 - Cancel enrolled course(s)");
    System.out.println("0 - Logout");
    System.out.println();
    System.out.println("Enter your choose:");

    String option = input.next();

    // Goto sub functions
    switch (option) {
      case "1":
        UserInfo currentUser = new UserInfo(studentId);
        currentUser.userInfo();
        break;
      case "2":
        EditUser currentUser = new EditUser(studentId);
        currentUser.mainEditUser();
        break;
      case "3":
        ShowEnrolledCourses currentUser = new ShowEnrolledCourses(studentId);
        currentUser.showEnrolledCourses;
        break;
      case "4":
        EnrolCourse currentUser = new EnrolCourse(studentId);
        currentUser.enrolCourse();
        break;
      case "5":
        CancelCourse currentUser = new CancelCourse(studentId);
        currentUser.cancelCourse();
        break;
      case "0":
        System.out.println("Good bye");
        System.out.println();
        break;
      default:
        System.out.println("Your choose is invalid! Please try again!");
        System.out.println();
    }
  }
}
