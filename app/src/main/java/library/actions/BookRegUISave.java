package library.actions;

import com.androix.SaveAction;
import library.app.F;
import library.model.Book;

public class BookRegUISave extends SaveAction {
    @Override
    public void execute() throws Exception {
        Book s = (Book) getViewModel("Book");

        Long iId = s.getId();
        String iBookName = s.getBookName();
        String iBookBarcode = s.getBookBarcode();

        boolean hasErrors = false;

        // Assume getViewModelField returns a field object for setting error messages
        if (iId == null) {
            addMessage("msg", "ID must be entered");
            hasErrors = true;
        }

        if (iBookName == null || iBookName.trim().isEmpty()) {
            // Assuming setError is a method to set error messages on specific fields
            setError("bookName", "Book Name must be entered");
            hasErrors = true;
        }

        if (iBookBarcode == null || iBookBarcode.trim().isEmpty()) {
            setError("bookBarcode", "Barcode must be entered");
            hasErrors = true;
        }

        if (hasErrors) {
            return;
        }

        F.persist(s);
        updateViewModel("Book", null);
        addMessage("msg", "Book saved successfully");
    }

    // Mock method for setting error on a specific field
    private void setError(String fieldName, String errorMessage) {
        // Implement setting error message logic specific to your framework or application
        // For example:
        addMessage(fieldName, errorMessage);  // Adjust this according to your framework
    }
}
