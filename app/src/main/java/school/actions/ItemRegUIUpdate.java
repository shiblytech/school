package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Item;

public class ItemRegUIUpdate extends SaveAction {
    @Override
    public void execute() throws Exception {
        if(validateFields()){
            Item item = (Item) getViewModel("Item");
            F.update(item);
            addMessage("msg","Selected index updated.");
            updateViewModel("Item",null);
        }
    }

    private boolean validateFields(){
        Item item = (Item) getViewModel("Item");
        if(item.getId() != null){
            if(item.getItemName() == null){
                addMessage("msg","Please enter the Item Name");
                return false;
            }
            if(item.getBarcode() == null){
                addMessage("msg","Please enter the barcode number");
                return false;
            }
            if(item.getId().toString().trim().length() != 6){
                addMessage("msg","ID number must be 6 digit.");
                return false;
            }
            if(item.getBarcode().trim().length() != 10){
                addMessage("msg","Barcode number must be 10 digit.");
                return false;
            }
        }
        else{
            addMessage("msg","Find the index first.");
            return false;
        }
        return true;
    }
}
