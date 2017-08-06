package com.example.shapeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class CanvasConfig extends View {
    private Bitmap bitmap;

    public CanvasConfig(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        paint.setColor(Color.parseColor("#D3D3D3"));
        Path path = new Path();
        path.moveTo(getWidth() / 2, getHeight() - 50);
        path.lineTo(getWidth() / 2 - 50, getHeight() - 50);
        path.lineTo(getWidth() / 2, getHeight() - 100);
        path.lineTo(getWidth() / 2 + 50, getHeight() - 50);
        path.lineTo(getWidth() / 2, getHeight() - 50);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override
    protected void onSizeChanged(int w2, int h2, int w1, int h1) {
        super.onSizeChanged(w2, h2, w1, h1);
        bitmap = Bitmap.createBitmap(w2, h2, Bitmap.Config.ARGB_8888);
    }
}
