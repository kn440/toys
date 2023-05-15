package game_toys;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static final int  PRIZE_SIZE =10;
    public static int Car_Size = 5;
    public static int Cube_Size = 3;
    public static int Doll_Size = 2;
    public static ArrayList<Car> CarPrize;
    public static ArrayList<Cube> CubePrize;
    public static ArrayList<Doll> DollPrize;
    public static ArrayList<BaseToy> allToyPrize;
    public static char yes_no;


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        menu.dialog_menu(1);
        menu.dialog_menu(2);
        yes_no= input.next().charAt(0);
        if (yes_no=='y'){
            Controller.ChangeGrade();
        }
        
        menu.dialog_menu(3);
        Controller.init();
        
        
        menu.dialog_menu(4);
        yes_no= input.next().charAt(0);
        if (yes_no=='y'){
            Controller.AddToy(allToyPrize);
        }
        
        menu.dialog_menu(5);
        yes_no= input.next().charAt(0);
        if (yes_no=='y'){
            Controller.getPrizeList(allToyPrize);
        }
       
        menu.dialog_menu(6);
        
        System.exit(0);
        
    }

    

    
    
   

}
