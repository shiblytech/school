package school.actions;

import com.androix.FBaseAction;
import com.androix.SaveAction;

import school.app.F;
import school.model.Book;

public class BookRegUIRemove extends SaveAction {
    @Override
    public void execute() throws Exception {
        if(validate()){
            Book book = (Book) getViewModel("Book");
            F.remove(book);
            addMessage("msg","Record removed.");
            updateViewModel("Book",null);
        }
    }
    private boolean validate(){
        Book book = (Book) getViewModel("Book");
        if(book.getId() != null){
            Long bId = book.getId();
            Book book2 = F.find(Book.class,bId);
            if(book2 == null){
                addMessage("msg","No such Book ID.");
                return false;
            }
            if(book.getBookNo() == null || book.getBookName() == null || book.getAuthorName() == null || book.getBarcode() == null){
                addMessage("msg","First find a record.");
                return false;
            }
        }else{
            addMessage("msg","First find a record.");
            return false;
        }
        return true;
    }
}
