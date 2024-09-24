package school.app;

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
    private EditText bookName, bookNumber, authorName;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ){
        return inflater.inflate(R.layout.bookreg_ui, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bookName = view.findViewById(R.id.book_bookName);
        bookNumber = view.findViewById(R.id.book_bookNo);
        authorName = view.findViewById(R.id.book_authorName);

        addTextWatcher(bookName);
        addTextWatcher(bookNumber);
        addTextWatcher(authorName);
    }
    private void addTextWatcher(EditText editText) {
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
                if (input.matches(".*[!@#$%^&*(){}\\[\\]:;'\"|\\\\<>,.?/~`_+=-].*")) {
                    editText.setError("Special characters are not allowed");
                }
            }
        });
    }
}
