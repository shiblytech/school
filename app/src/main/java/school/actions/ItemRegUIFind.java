package school.actions;

import com.androix.FBaseAction;
import school.app.F;
import school.model.Item;

public class ItemRegUIFind extends FBaseAction {
    @Override
    public void execute() throws Exception {
        if(validate()){
            Item item = (Item) getViewModel("Item");
            Long iId = item.getId();
            Item item1 = F.find(Item.class,iId);
            updateViewModel("Item",item1);
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
        }else{
            addMessage("msg","Enter the ID.");
            return false;
        }
        return true;
    }
}
