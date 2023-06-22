package com.si6a.rakitkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.si6a.rakitkuy.databinding.ActivityAddUnggahBinding;

public class AddUnggahActivity extends AppCompatActivity {
    private ActivityAddUnggahBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddUnggahBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = binding.etContent.getText().toString();

                boolean bolehUnggah = true;

                if (TextUtils.isEmpty(content)){
                    bolehUnggah = false;
                    binding.etContent.setError("Informasi Gunpla Tidak Boleh Kosong!");
                }

                if (bolehUnggah) {
                    String username = Utilities.getValue(AddUnggahActivity.this, "xUsername");
                    addUnggah(username, content);
                }
            }
        });
    }

    private void addUnggah(String username, String content) {
        binding.progressBar.setVisibility(View.VISIBLE);
        //Proses untung mengunggah informasi gunpla...
        binding.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        fileList();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}