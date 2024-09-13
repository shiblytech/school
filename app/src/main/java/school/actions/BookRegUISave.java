package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Book;

public class BookRegUISave extends SaveAction {

    @Override
    public void execute() throws Exception {
        if(validateFields()){
            Book book = (Book) getViewModel("Book");
            F.persist(book);
            addMessage("msg","Book saved successfully");
            updateViewModel("Book", null);
        }
    }

    private boolean validateFields(){
        Book book = (Book) getViewModel("Book");
        if(book.getId() == null){
            addMessage("msg","Please enter the ID number");
            return false;
        }
        if(book.getBookName() == null){
            addMessage("msg","Please enter the Book Name");
            return false;
        }
        if(book.getBarcode() == null){
            addMessage("msg","Please enter the barcode number");
            return false;
        }
        return true;
    }
}
