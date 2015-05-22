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
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class TurningImageView extends ImageView {

    Paint paint;


    int xTurning = 0;
    int yTurning = 0;
    int zTurning = 0;

    //region constructors
    public TurningImageView(Context context) {
        super(context);
        init();
    }

    public TurningImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TurningImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TurningImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //endregion

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    }


    @Override
    protected void onDraw(Canvas canvas) {

        //Calculate center
        int halfWidth = getMeasuredWidth() / 2;
        int halfHeight = getMeasuredHeight() / 2;

        //Create matrix
        Matrix matrix = new Matrix();

        //Create a camera
        Camera camera = new Camera();

        //Turn the camera in the three axes
        camera.rotateX(xTurning);
        camera.rotateY(yTurning);
        camera.rotateZ(zTurning);

        //Extract the matrix from the camera
        camera.getMatrix(matrix);

        //Make the matrix to move image center to 0,0 before turning
        matrix.preTranslate(-halfWidth, -halfHeight );

        //Make the matrix move back after turning
        matrix.postTranslate(halfWidth, halfHeight );

        // Create a new bitmap with same size as view
        Bitmap b = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);

        // Create the canvas of the new bitmap
        Canvas turnedCanvas = new Canvas(b);

        // Draw the image (relay on ImageView)
        super.onDraw(turnedCanvas);

        // Draw the bitmap on main canvas using the matrix
        canvas.drawBitmap(b, matrix, paint);

    }


    public void setTurning(int x, int y, int z) {
        xTurning = x;
        yTurning = y;
        zTurning = z;
    }
}
