import java.util.Scanner;
public class gradecalc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter marks of subject "+i+" : ");
            int s=sc.nextInt();
            sum+=s;
        }
        int perc=sum/n;
        System.out.println("The sum of marks obtained is : "+sum);
        System.out.println("The Percentage obtained is : "+perc);
        //grading
        if(perc>90 && perc<=100){
            System.out.println("Grade obtained is : A");
        }
        else if(perc>80 && perc<=90){
            System.out.println("Grade obtained is : B");
        }
        else if(perc>70 && perc<=80){
            System.out.println("Grade obtained is : C");
        }
        else if(perc>60 && perc<=70){
            System.out.println("Grade obtained is : D");
        }
        else{
            System.out.println("Sorry ! you are fail");
        }
        

    }
    
}
