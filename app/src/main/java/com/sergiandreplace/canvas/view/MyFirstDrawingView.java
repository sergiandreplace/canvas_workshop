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
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class MyFirstDrawingView extends ImageView {

    private final Paint paint = new Paint();
    private float width;
    private float height;
    private float radius;
    private RadialGradient gradient;

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
        paint.setDither(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        //measuring
        super.onSizeChanged(w, h, oldw, oldh);
        width = getMeasuredWidth();
        height = getMeasuredHeight();
        radius = Math.min(width, height) / 2;

        gradient = new RadialGradient(width / 2, height / 2, radius, 0, Color.BLACK, Shader.TileMode.CLAMP);
        paint.setShader(gradient);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        //draw things
        super.onDraw(canvas);
        canvas.drawPaint(paint);
    }
}
