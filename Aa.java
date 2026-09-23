 /*class Aa {
    Aa(int x){
        System.out.println(x);
    }
    
    
        

    
   Aa() {

this(100){//second statement whiile calling constructor
System.out.println(55);
    }
    public static void main(String[]args){
Aa b1=new Aa();
    }

}*/
class Aa {

    Aa(int x) {
        System.out.println(x);
    }

    Aa() {
        this(100);
        System.out.println(050);
    }

    public static void main(String[] args) {
        Aa a1 = new Aa();
    }
}
