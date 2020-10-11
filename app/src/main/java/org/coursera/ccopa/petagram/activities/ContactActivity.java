package org.coursera.ccopa.petagram.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import org.coursera.ccopa.petagram.R;
import org.coursera.ccopa.petagram.util.JavaMailAPI;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Context context = this;

        Toolbar toolbarFavoritePets = findViewById(R.id.toolbarFavoritePets);
        toolbarFavoritePets.setNavigationOnClickListener(view -> finish());

        TextInputEditText etName = findViewById(R.id.et_name);
        TextInputEditText etEmail = findViewById(R.id.et_email);
        TextInputEditText etMessage = findViewById(R.id.et_message);
        MaterialButton btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(view -> {
            JavaMailAPI javaMailAPI = new JavaMailAPI( context,
                    etEmail.getText().toString(),
                    etName.getText().toString(),
                    etMessage.getText().toString());
            javaMailAPI.execute();
        });
    }
}