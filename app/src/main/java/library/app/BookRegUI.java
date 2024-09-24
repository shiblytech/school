package library.app;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.androix.Fragmentx;

public class BookRegUI extends Fragmentx {

    EditText bookId, bookNo, bookName, bookAuthor, bookBarcode;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.bookreg_ui, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bookId = view.findViewById(R.id.book_id);
        bookNo = view.findViewById(R.id.book_bookNo);
        bookName = view.findViewById(R.id.book_bookName);
        bookAuthor = view.findViewById(R.id.book_bookAuthor);
        bookBarcode = view.findViewById(R.id.book_bookBarcode);

        addTextWatcherNo(bookId);
        addTextWatcherNo(bookNo);
        addTextWatcher(bookName);
        addTextWatcher(bookAuthor);
        addTextWatcherNo(bookBarcode);
    }

    private void addTextWatcher(EditText editText){

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String input = editable.toString();
                if(input.isEmpty()){
                    editText.setError("Cannot be empty");
                }
                else if(input.matches(".*[!@#$%^&*(){}\\[\\]:;'\"|\\\\<>,.?/~`_+=-].*")) {
                    editText.setError("special characters not allowed");
                }
                else if(input.matches("^[0-9]+$")) {
                    editText.setError("only text allowed");
                }
            }
        });
    }

    private void addTextWatcherNo(EditText editText){

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String input = editable.toString();
                if(input.isEmpty()){
                    editText.setError("Cannot be empty");
                }
                else if(input.matches(".*[!@#$%^&*(){}\\[\\]:;'\"|\\\\<>,.?/~`_+=-].*")) {
                    editText.setError("special characters not allowed");
                }
                else if(!input.matches("\\d+")) {
                    editText.setError("only numbers allowed");
                }
            }
        });
    }
}
