package People;

public class HotCrossBuns implements Consumable {
    @Override
    public void eat(Person x){
        x.gainMaxHealth(10);
        x.restoreHealth(10);
    }

    public String getName(){
        return "Hot Cross Buns";
    }
}
