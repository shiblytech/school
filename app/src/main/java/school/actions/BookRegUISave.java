package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Book;

public class BookRegUISave extends SaveAction {
    @Override
    public void execute() throws Exception {
        Book book = (Book) getViewModel("Book");
        F.persist(book);
        addMessage("msg","Book saved successfully");
        updateViewModel("Book", null);
    }
}
