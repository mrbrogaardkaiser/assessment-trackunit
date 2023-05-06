package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
public class Item {
    @Id
    private int id;
    private int price;
    private String name;

    @ManyToOne
    private ShoppingCart shoppingCart;

    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public void removeFromShoppingCart(){
        this.shoppingCart=null;
    }
}
