

class student {

    String name = "sourav Kumar";
    int roll = 2409146;
    final boolean present = true;

    public void printData() {
        System.out.println("name is : " + name);
        System.out.println("roll is : " + roll);
        System.out.println("is present : " + present);
    }
}

public class oops {
    public static void main(String[] args) {

        // we could not access the variables name and roll and present without making the object of the class or making that variable static
        // System.out.println(name);

        // making object of the class
        student std1 = new student();

        // System.out.println(std1.roll);
        // std1.name = "vasu Gorai";
        // System.out.println(std1.name);
        // System.out.println(std1.present);
        std1.printData();

        // another object of the class 
        student std2 = new student();
        std2.name = "ashutosh singh chaoudhary";
        std2.printData();
        
        // we cannot change the final variables 
        // std1.present = false;

        
    }
}