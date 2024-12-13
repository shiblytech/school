package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.app.R;

import school.model.Book;
import school.model.Item;

public class ItemRegUISave extends SaveAction{
    @Override
    public void execute() throws Exception {
        if(validateFields()){
            Item item = (Item) getViewModel("Item");
            F.persist(item);
            addMessage("msg","Item saved successfully");
            updateViewModel("Item", null);
        }
    }



    private boolean validateFields(){
        Item item = (Item) getViewModel("Item");

        if(item.getItemName() == null){
            addMessage("msg","Please enter the Item Name");
            return false;
        }
        if(item.getItemPrice() == null){
            addMessage("msg","Please enter the Item price");
            return false;
        }


        return true;
    }
}


