import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itens = new ArrayList<Item>();
    
    public void addItem(Item item){
        itens.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;
        
        for(Item item : itens){
            cost += item.price();
        }
        return cost;
    }
    
    public void showItens(){
        for(Item item : itens){
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
