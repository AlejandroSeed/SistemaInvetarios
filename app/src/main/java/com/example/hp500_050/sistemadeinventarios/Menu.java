package com.example.hp500_050.sistemadeinventarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp500_050.sistemadeinventarios.ui.menu.MenuFragment;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MenuFragment.newInstance())
                    .commitNow();
        }
    }
}
