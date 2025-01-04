import java.util.*;
public class numbergame {
    public static void game(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("you have total 15 attemps to guess the number");
        int attempts=15;
        int count=0;
        int round=0;
        System.out.print("enter a number between 1 and 100 : ");
        int n=sc.nextInt();
        count++;
        int rand_int=rand.nextInt(100);
        while(count<=attempts){
            count++;
            if(n<rand_int){
                System.out.println("number too low");
                System.out.print("enter again : ");
                n=sc.nextInt();
            }
            if(n>rand_int){
                System.out.println("number too high");
                System.out.print("enter again : ");
                n=sc.nextInt();
            }
            if(n==rand_int){
                System.out.println("Yayy! you guessed the number right");
                System.out.println("you took total "+count+" tries to reach the number");
                break;
            }
            if(count==attempts){
                System.out.println("you have reached maximum attempts");
                break;
            }
        }
        round++;
    }
    public static void main(String args[]){
        int round=0;
        game();
        round++;
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to play again : (Yes/No)");
        String choice=sc.next();
        if(choice=="Yes"){
            game();
            round++;
        }
        else if(choice=="No"){
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println("You played "+round+" games");
            System.out.println("You won "+round+"games");
            System.out.println("------------------------------------------------------");
        }

    }
}
