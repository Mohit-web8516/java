public class ClassThisDemo {
    int rollNo;
    String name;


    //constructor

    ClassThisDemo(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    //display 
    void display (){
        System.out.println(rollNo + " " + name);
    }
    public static void main (String[] args){
        ClassThisDemo s1 = new ClassThisDemo(1, "rohan");
        ClassThisDemo s2 = new ClassThisDemo(2 , "rina");

        s1.display();
        s2.display();
    }


}


