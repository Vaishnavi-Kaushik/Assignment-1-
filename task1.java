class student {
    String Name;
    int RollNumber;
    String Course;
    int Age;

    public void studentInfo() {
      
        System.out.println("Name : " + this.Name);
        System.out.println("RollNumber : " + this.RollNumber);
        System.out.println("Course : " + this.Course);
        System.out.println("Age : " + this.Age);
    }
}




public class task1{
    public static void main(String[] args) {

        // For student 1 object
        student s1 = new student();
        s1.Name = "Vaishnavi";
        s1.RollNumber = 15;
        s1.Course = "B.tech";
        s1.Age = 18;

       // For student 2 object
        student s2 = new student();
        s2.Name = "Ram";
        s2.RollNumber = 12;
        s2.Course = "BCA";
        s2.Age = 19;

       // For student 3 object
         student s3 = new student();
         s3.Name = "Ajay";
         s3.RollNumber = 13;
         s3.Course = "MBA";
         s3.Age = 20;

         System.out.println("Information of Student 1 ");
         s1.studentInfo();
         System.out.println("Information of Student 2 ");
         s2.studentInfo();
         System.out.println("Information of Student 3 ");
         s3.studentInfo();


         
    }
}

