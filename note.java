//yvan
public class note{
    public static void main(String[]args){
    //FOR LOOP   
        for (int i = 0; i < 5; i++) { 
        System.out.println(i); 
        } 
    //Best when you know how many times to loop. 
    //Has 3 parts in parentheses: initialization, condition, update. 
    //Condition is checked before each iteration. 

    //while loop
        int k = 0; 
        while (k < 5) { 
        System.out.println(k); 
        k++; 
        } 
    //Best when you don’t know in advance how many times to loop. 
    //Only has a condition. 
    //Runs while condition is true. 
    //If condition is false at the start, it may run zero times. 
    
    //do while loop
        int j = 0; 
        do { 
        System.out.println(j); 
        j++; 
        } while (j < 5); 
    //Always runs the body at least once. 
    //Condition is checked after the loop body. 
    //Good for menus or user input, where you want one guaranteed run. 
    
    //Summary 
    //Use for when counting. 
    //Use while when waiting. 
    //Use do-while when you need it to happen at least once. 

    int sum=0;
    int f=3;
    do{
        sum=sum+f;
        f++;
    }while(f<=79);
    System.out.println(sum);
    
    int sum1=0,a;
    for(a=3;a<=79;a++){
        sum1=sum1+a;
    }
    System.out.println(sum1);

    int sum2=0;
    int b=3;
    while(b<=79){
        sum2=sum2+b;
        b++;
    }
    System.out.println(sum2);
    }
}