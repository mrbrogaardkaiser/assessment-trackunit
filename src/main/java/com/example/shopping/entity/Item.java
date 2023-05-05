import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item{
    @Id
    private int id;
    private string name;
    private int price;

    @ManyToOne
    private ShoppingCart shoppingCart;
    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }

}