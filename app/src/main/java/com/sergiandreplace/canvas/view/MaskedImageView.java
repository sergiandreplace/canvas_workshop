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
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class MaskedImageView extends ImageView {

    // The mask assigned from the outside
    private Drawable mask;

    Paint paint;



    //region constructors
    public MaskedImageView(Context context) {
        super(context);
        init();
    }

    public MaskedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MaskedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MaskedImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //endregion

    private void init() {
       //Create the Paint object. Remember to set the PorterDuff (experiment with it)

    }


    @Override
    protected void onDraw(Canvas canvas) {
        //Create a new bitmap to hold the image

        // Create a temporary canvas for it

        //Draw the imageView image on the temporary canvas

        // Save the temporary canvas, applying a paint with the PorterDuff

        //setup the bounds of the drawable mask

        //Draw the mask on the temporary canvas

        //Restore the temporary canvas

        //Draw the bitmap on the real canvas
    }

    public void setMaskDrawable(Drawable mask) {
        this.mask = mask;
    }
}
