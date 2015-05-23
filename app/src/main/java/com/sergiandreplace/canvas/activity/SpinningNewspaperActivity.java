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

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.sergiandreplace.canvas.R;
import com.sergiandreplace.canvas.view.SpinningImageView;
import com.sergiandreplace.canvas.view.TurningImageView;

/**
 * Created by sergi on 21/05/2015.
 */
public class SpinningNewspaperActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinning_newspaper);
        final SpinningImageView spinningImageView=(SpinningImageView) findViewById(R.id.spinning_image);
        spinningImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinningImageView.start();
            }
        });
    }
}
