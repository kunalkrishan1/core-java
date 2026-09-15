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
}