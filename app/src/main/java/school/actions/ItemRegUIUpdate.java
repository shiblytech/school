package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Book;
import school.model.Item;

public class ItemRegUIUpdate extends SaveAction {
    @Override
    public void execute() throws Exception {

            Item item = (Item) getViewModel("Item");
            F.update(item);
            addMessage("msg","Selected index updated.");
            updateViewModel("Item",null);
        }
    }

