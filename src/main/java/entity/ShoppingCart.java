package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class ShoppingCart {
    @Id
    private int id;
    private int priceTotal;

    @OneToMany(mappedBy = "shoppingCart")
    private List<Item> items = new ArrayList<>();


    public void addItem(Item item){items.add(item);}

    public void removeItem(int itemID){
        for (Item item : items){
            if(item.getId()==itemID){
                items.remove(item);
            }
        }

    }

}
