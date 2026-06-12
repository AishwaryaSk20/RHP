import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] A= new int[n];
        for(int i=0;i<n; i++){
            A[i]=sc.nextInt();
        }
        int[] B= new int[m];
        for(int j=0;j<m;j++){
            B[j]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int c=0;
        for(int i=n-1,j=m-1; i>=0 && j>=0; i--,j--){
            if(B[j]<=A[i]*2){
                c+=1;
            }
            else{
                j--;
            }
        }
        System.out.println(c);
    }
}