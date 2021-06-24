package com.ecommerce.wipecart.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.ecommerce.wipecart.R;
import com.ecommerce.wipecart.extras.BottomSheet;


public class LoginActivity extends AppCompatActivity {
    private Dialog loginWithMobileDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        loginWithMobileDialog = new Dialog(LoginActivity.this);
        findViewById(R.id.btn_login_mobile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheet bottomSheet = new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());

            }
        });
    }

}