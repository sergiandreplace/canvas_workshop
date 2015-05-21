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

package com.sergiandreplace.canvas.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.sergiandreplace.canvas.R;
import com.sergiandreplace.canvas.utils.BitmapUtils;

/**
 * Created by sergi on 21/05/2015.
 */
public class MyFirstCanvasActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myfirstcanvas);
        ImageView image=(ImageView) findViewById(R.id.image);
        Bitmap monaLisa= BitmapUtils.loadMutableBitmap(this, R.drawable.mona_lisa_by_leonardo_da_vinci);

        //Let's put a smile on that face

        image.setImageBitmap(monaLisa);
    }
}
