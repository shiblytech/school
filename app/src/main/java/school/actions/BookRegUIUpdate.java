package school.actions;

import com.androix.SaveAction;

import school.app.F;
import school.model.Book;

public class BookRegUIUpdate extends SaveAction {
    @Override
    public void execute() throws Exception {
        if(validateFields()){
            Book book = (Book) getViewModel("Book");
            F.update(book);
            addMessage("msg","Selected index updated.");
            updateViewModel("Book",null);
        }
    }

    private boolean validateFields(){
        Book book = (Book) getViewModel("Book");
        if(book.getId() != null){
            if(book.getBookName() == null){
                addMessage("msg","Please enter the Book Name");
                return false;
            }
            if(book.getBarcode() == null){
                addMessage("msg","Please enter the barcode number");
                return false;
            }
        }
        else{
            addMessage("msg","Find the index first.");
            return false;
        }
        return true;
    }
}
