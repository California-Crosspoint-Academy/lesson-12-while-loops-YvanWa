public class exercise{
    public static void main(String[]args){
        //1
        //while(condition){
        //code
        //}
        
        //2
        //do{
        //code
        //}while(condition);

        //3
        int m=97,k=1,p=2;
        while(m<=195){
            k=k*k+3*m;
            p=p+m+1;
            m++;
        }System.out.println(p+k);
    
        //4
        int v=2;
        do{
            k=k*k+3*m;
            v*=3;
            q=Math.sqrt(q+v+1);
        }while(v<=195);

        //
    }
}