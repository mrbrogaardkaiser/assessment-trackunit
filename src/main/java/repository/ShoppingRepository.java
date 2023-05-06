package repository;

import entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<ShoppingCart,Integer> {

}
