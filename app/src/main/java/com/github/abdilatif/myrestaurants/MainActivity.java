package com.github.abdilatif.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   /* public static final String TAG = MainActivity.class.getSimpleName();*/
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;
    private TextView mtextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mtextView=(TextView) findViewById(R.id.textView);

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*mtextView = (TextView) findViewById(R.id.textView);*/
                Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular");
                mtextView.setTypeface(ostrichFont);
              /*  Toast.makeText(MainActivity.this, "cool you will recieve hotels around you soon!", Toast.LENGTH_LONG).show();*/
                String location = mLocationEditText.getText().toString();
               /* Log.e(TAG, location);*/
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location",location);
                startActivity(intent);


            }
        });

}
}
