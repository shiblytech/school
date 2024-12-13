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

public class ItemRegUI extends Fragmentx {
    private EditText itemName, price, batch;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    )
    {
        return inflater.inflate(R.layout.itemreg_ui, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemName = view.findViewById(R.id.item_itemName);
        price = view.findViewById(R.id.item_price);
        batch = view.findViewById(R.id.item_batch);

        addTextWatcher(itemName);
        addTextWatcher(price);
        addTextWatcher(batch);
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
