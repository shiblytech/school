package school.actions;

import com.androix.FBaseAction;

import school.app.F;
import school.model.Book;

public class BookRegUIFind extends FBaseAction {
    @Override
    public void execute() throws Exception {
        Book book = (Book) getViewModel("Book");
        Long bId = book.getId();
        Book book1 = F.find(Book.class,bId);

        updateViewModel("Book",book1);
    }
}
