package com.example.user.android_class_24;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private ObjectAnimator ani1,ani2,ani3,ani4,ani5;
    private View container,drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.activity_main);
        img = (ImageView)findViewById(R.id.imgView);
    }
    public void button1(View v){
        ani1 = ObjectAnimator.ofFloat(img,"x",0,800,0);
        ani1.setDuration(4000);
        ani1.setRepeatCount(2);
        ani1.start();
    }
    public void button2(View v){
        ani1 = ObjectAnimator.ofFloat(img,"y",0,800,0);
        ani1.setDuration(4000);
        ani1.setRepeatCount(2);
        ani1.start();
    }
    public void button3(View v){
        ani1 = ObjectAnimator.ofFloat(img,"x",0,800,0);
        ani2 = ObjectAnimator.ofFloat(img,"y",0,800,0);
        ani3 = ObjectAnimator.ofFloat(img,"alpha", 0f,1f);
        ani4 = ObjectAnimator.ofFloat(img,"rotationX",0,360f,0);
        ani5 = ObjectAnimator.ofFloat(img,"rotationY",0,360f,0);

        AnimatorSet set = new AnimatorSet();
        set.playSequentially(ani1,ani2,ani3,ani4,ani5);
        //set.playTogether(anim1,anim2,anim3,anim4,anim5);
        set.setDuration(3*1000);
        set.start();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.v("ppking", "onWindowFocusChanged()");
        if (hasFocus) {
            Log.v("ppking", container.getWidth() + " x " + container.getHeight());
        }else{
            Log.v("ppking", "onWindowFocusChanged():false");
        }
    }
}
