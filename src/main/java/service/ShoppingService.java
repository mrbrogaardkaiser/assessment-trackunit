package service;

import entity.Item;
import entity.ShoppingCart;
import org.springframework.stereotype.Service;
import repository.ShoppingRepository;

import java.util.List;

@Service
public class ShoppingService {
    ShoppingRepository shoppingRepository;

    public ShoppingService(ShoppingRepository shoppingRepository){
        this.shoppingRepository= shoppingRepository;
    }

    public ShoppingCart getShoppingCart(int shoppingCartId){
        return shoppingRepository.getById(shoppingCartId);
    }

    public ShoppingCart addItemToShoppingCart(int shoppingCartId, Item item){
        ShoppingCart shoppingCart = shoppingRepository.getById(shoppingCartId);
        shoppingCart.addItem(item);
        item.setShoppingCart(shoppingCart);
        shoppingRepository.save(shoppingCart);
        return shoppingCart;
    }

    public ShoppingCart removeItemFromShoppingCart(int shoppingCartId, int ItemId){
        ShoppingCart shoppingCart = shoppingRepository.getById(shoppingCartId);
        shoppingCart.removeItem(ItemId);
        shoppingRepository.save(shoppingCart);
        return shoppingCart;
    }

}
