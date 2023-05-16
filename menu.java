package game_toys;



public class menu {
    
    
    public static void dialog_menu (int i){
    switch(i){
        case 1: System.out.println("По умолчанию создается выигрыш из 10 игрушек со следующей частотой выпадания: машинки - 5 шт, куклы - 2 шт, кубики- 3 шт");break;
        case 2: System.out.println("Изменить вероятности попадания в набор выигранных игрушек? y/n"); break;
        case 3:System.out.println("Создается набор выигранных игрушек"); break;
        case 4:System.out.println("Хотите добавить еще одну игрушку к набору выигранных игрушек? y/n"); break;
        case 5:System.out.println("Хотите забрать выигранную игрушку из набора? y/n"); break;
        case 51:System.out.println("Хотите забрать еще выигранную игрушку из набора? y/n"); break;
        case 52:System.out.println("Выигранные игрушки закончились");break;
        case 6:System.out.println("Выход из программы"); 
    }
   
}
}
