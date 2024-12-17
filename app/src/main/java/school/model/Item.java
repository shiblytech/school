package school.model;
import com.androix.model.Identifiable;

public class Item extends Identifiable {
    private String itemId;
    private String itemName;
    private String itemQuantity;
    private String itemPrice;
    private String itemDistributor;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDistributor() {
        return itemDistributor;
    }

    public void setItemDistributor(String itemDistributor) {this.itemDistributor = itemDistributor;
    }

}