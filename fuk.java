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
//-----------------------------------------------------------------------------
/*l3 day 2
*objet always created in heap memory but the address of the object is stored in stack memory
*the closing bracket of main method is the end of the program and the object created in heap memory will be destroyed by garbage collector
*the garbage collector is a part of JVM which is responsible for destroying the object created in heap memory
*the main method execution done will not get removed from stack it will popped off the stack memory and the program will be terminated,the address of object no longer present in stack so,you cant access those object and it will removed by garbage collector
*/
//------------------------------------------------------------------------------
/* day 2 lecture 4  
types of variable in java:
local variable: variable created inside method and it will be destroyed when the method execution is done.
*they have restriction that they cannot be accessed outside the method.
*without initialization they cannot be used because they are not loaded into memory until the method is called.
example:
int x=10;//right
int y;//wrong :created but not initialized
-------------------------------------------------------------------------------------------------------
non static variable/instance: variable created inside class outside method and it will be destroyed when the object is destroyed
*local and non staic variable name can be same but static non static cannot be same.
 *non static variable copies a dependent on a object that you create if i create two object variable x copies of two ,per object one variable x ,if i create 10 objects those 10 objeects have 10 variable and all these 
 variable are diffrent as sipmple as that mtalb hum ek non static variable create kiye aur 3 object do sab me ek copy ho jayega aur jab hum data manipulate karenge to sara me allag value hoga

-----------------------------------------------------------------------------------------
static variable: variable created inside class with static keyword and it will be destroyed when the program execution is done
*it is not mandatory to initialize static variable because,if we dont initialize it,java will provide default value to it depending on the data type of the variable.


class a{
    int x=10;//non static variable
    static int y=20;//static variable
    public static void main(String[]args){
        a a1=new a();
        System.out.println(a1.x);//non static variable accessed using object reference variable
        System.out.println(y);//static variable accessed using class name ,static belongs to class so if we want to access static variable we can access it using class name (not like this a1.x//wrong approach)
    }
}
    program 2 [
    class b{
    static int x=10;//static variable
    public static void main(String[]args){
    int y=10;
    System.out.println(y);
    System.out.println(b.x);//static variable accessed using class name`
     b a1=new b();
     a1.test();//create object to call test ()method

    }
     public void test(){
     System.out.println(y);//error if we want to use y we need to convert into non satic variable,the reason of the error is local varible y is locak variable and they hav restricted scope we cant able use outside class and method

     System.out.println(b.x);//5
     
     }
    
*static variable is & local variable name can be same but
local :directly(access)
static : through object
    
    ]  
      
    
referenece varaible: 

it used to store object address.
*can store null value when object is not created 
note:it can store object adress or null values .
*data type of refrence variable is class name 

 */
