package school.actions;

import com.androix.SaveAction;
import school.app.F;
import school.model.Item;

public class ItemRegUIRemove extends SaveAction {
    @Override
    public void execute() throws Exception {
        if(validate()){
            Item item = (Item) getViewModel("Item");
            F.remove(item);
            addMessage("msg","Record removed.");
            updateViewModel("Item",null);
        }
    }
    private boolean validate(){
        Item item = (Item) getViewModel("Item");
        if(item.getId() != null){
            Long iId = item.getId();
            Item item2 = F.find(Item.class,iId);
            if(item2 == null){
                addMessage("msg","No such Item ID.");
                return false;
            }
            if(item.getItemName() == null || item.getPrice() == null || item.getBatch() == null || item.getBarcode() == null){
                addMessage("msg","First find a record.");
                return false;
            }
        }else{
            addMessage("msg","First find a record.");
            return false;
        }
        return true;
    }
}
