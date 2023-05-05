import ItemRepository

@Service
public class ItemService{
    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> getItems(int shoppingCartid){
        List<Items> item = itemRepository.findItemByShppingCart_Id(shoppingCartid)

    }

    public Item addItem(Item item){
        Item newItem = itemRepository.save(item);
        return item;
    }

    public void deleteItem(int id){
        itemRepository.deleteById(id);
    }




}

