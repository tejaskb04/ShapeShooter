package com.example.shapeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class CanvasConfig extends View {
    private Bitmap bitmap;
    private double centerX = getWidth() / 2;
    private double centerY = getHeight() - 75;

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

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        float x = e.getX();
        float y = e.getY();
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN: {

            }
            case MotionEvent.ACTION_MOVE: {

            }
            case MotionEvent.ACTION_UP: {

            }
        }
        return true;
    }

    public void drawBullet(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        paint.setColor(Color.parseColor("#000000"));

        // DRAW BULLET CODE HERE
    }
}
