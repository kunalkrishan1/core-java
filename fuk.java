//pankaj lecture 2 day 1
class fuk{
    int x=20;//non static variable belongs from obj when we create non static variable it get loaded into obj
    int y=10;//non staic created inside class outside method
    public static void main(String[]args){
        fuk f1=new fuk();
        fuk f2=new fuk();
        System.out.println(f1.x);
        System.out.println(f2.x);   

        System.out.println("hello world");
    }
}//without creating object non static variable cannot be accessed
/*l3 day 2
*objet always created in heap memory but the address of the object is stored in stack memory
*the closing bracket of main method is the end of the program and the object created in heap memory will be destroyed by garbage collector
*the garbage collector is a part of JVM which is responsible for destroying the object created in heap memory
*the main method execution done will not get removed from stack it will popped off the stack memory and the program will be terminated,the address of object no longer present in stack so,you cant access those object and it will removed by garbage collector
*/