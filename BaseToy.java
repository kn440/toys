package game_toys;



public abstract class BaseToy {

    String id_toy;
    String name;
    int count;
    int grade;
    public BaseToy(String id_toy, String name, int count, int grade) {
        this.id_toy = id_toy;
        this.name = name;
        this.count = count;
        this.grade = grade;
    }


}
    
