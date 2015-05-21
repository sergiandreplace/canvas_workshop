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

package com.sergiandreplace.canvas.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by sergi on 21/05/2015.
 */
public class BitmapUtils {
    public static Bitmap loadBitmap(Context context, int resource) {
        Bitmap b= BitmapFactory.decodeResource(context.getResources(), resource);
        return b;
    }

    public static Bitmap loadMutableBitmap(Context context, int resources) {
        Bitmap b=loadBitmap(context,resources);
        Bitmap mb=b.copy(Bitmap.Config.ARGB_8888,true);
        b.recycle();
        return mb;

    }
}
