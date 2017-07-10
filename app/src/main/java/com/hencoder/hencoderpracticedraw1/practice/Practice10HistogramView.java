package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawLine(200, 100, 200, 900, paint);
        canvas.drawLine(200, 900, 1200, 900, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(240, 850, 340, 900, paint);
        canvas.drawRect(380, 700, 480, 900, paint);
        canvas.drawRect(520, 620, 620, 900, paint);
        canvas.drawRect(660, 220, 760, 900, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(32);
        canvas.drawText("ics", 240, 920, paint);
        canvas.drawText("JB", 380, 920, paint);
        canvas.drawText("KK", 520, 920, paint);
        canvas.drawText("L", 660, 920, paint);


    }
}
