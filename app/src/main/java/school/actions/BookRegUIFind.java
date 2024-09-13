package school.actions;

import com.androix.FBaseAction;

import school.app.F;
import school.model.Book;

public class BookRegUIFind extends FBaseAction {
    @Override
    public void execute() throws Exception {
        if(validate()){
            Book book = (Book) getViewModel("Book");
            Long bId = book.getId();
            Book book1 = F.find(Book.class,bId);
            updateViewModel("Book",book1);
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
        }else{
            addMessage("msg","Enter the ID.");
            return false;
        }
        return true;
    }
}
