import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class ShoppingCart{
    @Id
    private int id;
    private string name;
    private int totalPrice;

    @ManyToOne(mappedBy = 'shoppingcart')
    private Set<Item> items = HashSet<>();

    public void addItem(Item item){items.add(item)}




}