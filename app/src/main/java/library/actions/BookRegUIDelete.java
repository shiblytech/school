package library.actions;

import com.androix.FBaseAction;
import library.app.F;
import library.model.Book;

public class BookRegUIDelete extends FBaseAction {
    @Override
    public void execute() throws Exception {
        Book book = (Book) getViewModel("Book");
        Long bookId = book.getId();

        if (bookId == null) {
            addMessage("msg", "Book ID is required to delete a record");
            return;
        }
        Book bookToDelete = F.find(Book.class, bookId);
        if (bookToDelete == null) {
            addMessage("msg", "No book found with ID: " + bookId);
            return;
        }
        F.remove(bookToDelete);
        updateViewModel("Book", null);
        addMessage("msg", "Book deleted successfully");
    }
}
