package com.chamith_d.androidtdd;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GameModel model = new GameModel(30, 15);
        model.makeAlive(1, 0);
        model.makeAlive(2, 1);
        model.makeAlive(0, 2);
        model.makeAlive(1, 2);
        model.makeAlive(2, 2);

        final GameView view = (GameView) findViewById(R.id.gameView);
        view.setup(model);

        final int INTERVAL = 300;
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, INTERVAL);

                model.next();
                view.invalidate();
            }
        };
        handler.postDelayed(runnable, INTERVAL);
    }
}
