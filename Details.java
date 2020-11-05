public class Details
{
public static void main(String[] chance)
{
	System.out.println("fields value from class Student");
	System.out.println("name of student: " + Student.name);
	System.out.println("phone number: " + Student.phoneNumber);
	System.out.println("Student email Id: " + Student.email);
	System.out.println("Branch name: " + Student.branchName);
	System.out.println("semester: " + Student.semester);
	System.out.println("**************************************************");
	
	System.out.println("fields value from class ClassRoom");
	System.out.println("Semester: " + ClassRoom.semester);
	System.out.println("Branch name: " + ClassRoom.branchName);
	System.out.println("Name of the class teacher: " + ClassRoom.classTeacher);
	System.out.println("no. of subjects: " + ClassRoom.noOfSubjects);
	System.out.println("number of student in class:" + ClassRoom.noOfStudentsInAClass);
	System.out.println("number of teaching staff: " + ClassRoom.noOfTeachingStaffs);
	System.out.println("**************************************************");
	
	System.out.println("fields value from class Branch");
	System.out.println("branch name is: " + Branch.branchName);
	System.out.println("branch code: " + Branch.branchCode);
	System.out.println("number of students in branch: " + Branch.studentsInBranch);
	System.out.println("number of staffs: " + Branch.numberOfStaffs);
	System.out.println("head of department is: " + Branch.headOfTheDepartment);
	System.out.println("**************************************************");
	
	System.out.println("fields value from class College");
	System.out.println("name of the college is: " + College.name);
	System.out.println("phone number: " + College.phoneNo);
	System.out.println("email id: " + College.email);
	System.out.println("city: " + College.city);
	System.out.println("pincode is: " + College.pinCode);
	System.out.println("district: " + College.district);
	System.out.println("number of branches: " + College.numberOfBranches);
	System.out.println("**************************************************");
	
	System.out.println("fields value from class University");
	System.out.println("name of university: " + University.nameOfUniversity);
	System.out.println("city: " + University.city);
	System.out.println("district: " + University.district);
	System.out.println("email: " + University.emailOfUniversity);
	System.out.println("name of the vicechancellor: " + University.nameOfviceChancellor);
	System.out.println("year of established: " + University.yearOfEstablished);
	System.out.println("**************************************************");
	
}



}