package com.example.mazerunner.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.example.mazerunner.R;

public class CustomView extends View {
    Button b1;
    SharedPreferences sharedPreferences;
    Rect rect1,rect2,rect3,rect4,rect5,rect6,rect7,rect8,rect9;
    Paint paint;
    public Rect R1,R2,R3,R4,R5,R6,R7,R8,R9,R10,R11,R12;

    public CustomView(Context context) {
        super(context);

        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(null);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(null);
    }

    private void init(@Nullable AttributeSet set)
    {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        rect1 = new Rect();
        rect1.top = getHeight()/2 - 20;
        rect1.bottom = rect1.top + 40;
        rect1.left = getWidth()/2 - 20;
        rect1.right = rect1.left + 40;

        rect2 = new Rect();
        rect2.top = getHeight()/2 - 20 - 300;
        rect2.bottom = rect2.top + 40 ;
        rect2.left = getWidth()/2 - 20 - 300;
        rect2.right = rect2.left + 40;

        rect3 = new Rect();
        rect3.top = getHeight()/2 - 20 - 300;
        rect3.bottom = rect3.top + 40 ;
        rect3.left = getWidth()/2 - 20;
        rect3.right = rect3.left + 40;

        rect4 = new Rect();
        rect4.top = getHeight()/2 - 20 - 300;
        rect4.bottom = rect4.top + 40 ;
        rect4.left = getWidth()/2 - 20 + 300;
        rect4.right = rect4.left + 40;

        rect5 = new Rect();
        rect5.top = getHeight()/2 - 20;
        rect5.bottom = rect5.top + 40 ;
        rect5.left = getWidth()/2 - 20 - 300;
        rect5.right = rect5.left + 40;

        rect6 = new Rect();
        rect6.top = getHeight()/2 - 20;
        rect6.bottom = rect6.top + 40 ;
        rect6.left = getWidth()/2 - 20 + 300;
        rect6.right = rect6.left + 40;

        rect7 = new Rect();
        rect7.top = getHeight()/2 - 20 + 300;
        rect7.bottom = rect7.top + 40 ;
        rect7.left = getWidth()/2 - 20 - 300;
        rect7.right = rect7.left + 40;

        rect8 = new Rect();
        rect8.top = getHeight()/2 - 20 + 300;
        rect8.bottom = rect8.top + 40 ;
        rect8.left = getWidth()/2 - 20;
        rect8.right = rect8.left + 40;

        rect9 = new Rect();
        rect9.top = getHeight()/2 - 20 + 300;
        rect9.bottom = rect9.top + 40 ;
        rect9.left = getWidth()/2 - 20 + 300;
        rect9.right = rect9.left + 40;

        paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawRect(rect1, paint);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect3, paint);
        canvas.drawRect(rect4, paint);
        canvas.drawRect(rect5, paint);
        canvas.drawRect(rect6, paint);
        canvas.drawRect(rect7, paint);
        canvas.drawRect(rect8, paint);
        canvas.drawRect(rect9, paint);




    }


}
