package VLmongobaeldung.repository;

public interface CustomItemRepository {

    void updateItemQuantity(String itemName, float newQuantity);

}
