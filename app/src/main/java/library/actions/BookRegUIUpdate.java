package library.actions;

import com.androix.FBaseAction;

import library.app.F;
import library.model.Book;

public class BookRegUIUpdate extends FBaseAction {
    @Override
    public void execute() throws Exception {
        Book s = (Book) getViewModel("Book");

        Long iId = s.getId();
        String iBookName = s.getBookName();
        String iBookBarcode = s.getBookBarcode();

        if (iId == null) {
            addMessage("msg", "ID must be entered");
            return;
        }

        if (iBookName == null) {
            addMessage("msg", "Book Name must be entered");
            return;
        }

        if (iBookBarcode == null) {
            addMessage("msg", "Barcode must be entered");
            return;
        }

        F.persist(s);
        updateViewModel("Book", null);
        addMessage("msg","Book saved successfully");

    }
}
