package com.example.student.zoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        imageView = findViewById(R.id.imageViewId);
        zoomControls = findViewById(R.id.zoomControllerId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
                if (x < 3 && y <= 3) {
                    imageView.setScaleX(x + 0.5f);
                    imageView.setScaleY(y + 0.5f);
                }

            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x >= 1 && y >= 1) {
                    imageView.setScaleX(x - 0.5f);
                    imageView.setScaleY(y - 0.5f);
                }


            }
        });
    }

    public void Click(View view) {
        startActivity(new Intent(this,photoViewActivity.class));

    }
}
