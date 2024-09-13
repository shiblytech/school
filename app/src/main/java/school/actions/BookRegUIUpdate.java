package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Book;

public class BookRegUIUpdate extends SaveAction {
    @Override
    public void execute() throws Exception {
        Book book = (Book) getViewModel("Book");
        F.update(book);
        addMessage("msg","Selected index updated.");
        updateViewModel("Book",null);
    }
}