/*
---------------------------------------------------------------------------------------------------------
camel casing:
whenever a variable is created with more than one word the first word will be in small letter and the second word will be in capital letter and so on.

int averageMarks=10;
$ and _ are allowed in variable name but not recommended to use.//special character are not allowed in variable name except $ and _.
int 2age=10;//wrong because variable name cannot start with number
int age2=10;//right because variable name can end with number

camel casing () method
camel casing and no parenthesis ()  means variable and camel casing with parenthesis () means method

---------------------------------------------------------------------------------------------------------------
lecture 6  day 2
:
methods
-------
void method: method which does not return any value is called void method
example:
class a{    
    
    public static void main(String[]args){
        
    }
    public void test(){
    return 100;//error because void method cannot return any value
    }
exampel 2:
class a{
public static void  main{String[]args){
a a1=new a();
boolean result=a1.test();
System.out.println(result);
}

public boolean test{
return true;
}
}

--------------------------------------------------------------------------------
return keyword: it is used to return a value from a method to the calling method.
*it is optional to use return keyword in void method but it is mandatory to use return keyword in non void method because non void method should return a value to the calling method.
*we only use return keyword in void method.

class a{
public static void main(String args[]){
 a a1=new a();
 a1.test();
 System.out.println(200);
 
 
 }
public void test(){
System.out.println(100);
return;// go back to the calling method in line 4 and execute the next line of code in the calling method
System.out.println(300);//error because after return keyword no code can be executed in the method
}

}

------------------------------------------------------------------------------------------------------
return value:
we use "return value" keyword inside non void method only.
*it is mandatory to use return value in non void method because non void method should return a value to the calling method.
*it will return control and value to the calling statement in the calling method.

// method argument: it is used to pass value from calling method to called method.
class a{
public static void main(String[]args){
a a1 =new a();
a1.test(10,20,"pankaj");

}
public void test(int x,int y,String name){
System.out.println(x);
System.out.println(y);
System.out.println(name);
}
}

-----------------------------------------------------------------------------------------
lecture 7 day 2

constructor: it is a special type of method which is used to initialize the object.
------------
*constructor name should be same as class name and it should not have any return type.
*whenever we create an object constructor will be called automatically and it will initialize the object.
*if we use void keyword and then create a constructor it will be treated as a method not a constructor because constructor should not have any return type.

class A {

    A() {
        // Constructor
    }

    void A() {
        // Method
    }
}


------------
class a{
a(){
System.out.println("constructor called");}
    public static void main(String[]args){
        a a1=new a();
        a a2=new a();
        a a3 =new a();
    }
     ---------   -------------------------------------------------------------------------------
        public class a{
        a(int x){//*local variable x is created inside the constructor
System.out.println(x);
        }
        System.out.println(x);//error because local variable x cannot be accessed outside the constructor
        }
        public static void main(String[]args){
        a a1=new a(10); 
        a a2=new a(20);
        a a3=new a(30);
        }
}


constructor can never return any value because it is void.
---------------------------------------------------------------------------------------
constructor overloading: it is a process of creating multiple constructor with different argument in the same class.

class a{

a()//no of args =0{
System.out.println("constructor with no args");
}
a(int x)//no of args =1{
System.out.println(x);
}
a (int x,int y)//no of args =2{
System.out.println(x,y);


}
public static void main(String[]args){
a a1=new a();
a a2=new a(10);
a a3=new a(10,20);
}
2ndd example:

class a{
 A(int x)//no of args =1{
 type=Int
 System.out.println(x);
 }
 A(boolean x,boolean y)//no of args =2{
 System.out.println(x,y);
 }
public static void main(String[]args){
 a a1=new a(10);
 a a2=new a(true,false);
 }
}
 ----------------------------------------------------------------------------------------------------
LECTURE 8 DAY 3
-----------------------------------
THIS KEYWORD: it is used to refer current class instance variable.
*it is used to differentiate between local variable and instance variable when they have same name.
*specal refrence variable that hold object address
*using rhis keyword we can access the non static members of the class

A a1 = new A();
      ↓
Object created

a1.test1();
      ↓
test1() starts
      ↓
this = current A object
      ↓
this.test2();
      ↓
same A object's test2()
      ↓
From Test 2

program1    
--------
class a{
            public static void main(String[]args){
                a a1=new a();
                a1.test1();

                a a2=new a();
                a2.test1();
                a1.test1();
                {
                public void test1(){
                System.out.println("from test1");}
        }
-------------------------
limitation : we cannot use this keyword inside static method because static method belongs to class and it is not dependent on object but this keyword is used to refer 
current class instance variable which is dependent on object so, we cannot use this keyword inside static method.

-------------
program 2
class a{
        public static void main(String[]args){
        a a1=new a();
        a1.test1();
        {
        public static void test1(){
        System.out.println(this);//error because this keyword cannot be used inside static method
        }
        }
 ----------------------------------------------------------
 program 3:

 class a{
       static int x=10;
       public static void main(String[]args){
}
       public void test1(){
       System.out.println(this.x);this .x---> converted into a.x but this is a wrong approach 
        
       
       }

 }//earlier i was using a method .using inside a method u can do,but acessing a static member u can do but this is the wrong approach .

---------------------------------------------------------------------



























*/