package library.actions;

import com.androix.FBaseAction;

import library.app.F;
import library.model.Book;

public class BookRegUIFind extends FBaseAction {
    @Override
    public void execute() throws Exception {
        Book book = (Book) getViewModel("Book");
        Long bookId = book.getId();
        Book book1 = F.find(Book.class,bookId);

        updateViewModel("Book",book1);

    }
}
