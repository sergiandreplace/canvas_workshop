/**
 * Copyright 2015 Sergi Martinez
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

package com.sergiandreplace.canvas.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.sergiandreplace.canvas.R;
import com.sergiandreplace.canvas.utils.BitmapUtils;

/**
 * Created by sergi on 21/05/2015.
 */
public class BatmanActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myfirstcanvas);
        ImageView image=(ImageView) findViewById(R.id.image);
        Bitmap monaLisa= BitmapUtils.loadMutableBitmap(this, R.drawable.mona_lisa_by_leonardo_da_vinci);

        //Let's put a smile on that face

        // We now have a bitmap

        // Step 1: create a canvas from the bitmap. We'll use it to draw ON the bitmap
        Canvas canvas=new Canvas(monaLisa);

        // Step 2: no paint needed


        // Step 3: Create and paint a primitive (a Bitmap!)
        Bitmap mask= BitmapFactory.decodeResource(getResources(),R.drawable.joker);
        canvas.drawBitmap(mask, 384, 350, null);


        //Step 3b: Create and paint another bitmap
        Bitmap batman=BitmapFactory.decodeResource(getResources(),R.drawable.batman);
        Rect src=new Rect(90,12,380,260);
        Rect dst=new Rect(340,60,840,490);
        canvas.drawBitmap(batman,src,dst,null);
        image.setImageBitmap(monaLisa);
    }
}
