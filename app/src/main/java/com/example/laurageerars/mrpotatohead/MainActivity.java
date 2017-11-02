package com.example.laurageerars.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;
    CheckBox armscheckbox, earscheckbox, eyebrowscheckbox, eyescheckbox, glassescheckbox, hatcheckbox, mouthcheckbox, mustachecheckbox, nosecheckbox, shoescheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.armsid);
        ears = (ImageView) findViewById(R.id.earsid);
        eyebrows = (ImageView) findViewById(R.id.eyebrowsid);
        eyes = (ImageView) findViewById(R.id.eyesid);
        glasses = (ImageView) findViewById(R.id.glassesid);
        hat = (ImageView) findViewById(R.id.hatid);
        mouth = (ImageView) findViewById(R.id.mouthid);
        mustache = (ImageView) findViewById(R.id.mustacheid);
        nose = (ImageView) findViewById(R.id.noseid);
        shoes = (ImageView) findViewById(R.id.shoesid);

        armscheckbox = (CheckBox) findViewById(R.id.Checkboxarms);
        earscheckbox = (CheckBox) findViewById(R.id.checkBoxears);
        eyebrowscheckbox = (CheckBox) findViewById(R.id.checkBoxeyebrows);
        eyescheckbox = (CheckBox) findViewById(R.id.checkBoxeyes);
        glassescheckbox = (CheckBox) findViewById(R.id.checkBoxglasses);
        hatcheckbox = (CheckBox) findViewById(R.id.checkBoxhat);
        mouthcheckbox = (CheckBox) findViewById(R.id.checkBoxmouth);
        mustachecheckbox = (CheckBox) findViewById(R.id.checkBoxmustache);
        nosecheckbox = (CheckBox) findViewById(R.id.checkBoxnose);
        shoescheckbox = (CheckBox) findViewById(R.id.checkBoxshoes);

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("ArmsImage", arms.getVisibility());
        outState.putInt("EarsImage", ears.getVisibility());
        outState.putInt("EyebrowsImage", eyebrows.getVisibility());
        outState.putInt("EyesImage", eyes.getVisibility());
        outState.putInt("GlassesImage", glasses.getVisibility());
        outState.putInt("HatImage", hat.getVisibility());
        outState.putInt("MouthImage", mouth.getVisibility());
        outState.putInt("MustacheImage", mustache.getVisibility());
        outState.putInt("NoseImage", nose.getVisibility());
        outState.putInt("ShoesImage", shoes.getVisibility());

    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        if (inState.getInt("ArmsImage") == 0) {
            arms.setVisibility(View.VISIBLE);
        }
        else
            arms.setVisibility(View.INVISIBLE);

        if (inState.getInt("EarsImage") == 0) {
            ears.setVisibility(View.VISIBLE);
        }
        else
            ears.setVisibility(View.INVISIBLE);

        if (inState.getInt("EyebrowsImage") == 0) {
            eyebrows.setVisibility(View.VISIBLE);
        }
        else
            eyebrows.setVisibility(View.INVISIBLE);

        if (inState.getInt("EyesImage") == 0) {
            eyes.setVisibility(View.VISIBLE);
        }
        else
            eyes.setVisibility(View.INVISIBLE);

        if (inState.getInt("GlassesImage") == 0) {
            glasses.setVisibility(View.VISIBLE);
        }
        else
            glasses.setVisibility(View.INVISIBLE);

        if (inState.getInt("HatImage") == 0) {
            hat.setVisibility(View.VISIBLE);
        }
        else
            hat.setVisibility(View.INVISIBLE);

        if (inState.getInt("MouthImage") == 0) {
            mouth.setVisibility(View.VISIBLE);
        }
        else
            mouth.setVisibility(View.INVISIBLE);

        if (inState.getInt("MustacheImage") == 0) {
            mustache.setVisibility(View.VISIBLE);
        }
        else
            mustache.setVisibility(View.INVISIBLE);

        if (inState.getInt("NoseImage") == 0) {
            nose.setVisibility(View.VISIBLE);
        }
        else
            nose.setVisibility(View.INVISIBLE);

        if (inState.getInt("ShoesImage") == 0) {
            shoes.setVisibility(View.VISIBLE);
        }
        else
            shoes.setVisibility(View.INVISIBLE);

    }


    public void armsClicked(View view) {

        if (armscheckbox.isChecked()) {
            arms.setVisibility(View.VISIBLE);
        }
        else
            arms.setVisibility(View.INVISIBLE);
    }

    public void earsClicked(View view) {
        if (earscheckbox.isChecked()) {
            ears.setVisibility(View.VISIBLE);
        }
        else
            ears.setVisibility(View.INVISIBLE);
    }

    public void eyebrowsClicked(View view) {
        if (eyebrowscheckbox.isChecked()) {
            eyebrows.setVisibility(View.VISIBLE);
        }
        else
            eyebrows.setVisibility(View.INVISIBLE);
    }

    public void eyesClicked(View view) {
        if (eyescheckbox.isChecked()) {
            eyes.setVisibility(View.VISIBLE);
        }
        else
            eyes.setVisibility(View.INVISIBLE);
    }

    public void glassesClicked(View view) {
        if (glassescheckbox.isChecked()) {
            glasses.setVisibility(View.VISIBLE);
        }
        else
            glasses.setVisibility(View.INVISIBLE);
    }

    public void hatClicked(View view) {
        if (hatcheckbox.isChecked()) {
            hat.setVisibility(View.VISIBLE);
        }
        else
            hat.setVisibility(View.INVISIBLE);
    }

    public void mouthClicked(View view) {
        if (mouthcheckbox.isChecked()) {
            mouth.setVisibility(View.VISIBLE);
        }
        else
            mouth.setVisibility(View.INVISIBLE);
    }

    public void mustacheClicked(View view) {
        if (mustachecheckbox.isChecked()) {
            mustache.setVisibility(View.VISIBLE);
        }
        else
            mustache.setVisibility(View.INVISIBLE);
    }

    public void noseClicked(View view) {
        if (nosecheckbox.isChecked()) {
            nose.setVisibility(View.VISIBLE);
        }
        else
            nose.setVisibility(View.INVISIBLE);
    }

    public void shoesClicked(View view) {
        if (shoescheckbox.isChecked()) {
            shoes.setVisibility(View.VISIBLE);
        }
        else
            shoes.setVisibility(View.INVISIBLE);
    }
}
