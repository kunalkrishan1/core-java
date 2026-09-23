class info  {
    
    
    info(int x ,int y){
        System.out.println(x);
        System.out.println(y);
    }
    info(int l){
        this(100,200);
        System.out.println(l);

    }
    info(){
        this(5);
    }
    public static void main(String[]args){
        info a1= new info();
    }

}
