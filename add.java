public class add {
    public static void main(String[] args) {
        int sum[]={99,99};
        int lpg[]={98,98};
        int opp[]= new int[sum.length];

        for(int i=0;i<sum.length;i++){
            opp[i]=sum[i]+lpg[i];
        }
        for(int i=0;i<opp.length;i++){
System.out.println(opp[i]);
        }
      
    }
}
