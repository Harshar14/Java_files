import java.util.*;
public class switchcase{
    public static void main(String args[]){
        int choice;
        System.out.println(" Pick one: 1. hi \n 2.hello \n 3. hey\n");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("You said hi");
            break;
            case 2 : System.out.println("You said hello");
            break;
            case 3 : System.out.println("You said hey");
            break;
            default : System.out.println("Invalid choice"); 
        }
    }
}
