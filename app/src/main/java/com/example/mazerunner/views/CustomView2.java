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

public class CustomView2 extends View {
    Button b1;
    SharedPreferences sharedPreferences;
    Rect rect1,rect2,rect3,rect4,rect5,rect6,rect7,rect8,rect9,rect10,rect11,rect12,rect13,rect14,rect15,rect16;
    Paint paint;
    public Rect R1,R2,R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,R13,R14,R15,R16,R17,R18,R19,R20,R21,R22,R23,R24;

    public CustomView2(Context context) {
        super(context);

        init(null);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(null);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(null);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(null);
    }

    private void init(@Nullable AttributeSet set)
    {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int midx = getWidth()/2,midy = getHeight()/2;
        rect1 = new Rect();
        rect1.top = midy-300-20;
        rect1.bottom = rect1.top + 40;
        rect1.left = midx-300-20;
        rect1.right = rect1.left + 40;

        rect2 = new Rect();
        rect2.top = midy-300-20;
        rect2.bottom = rect2.top + 40 ;
        rect2.left = midx-100-20;
        rect2.right = rect2.left + 40;

        rect3 = new Rect();
        rect3.top = midy-300-20;
        rect3.bottom = rect3.top + 40 ;
        rect3.left = midx+100-20;
        rect3.right = rect3.left + 40;

        rect4 = new Rect();
        rect4.top = midy-300-20;
        rect4.bottom = rect4.top + 40 ;
        rect4.left = midx+300-20;
        rect4.right = rect4.left + 40;

        rect5 = new Rect();
        rect5.top = midy-100-20;
        rect5.bottom = rect5.top + 40 ;
        rect5.left = midx-300-20;
        rect5.right = rect5.left + 40;

        rect6 = new Rect();
        rect6.top = midy-100-20;
        rect6.bottom = rect6.top + 40 ;
        rect6.left = midx-100-20;
        rect6.right = rect6.left + 40;

        rect7 = new Rect();
        rect7.top = midy-100-20;
        rect7.bottom = rect7.top + 40 ;
        rect7.left = midx+100-20;
        rect7.right = rect7.left + 40;

        rect8 = new Rect();
        rect8.top = midy-100-20;
        rect8.bottom = rect8.top + 40 ;
        rect8.left = midx+300-20;
        rect8.right = rect8.left + 40;

        rect9 = new Rect();
        rect9.top = midy+100-20;
        rect9.bottom = rect9.top + 40 ;
        rect9.left = midx-300-20;
        rect9.right = rect9.left + 40;

        rect10 = new Rect();
        rect10.top = midy+100-20;
        rect10.bottom = rect10.top + 40 ;
        rect10.left = midx-100-20;
        rect10.right = rect10.left + 40;

        rect11 = new Rect();
        rect11.top = midy+100-20;
        rect11.bottom = rect11.top + 40 ;
        rect11.left = midx+100-20;
        rect11.right = rect11.left + 40;

        rect12 = new Rect();
        rect12.top = midy+100-20;
        rect12.bottom = rect12.top + 40 ;
        rect12.left = midx+300-20;
        rect12.right = rect12.left + 40;

        rect13 = new Rect();
        rect13.top = midy+300-20;
        rect13.bottom = rect13.top + 40 ;
        rect13.left = midx-300-20;
        rect13.right = rect13.left + 40;

        rect14 = new Rect();
        rect14.top = midy+300-20;
        rect14.bottom = rect14.top + 40 ;
        rect14.left = midx-100-20;
        rect14.right = rect14.left + 40;

        rect15 = new Rect();
        rect15.top = midy+300-20;
        rect15.bottom = rect15.top + 40 ;
        rect15.left = midx+100-20;
        rect15.right = rect15.left + 40;

        rect16 = new Rect();
        rect16.top = midy+300-20;
        rect16.bottom = rect16.top + 40 ;
        rect16.left = midx+300-20;
        rect16.right = rect16.left + 40;


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
        canvas.drawRect(rect10, paint);
        canvas.drawRect(rect11, paint);
        canvas.drawRect(rect12, paint);
        canvas.drawRect(rect13, paint);
        canvas.drawRect(rect14, paint);
        canvas.drawRect(rect15, paint);
        canvas.drawRect(rect16, paint);
    }


}
