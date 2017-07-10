package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        Path path = new Path();

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);

        RectF oval = new RectF();
        oval.left = 200;
        oval.top = 200;
        oval.right = 400;
        oval.bottom = 400;
        path.addArc(oval, -225, 225);

        oval.left = 400;
        oval.top = 200;
        oval.right = 600;
        oval.bottom = 400;

        path.arcTo(oval, -180, 225, false);
        path.lineTo(400, 542);

        canvas.drawPath(path, paint);
    }
}
