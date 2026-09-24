public class largest {
    
public static void main(String[] args) {
    int arr[]={
        90,45,80,94
    };
    int temp=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>temp){
            temp=arr[i];
        }
    }
    System.out.println("largest :"+temp);
}
}
