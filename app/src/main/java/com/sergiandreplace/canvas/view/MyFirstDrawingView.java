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
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class MyFirstDrawingView extends ImageView {


    //region constructors
    public MyFirstDrawingView(Context context) {
        super(context);
        init();
    }

    public MyFirstDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyFirstDrawingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyFirstDrawingView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //endregion

    private void init() {



    }


    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();

        //initialize drawing objects
        paint.setDither(true);
        float width=getMeasuredWidth();
        float height=getMeasuredHeight();
        float radius=Math.min(width,height)/2;
        RadialGradient gradient=new RadialGradient(width/2, height/2, radius,0, Color.BLACK,null);
        paint.setShader(gradient);

        //draw things
        super.onDraw(canvas);

        canvas.drawPaint(paint);


    }
}
