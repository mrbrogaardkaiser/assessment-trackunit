package api;

import entity.Item;
import entity.ShoppingCart;
import org.springframework.web.bind.annotation.*;
import service.ShoppingService;
//
@RestController
@RequestMapping("api/shoppingcarts")
public class ShoppingController {
    ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService){
        this.shoppingService=shoppingService;
    }

    @GetMapping("/{id}")
    ShoppingCart getShoppingCart(@PathVariable int id){
        return shoppingService.getShoppingCart(id);
    }

    @PostMapping("/{id}")
    ShoppingCart addItemToShoppingCart(@PathVariable int id, Item item){
        return shoppingService.addItemToShoppingCart(id, item);
    }

    @DeleteMapping("/{shoppingCartId}/items/{itemID}")
    ShoppingCart removeItemFromShoppingCart(@PathVariable int shoppingCartId, @PathVariable int itemID){
        return shoppingService.removeItemFromShoppingCart(shoppingCartId, itemID);
    }




}
