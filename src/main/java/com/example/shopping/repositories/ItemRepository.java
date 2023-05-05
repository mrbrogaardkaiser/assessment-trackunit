

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Rider> findItemByShppingCart_Id(int id);

}