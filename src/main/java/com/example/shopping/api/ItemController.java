@RestController
@RequestMapping("api/items")
public class ItemController {

    ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService=itemService;

    }

    @GetMapping
    public List<Item> getItems(@RequestParam(value = "shoppingcart", required = false)int id){
        return itemService.getItems(id);
    }

    @PostMapping
    public Item addItem(Item item){
        return itemService.addItem(item);
    }


    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }

}