package com.chamith_d.androidtdd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameModel model = new GameModel(30, 15);

        GameView view = (GameView) findViewById(R.id.gameView);
        view.setup(model);

        ti

    }
}
