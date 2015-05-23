/**
 * Copyright 2015 Sergi Martínez
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sergiandreplace.canvas.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class SpinningImageView extends ImageView {

    Paint paint;


    // degrees to rotate the image
    float deg=0;

    // THE FLAG!
    private boolean spinning;

    //When the animation started
    long startingTime;

    //How long has it been working
    long deltaTime;

    //How long should it run
    long duration=6000;

    //Current progress in a 0..1 scale
    private float progress;

    //THE interpolator
    private Interpolator interpolator;

    //THE matrix
    private Matrix matrix;

    //The bitmap painted turning
    private Bitmap turningBitmap;

    //Its canvas
    private Canvas turningCanvas;

    //region constructors
    public SpinningImageView(Context context) {
        super(context);
        init();
    }

    public SpinningImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SpinningImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SpinningImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //endregion

    private void init() {
        //Config paint object

        //Create interpolator

        //Create matrix

    }


    @Override
    protected void onDraw(Canvas canvas) {

        //Calculate center


        if (spinning) {

            // calculate delta time


            // calculate progress


            if (deltaTime>duration) {
                //stop animation

                //draw canvas normally


            }else{
                // calculate degree


                //Setup the rotation of the matrix


                // Draw the image on the turning canvas(relay on ImageView)


                // Draw the turningBitmap on main canvas using the matrix


                //repeat!

            }

        }else{
            // draw canvas normally

        }
    }


    public void start() {
        if (!spinning){

            //Set the spinning value

            //record starting time

            // Create a new turningBitmap with same size as view

            // Create the canvas of the new turningBitmap

            // Request to call onDraw


        }
    }
}
