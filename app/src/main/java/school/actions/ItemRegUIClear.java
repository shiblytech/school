package school.actions;

import com.androix.FBaseAction;

public class ItemRegUIClear extends FBaseAction {
    @Override
    public void execute() throws Exception {
        updateViewModel("Item",null);
        addMessage("i18n","View is cleared");
    }
}
