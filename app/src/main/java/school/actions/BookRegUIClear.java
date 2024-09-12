package school.actions;

import com.androix.FBaseAction;

public class BookRegUIClear extends FBaseAction {
    @Override
    public void execute() throws Exception {
        updateViewModel("Book",null);
        addMessage("i18n","View is cleared");
    }
}
