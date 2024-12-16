package school.actions;

import com.androix.FBaseAction;

import school.model.Item;
import school.model.Student;

public class ItemRegUIFind extends FBaseAction {
    @Override
    public void execute() throws Exception {
        Item s= (Item) getViewModel("Item");
        addMessage("msg","Details:"+s.getItemNo()+"\n"+
                s.getItemName()+" "+s.getItemQuantity()+" "+s.getItemPrice()+" "+s.getItemDistributor());
    }
}
