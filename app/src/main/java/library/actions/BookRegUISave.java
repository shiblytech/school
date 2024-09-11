package library.actions;

import com.androix.SaveAction;

import library.app.F;
import library.model.Book;

public class BookRegUISave extends SaveAction {
    @Override
    public void execute() throws Exception {
        Book s = (Book) getViewModel("Book");
        s.setId(2L);  //id is not available in the View
        F.persist(s);
        addMessage("msg","Student saved successfully");
    }
}
