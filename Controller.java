package game_toys;

import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    


    public static void ChangeGrade()
    {Scanner input = new Scanner(System.in);
        System.out.println("Введите вероятности попадания в набор выигранных игрушек");
        System.out.println("для машинок от 1 до "+main.PRIZE_SIZE+" :");
        main.Car_Size = input.nextInt();
        System.out.println("для кукол:от 1 до "+(main.PRIZE_SIZE-main.Car_Size)+" :");
        main.Doll_Size = input.nextInt();       
        main.Cube_Size = main.PRIZE_SIZE-main.Car_Size-main.Doll_Size;
        System.out.println("Новые вероятности попадания в набор выигранных игрушек");
        System.out.println("Машинки: "+main.Car_Size); System.out.println("Куклы: "+main.Doll_Size);System.out.println("Кубики: "+main.Cube_Size);
    }
   
    public static void init() {
        main.CarPrize=new ArrayList<>();
        main.CubePrize=new ArrayList<>();
        main.DollPrize=new ArrayList<>();
        main.allToyPrize=new ArrayList<>();
        
       
        for (int i=0;i<main.Car_Size;i++ ){
            main.CarPrize.add(new Car("Car"+i,"Машинка", 1, main.Car_Size));
        }
        for (int i=0;i<main.Cube_Size;i++ ){
            main.CubePrize.add(new Cube("Cube"+i,"Кубики", 1, main.Cube_Size));
            }
        for (int i=0;i<main.Doll_Size;i++ ){
            main.DollPrize.add(new Doll("Doll"+i,"Кукла", 1, main.Doll_Size));
            }            
    
            main.allToyPrize.addAll(main.CarPrize);
            main.allToyPrize.addAll(main.CubePrize);
            main.allToyPrize.addAll(main.DollPrize);
    
    System.out.println("Набор выигранных игрушек: "+main.allToyPrize);              
    }
    
    public static void getPrizeList(ArrayList<BaseToy> allArrayList, char i){
        Scanner input = new Scanner(System.in);
        
        while (i=='y'){
            allArrayList.remove(0);
     
            System.out.println("В наборе остались: "+main.allToyPrize);
            if (allArrayList.isEmpty()){
                i='n';
            menu.dialog_menu(52);
            
        }
        else{
            menu.dialog_menu(51);
            
            i=input.next().charAt(0);
        }
    }

     
    }

    public static void AddToy(ArrayList<BaseToy> allArrayList){
        int selection_add;
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите тип игрушки");
        System.out.println("-------------------------\n");
        System.out.println("1 - Машинка ");
        System.out.println("2 - Кукла");
        System.out.println("3 - Кубик");
        selection_add = input.nextInt();
        switch(selection_add){
            case 1: allArrayList.add(new Car("Car"+11,"Машинка", 1, 1));break;
            case 2: allArrayList.add(new Doll("Doll"+11,"Кукла", 1, 1));break;
            case 3: allArrayList.add(new Cube("Cube"+11,"Кубик", 1, 1));
        }
        System.out.println("Итоговый набор выигранных игрушек: "+main.allToyPrize);
    }
}
