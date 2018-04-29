package com.example.android.pleventourguide;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SightsFragment())
                .commit();
    }
}
