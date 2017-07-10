package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);

        RectF rectF = new RectF();
        rectF.left = 200;
        rectF.top = 100;
        rectF.right = 800;
        rectF.bottom = 500;
        canvas.drawArc(rectF, 30, 50, true, paint);

        paint.setColor(Color.WHITE);
        canvas.drawArc(rectF, 85, 80, true, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(rectF, 140, 130, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 275, 100, true, paint);
    }
}
