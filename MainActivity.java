package com.example.mysticre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.MotionEventCompat;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     private FrameLayout frame;
     private Button btn1;
    private ArrayList<Integer> stickerlist;
    private StickerAdapter stickerAdapter;
    private Integer stickerId;
    private MainActivity.StickerView mCurrentView;
    private boolean isImgSelected = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        frame=findViewById( R.id.frame );
        btn1=findViewById( R.id.btn1 );
        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFxDialog();
            }
        } );
    }
    private void showFxDialog() {

        final Dialog dial = new Dialog(this, android.R.style.Theme_Translucent);
        dial.requestWindowFeature( Window.FEATURE_NO_TITLE);
        dial.setContentView(R.layout.sticker_dialog);
        dial.setCancelable(true);
        dial.setCanceledOnTouchOutside(false);


        stickerlist = new ArrayList<>();
        final GridView grid_sticker = (GridView) dial.findViewById(R.id.gridStickerList);
//        setStickerList1();
//        stickerAdapter = new StickerAdapter(getApplicationContext(), stickerlist);
//        grid_sticker.setAdapter(stickerAdapter);

        stickerlist.clear();
        setStickerList1();
        stickerAdapter = new StickerAdapter(getApplicationContext(), stickerlist);
        grid_sticker.setAdapter(stickerAdapter);

        grid_sticker.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                final MainActivity.StickerView stickerView = new MainActivity.StickerView(MainActivity.this);
                stickerId = stickerlist.get(i);
                stickerView.setImageResource(stickerId);
                stickerView.setOperationListener(new MainActivity.StickerView.OperationListener() {
                    @Override
                    public void onDeleteClick() {
                        frame.removeView(stickerView);
                    }

                    @Override
                    public void onEdit(MainActivity.StickerView stickerView) {
                        mCurrentView.setInEdit(false);
                        mCurrentView = stickerView;
                        mCurrentView.setInEdit(true);
                    }

                    @Override
                    public void onTop(MainActivity.StickerView stickerView) {
                    }
                });
                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT, Gravity.CENTER);
                stickerView.setLayoutParams(new FrameLayout.LayoutParams(200, 200, Gravity.CENTER));
                frame.addView(stickerView, lp);
                setCurrentEdit(stickerView);
                dial.dismiss();
            }
        });
        dial.show();
    }
    private void setCurrentEdit(MainActivity.StickerView stickerView) {
        if (mCurrentView != null) {
            mCurrentView.setInEdit(false);
        }
        mCurrentView = stickerView;
        stickerView.setInEdit(true);
    }

    private void setStickerList1() {
        stickerlist.add(R.drawable.m1);
        stickerlist.add(R.drawable.m2);
        stickerlist.add(R.drawable.m3);
        stickerlist.add(R.drawable.m4);
        stickerlist.add(R.drawable.m5);
        stickerlist.add(R.drawable.m6);
        stickerlist.add(R.drawable.m7);
        stickerlist.add(R.drawable.m8);
        stickerlist.add(R.drawable.m9);
        stickerlist.add(R.drawable.m10);
        stickerlist.add(R.drawable.m11);
        stickerlist.add(R.drawable.m12);
        stickerlist.add(R.drawable.m13);
        stickerlist.add(R.drawable.m14);
        stickerlist.add(R.drawable.m15);
        stickerlist.add(R.drawable.m16);
        stickerlist.add(R.drawable.m17);
        stickerlist.add(R.drawable.m18);
        stickerlist.add(R.drawable.m19);
        stickerlist.add(R.drawable.m20);
        stickerlist.add(R.drawable.m21);
        stickerlist.add(R.drawable.m22);
        stickerlist.add(R.drawable.m23);
        stickerlist.add(R.drawable.m24);
        stickerlist.add(R.drawable.m25);
        stickerlist.add(R.drawable.m26);
        stickerlist.add(R.drawable.m27);
        stickerlist.add(R.drawable.m28);
        stickerlist.add(R.drawable.m29);
        stickerlist.add(R.drawable.m30);
        stickerlist.add(R.drawable.m31);
        stickerlist.add(R.drawable.m32);

        stickerlist.add(R.drawable.m33);
        stickerlist.add(R.drawable.m34);
        stickerlist.add(R.drawable.m35);
        stickerlist.add(R.drawable.m36);
        stickerlist.add(R.drawable.m37);
        stickerlist.add(R.drawable.m38);
        stickerlist.add(R.drawable.m39);
        stickerlist.add(R.drawable.m40);
        stickerlist.add(R.drawable.m41);
        stickerlist.add(R.drawable.m42);
        stickerlist.add(R.drawable.m43);
        stickerlist.add(R.drawable.m44);
        stickerlist.add(R.drawable.m45);
        stickerlist.add(R.drawable.m46);
        stickerlist.add(R.drawable.m47);
        stickerlist.add(R.drawable.m48);
        stickerlist.add(R.drawable.m49);
        stickerlist.add(R.drawable.m50);
        stickerlist.add(R.drawable.m52);
        stickerlist.add(R.drawable.m53);
        stickerlist.add(R.drawable.m54);
        stickerlist.add(R.drawable.m55);
        stickerlist.add(R.drawable.m56);
        stickerlist.add(R.drawable.m57);
        stickerlist.add(R.drawable.m58);
        stickerlist.add(R.drawable.m59);
        stickerlist.add(R.drawable.m60);
        stickerlist.add(R.drawable.m61);
        stickerlist.add(R.drawable.m62);
        stickerlist.add(R.drawable.m63);

        stickerlist.add(R.drawable.m64);
        stickerlist.add(R.drawable.m65);
        stickerlist.add(R.drawable.m66);
        stickerlist.add(R.drawable.m67);
        stickerlist.add(R.drawable.m68);
        stickerlist.add(R.drawable.m69);
        stickerlist.add(R.drawable.m70);
        stickerlist.add(R.drawable.m71);
        stickerlist.add(R.drawable.m72);
        stickerlist.add(R.drawable.m73);
        stickerlist.add(R.drawable.m74);
        stickerlist.add(R.drawable.m75);
        stickerlist.add(R.drawable.m76);
        stickerlist.add(R.drawable.m77);
        stickerlist.add(R.drawable.m78);
        stickerlist.add(R.drawable.m79);
        stickerlist.add(R.drawable.m80);
        stickerlist.add(R.drawable.m81);
        stickerlist.add(R.drawable.m82);
        stickerlist.add(R.drawable.m83);
        stickerlist.add(R.drawable.m84);
        stickerlist.add(R.drawable.m85);
        stickerlist.add(R.drawable.m86);
        stickerlist.add(R.drawable.m87);
        stickerlist.add(R.drawable.m88);
        stickerlist.add(R.drawable.m89);
        stickerlist.add(R.drawable.m90);
        stickerlist.add(R.drawable.m91);
        stickerlist.add(R.drawable.m92);
        stickerlist.add(R.drawable.m93);
        stickerlist.add(R.drawable.m94);

        stickerlist.add(R.drawable.m95);
        stickerlist.add(R.drawable.m96);
    }
    public static class StickerView extends AppCompatImageView {
        private static final String TAG = "StickerView";

        private Bitmap deleteBitmap;
        private Bitmap flipVBitmap;
        private Bitmap topBitmap;
        private Bitmap resizeBitmap;
        private Bitmap mBitmap;
        private Rect dst_delete;
        private Rect dst_resize;
        private Rect dst_flipV;
        private Rect dst_top;
        private int deleteBitmapWidth;
        private int deleteBitmapHeight;
        private int resizeBitmapWidth;
        private int resizeBitmapHeight;
        //????????????
        private int flipVBitmapWidth;
        private int flipVBitmapHeight;
        //??????
        private int topBitmapWidth;
        private int topBitmapHeight;
        private Paint localPaint;
        private int mScreenwidth;
        private int mScreenheight;
        private static final float BITMAP_SCALE = 0.7f;
        private PointF mid = new PointF();
        private OperationListener operationListener;
        private float lastRotateDegree;

        //??????????????????????????????
        private boolean isPointerDown = false;
        //??????????????????????????????????????????
        private final float pointerLimitDis = 20f;
        private final float pointerZoomCoeff = 0.09f;
        /**
         * ??????????????????
         */
        private float lastLength;
        private boolean isInResize = false;

        private Matrix matrix = new Matrix();
        /**
         * ????????????????????????
         */
        private boolean isInSide;

        private float lastX, lastY;
        /**
         * ?????????????????????
         */
        private boolean isInEdit = true;

        private float MIN_SCALE = 0.5f;

        private float MAX_SCALE = 1.2f;

        private double halfDiagonalLength;

        private float oringinWidth = 0;

        //??????????????????????????????
        private float oldDis;

        private final long stickerId;

        private DisplayMetrics dm;

        //????????????
        private boolean isHorizonMirror = false;

        public StickerView(Context context, AttributeSet attrs) {
            super(context, attrs);
            stickerId = 0;
            init();
        }

        public StickerView(Context context) {
            super(context);
            stickerId = 0;
            init();
        }

        public StickerView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            stickerId = 0;
            init();
        }

        private void init() {

            dst_delete = new Rect();
            dst_resize = new Rect();
            dst_flipV = new Rect();
            dst_top = new Rect();
            localPaint = new Paint();
            localPaint.setColor(getResources().getColor(R.color.white));
            localPaint.setAntiAlias(true);
            localPaint.setDither(true);
            localPaint.setStyle(Paint.Style.STROKE);
            localPaint.setStrokeWidth(5.0f);
            dm = getResources().getDisplayMetrics();
            mScreenwidth = dm.widthPixels;
            mScreenheight=dm.heightPixels;

        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (mBitmap != null) {
                float[] arrayOfFloat = new float[9];
                matrix.getValues(arrayOfFloat);
                float f1 = 0.0F * arrayOfFloat[0] + 0.0F * arrayOfFloat[1] + arrayOfFloat[2];
                float f2 = 0.0F * arrayOfFloat[3] + 0.0F * arrayOfFloat[4] + arrayOfFloat[5];
                float f3 = arrayOfFloat[0] * this.mBitmap.getWidth()  + 0.0F * arrayOfFloat[1] + arrayOfFloat[2];
                float f4 = arrayOfFloat[3] * this.mBitmap.getWidth() + 0.0F * arrayOfFloat[4] + arrayOfFloat[5];
                float f5 = 0.0F * arrayOfFloat[0] + arrayOfFloat[1] * this.mBitmap.getHeight() + arrayOfFloat[2];
                float f6 = 0.0F * arrayOfFloat[3] + arrayOfFloat[4] * this.mBitmap.getHeight() + arrayOfFloat[5];
                float f7 = arrayOfFloat[0] * this.mBitmap.getWidth() + arrayOfFloat[1] * this.mBitmap.getHeight() + arrayOfFloat[2];
                float f8 = arrayOfFloat[3] * this.mBitmap.getWidth() + arrayOfFloat[4] * this.mBitmap.getHeight() + arrayOfFloat[5];

                canvas.save();
                canvas.drawBitmap(mBitmap, matrix, null);
                //??????????????????
                dst_delete.left = (int) (f3 - deleteBitmapWidth / 2);
                dst_delete.right = (int) (f3 + deleteBitmapWidth / 2);
                dst_delete.top = (int) (f4 - deleteBitmapHeight / 2);
                dst_delete.bottom = (int) (f4 + deleteBitmapHeight / 2);
                //???????????????????????????
                dst_resize.left = (int) (f7 - resizeBitmapWidth / 2);
                dst_resize.right = (int) (f7 + resizeBitmapWidth / 2);
                dst_resize.top = (int) (f8 - resizeBitmapHeight / 2);
                dst_resize.bottom = (int) (f8 + resizeBitmapHeight / 2);
                //????????????????????????
                dst_top.left = (int) (f1 - flipVBitmapWidth / 2);
                dst_top.right = (int) (f1 + flipVBitmapWidth / 2);
                dst_top.top = (int) (f2 - flipVBitmapHeight / 2);
                dst_top.bottom = (int) (f2 + flipVBitmapHeight / 2);
                //????????????????????????
                dst_flipV.left = (int) (f5 - topBitmapWidth / 2);
                dst_flipV.right = (int) (f5 + topBitmapWidth / 2);
                dst_flipV.top = (int) (f6 - topBitmapHeight / 2);
                dst_flipV.bottom = (int) (f6 + topBitmapHeight / 2);
                if (isInEdit) {

                    canvas.drawLine(f1, f2, f3, f4, localPaint);
                    canvas.drawLine(f3, f4, f7, f8, localPaint);
                    canvas.drawLine(f5, f6, f7, f8, localPaint);
                    canvas.drawLine(f5, f6, f1, f2, localPaint);

                    canvas.drawBitmap(deleteBitmap, null, dst_delete, null);
                    canvas.drawBitmap(resizeBitmap, null, dst_resize, null);
                    canvas.drawBitmap(flipVBitmap, null, dst_flipV, null);
                    canvas.drawBitmap(topBitmap, null, dst_top, null);
                }

                canvas.restore();
            }
        }

        @Override
        public void setImageResource(int resId) {
            setBitmap( BitmapFactory.decodeResource(getResources(), resId));
        }

        public void setBitmap(Bitmap bitmap) {
            matrix.reset();
            mBitmap = bitmap;
            setDiagonalLength();
            initBitmaps();
            int w = mBitmap.getWidth();
            int h = mBitmap.getHeight();
            oringinWidth = w;
            float initScale = (MIN_SCALE + MAX_SCALE) / 2;
            matrix.postScale(0.7f, 0.7f,w/2,h/2);
            //Y????????? ??????????????????+???????????????/2
            matrix.postTranslate(mScreenwidth / 2 - w / 2, (mScreenheight) / 2 - h / 2);
            invalidate();
        }


        private void setDiagonalLength() {
            halfDiagonalLength = Math.hypot(mBitmap.getWidth(), mBitmap.getHeight()) / 2;
        }

        private void initBitmaps() {
            //??????????????????????????? ??????????????? ?????????????????????????????????????????? ??????????????????1/8 ??????????????????
            if (mBitmap.getWidth() >= mBitmap.getHeight()) {
                float minWidth = mScreenwidth / 8;
                if (mBitmap.getWidth() < minWidth) {
                    MIN_SCALE = 1f;
                } else {
                    MIN_SCALE = 1.0f * minWidth / mBitmap.getWidth();
                }

                if (mBitmap.getWidth() > mScreenwidth) {
                    MAX_SCALE = 1;
                } else {
                    MAX_SCALE = 1.0f * mScreenwidth / mBitmap.getWidth();
                }
            } else {
                //???????????????????????????????????????????????????
                float minHeight = mScreenwidth / 8;
                if (mBitmap.getHeight() < minHeight) {
                    MIN_SCALE = 1f;
                } else {
                    MIN_SCALE = 1.0f * minHeight / mBitmap.getHeight();
                }

                if (mBitmap.getHeight() > mScreenwidth) {
                    MAX_SCALE = 1;
                } else {
                    MAX_SCALE = 1.0f * mScreenwidth / mBitmap.getHeight();
                }
            }

//            topBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_top_enable);
      //      deleteBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_delete);
  //          flipVBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_flip);
    //         resizeBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_resize);

            deleteBitmapWidth = (int) (deleteBitmap.getWidth() * BITMAP_SCALE);
            deleteBitmapHeight = (int) (deleteBitmap.getHeight() * BITMAP_SCALE);

            resizeBitmapWidth = (int) (resizeBitmap.getWidth() * BITMAP_SCALE);
            resizeBitmapHeight = (int) (resizeBitmap.getHeight() * BITMAP_SCALE);

            flipVBitmapWidth = (int) (flipVBitmap.getWidth() * BITMAP_SCALE);
            flipVBitmapHeight = (int) (flipVBitmap.getHeight() * BITMAP_SCALE);

            topBitmapWidth = (int) (topBitmap.getWidth() * BITMAP_SCALE);
            topBitmapHeight = (int) (topBitmap.getHeight() * BITMAP_SCALE);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int action = MotionEventCompat.getActionMasked(event);
            boolean handled = true;
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    if (isInButton(event, dst_delete)) {
                        if (operationListener != null) {
                            operationListener.onDeleteClick();
                        }
                    } else if (isInResize(event)) {
                        isInResize = true;
                        lastRotateDegree = rotationToStartPoint(event);
                        midPointToStartPoint(event);
                        lastLength = diagonalLength(event);
                    } else if (isInButton(event, dst_flipV)) {
                        //????????????
                        PointF localPointF = new PointF();
                        midDiagonalPoint(localPointF);
                        matrix.postScale(-1.0F, 1.0F, localPointF.x, localPointF.y);
                        isHorizonMirror = !isHorizonMirror;
                        invalidate();
                    } else if (isInButton(event, dst_top)) {
                        //??????
                        bringToFront();
                        if (operationListener != null) {
                            operationListener.onTop(this);
                        }
                    } else if (isInBitmap(event)) {
                        isInSide = true;
                        lastX = event.getX(0);
                        lastY = event.getY(0);
                    } else {
                        handled = false;
                    }
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    if (spacing(event) > pointerLimitDis) {
                        oldDis = spacing(event);
                        isPointerDown = true;
                        midPointToStartPoint(event);
                    } else {
                        isPointerDown = false;
                    }
                    isInSide = false;
                    isInResize = false;
                    break;
                case MotionEvent.ACTION_MOVE:
                    //????????????
                    if (isPointerDown) {
                        float scale;
                        float disNew = spacing(event);
                        if (disNew == 0 || disNew < pointerLimitDis) {
                            scale = 1;
                        } else {
                            scale = disNew / oldDis;
                            //????????????
                            scale = (scale - 1) * pointerZoomCoeff + 1;
                        }
                        float scaleTemp = (scale * Math.abs(dst_flipV.left - dst_resize.left)) / oringinWidth;
                        if (((scaleTemp <= MIN_SCALE)) && scale < 1 ||
                                (scaleTemp >= MAX_SCALE) && scale > 1) {
                            scale = 1;
                        } else {
                            lastLength = diagonalLength(event);
                        }
                        matrix.postScale(scale, scale, mid.x, mid.y);
                        invalidate();
                    } else if (isInResize) {

                        matrix.postRotate((rotationToStartPoint(event) - lastRotateDegree) * 2, mid.x, mid.y);
                        lastRotateDegree = rotationToStartPoint(event);

                        float scale = diagonalLength(event) / lastLength;

                        if (((diagonalLength(event) / halfDiagonalLength <= MIN_SCALE)) && scale < 1 ||
                                (diagonalLength(event) / halfDiagonalLength >= MAX_SCALE) && scale > 1) {
                            scale = 1;
                            if (!isInResize(event)) {
                                isInResize = false;
                            }
                        } else {
                            lastLength = diagonalLength(event);
                        }
                        matrix.postScale(scale, scale, mid.x, mid.y);

                        invalidate();
                    } else if (isInSide) {
                        float x = event.getX(0);
                        float y = event.getY(0);
                        //TODO ?????????????????? ??????????????????
                        matrix.postTranslate(x - lastX, y - lastY);
                        lastX = x;
                        lastY = y;
                        invalidate();
                    }
                    break;
                case MotionEvent.ACTION_CANCEL:
                case MotionEvent.ACTION_UP:
                    isInResize = false;
                    isInSide = false;
                    isPointerDown = false;
                    break;

            }
            if (handled && operationListener != null) {
                operationListener.onEdit(this);
            }
            return handled;
        }

        /**
         * ????????????????????????
         * ??????????????? ???????????????????????? ?????????4????????????????????????????????????????????????????????????
         *
         * @return
         */
        private boolean isInBitmap(MotionEvent event) {
            float[] arrayOfFloat1 = new float[9];
            this.matrix.getValues(arrayOfFloat1);
            //?????????
            float f1 = 0.0F * arrayOfFloat1[0] + 0.0F * arrayOfFloat1[1] + arrayOfFloat1[2];
            float f2 = 0.0F * arrayOfFloat1[3] + 0.0F * arrayOfFloat1[4] + arrayOfFloat1[5];
            //?????????
            float f3,f4,f5,f6,f7,f8;
            f3=f4=f5=f6=f7=f8=0;
            if (mBitmap!=null&&mBitmap.getWidth()!=0 && mBitmap.getHeight()!=0) {
                f3 = arrayOfFloat1[0] * this.mBitmap.getWidth() + 0.0F * arrayOfFloat1[1] + arrayOfFloat1[2];
                f4 = arrayOfFloat1[3] * this.mBitmap.getWidth() + 0.0F * arrayOfFloat1[4] + arrayOfFloat1[5];
                //?????????
                f5 = 0.0F * arrayOfFloat1[0] + arrayOfFloat1[1] * this.mBitmap.getHeight() + arrayOfFloat1[2];
                f6 = 0.0F * arrayOfFloat1[3] + arrayOfFloat1[4] * this.mBitmap.getHeight() + arrayOfFloat1[5];
                //?????????
                f7 = arrayOfFloat1[0] * this.mBitmap.getWidth() + arrayOfFloat1[1] * this.mBitmap.getHeight() + arrayOfFloat1[2];
                f8 = arrayOfFloat1[3] * this.mBitmap.getWidth() + arrayOfFloat1[4] * this.mBitmap.getHeight() + arrayOfFloat1[5];
            }
            float[] arrayOfFloat2 = new float[4];
            float[] arrayOfFloat3 = new float[4];
            //??????X???????????????
            arrayOfFloat2[0] = f1;//?????????x
            arrayOfFloat2[1] = f3;//?????????x
            arrayOfFloat2[2] = f7;//?????????x
            arrayOfFloat2[3] = f5;//?????????x
            //??????Y???????????????
            arrayOfFloat3[0] = f2;//?????????y
            arrayOfFloat3[1] = f4;//?????????y
            arrayOfFloat3[2] = f8;//?????????y
            arrayOfFloat3[3] = f6;//?????????y
            return pointInRect(arrayOfFloat2, arrayOfFloat3, event.getX(0), event.getY(0));
        }

        /**
         * ????????????????????????????????????
         *
         * @param xRange
         * @param yRange
         * @param x
         * @param y
         * @return
         */
        private boolean pointInRect(float[] xRange, float[] yRange, float x, float y) {
            //??????????????????
            double a1 = Math.hypot(xRange[0] - xRange[1], yRange[0] - yRange[1]);
            double a2 = Math.hypot(xRange[1] - xRange[2], yRange[1] - yRange[2]);
            double a3 = Math.hypot(xRange[3] - xRange[2], yRange[3] - yRange[2]);
            double a4 = Math.hypot(xRange[0] - xRange[3], yRange[0] - yRange[3]);
            //?????????????????????????????????
            double b1 = Math.hypot(x - xRange[0], y - yRange[0]);
            double b2 = Math.hypot(x - xRange[1], y - yRange[1]);
            double b3 = Math.hypot(x - xRange[2], y - yRange[2]);
            double b4 = Math.hypot(x - xRange[3], y - yRange[3]);

            double u1 = (a1 + b1 + b2) / 2;
            double u2 = (a2 + b2 + b3) / 2;
            double u3 = (a3 + b3 + b4) / 2;
            double u4 = (a4 + b4 + b1) / 2;

            //???????????????
            double s = a1 * a2;
            //???????????? ??????4??????????????????
            double ss = Math.sqrt(u1 * (u1 - a1) * (u1 - b1) * (u1 - b2))
                    + Math.sqrt(u2 * (u2 - a2) * (u2 - b2) * (u2 - b3))
                    + Math.sqrt(u3 * (u3 - a3) * (u3 - b3) * (u3 - b4))
                    + Math.sqrt(u4 * (u4 - a4) * (u4 - b4) * (u4 - b1));
            return Math.abs(s - ss) < 0.5;


        }


        /**
         * ?????????????????????button??????
         *
         * @param event
         * @param rect
         * @return
         */
        private boolean isInButton(MotionEvent event, Rect rect) {
            int left = rect.left;
            int right = rect.right;
            int top = rect.top;
            int bottom = rect.bottom;
            return event.getX(0) >= left && event.getX(0) <= right && event.getY(0) >= top && event.getY(0) <= bottom;
        }

        /**
         * ??????????????????????????????
         *
         * @param event
         * @return
         */
        private boolean isInResize(MotionEvent event) {
            int left = -20 + this.dst_resize.left;
            int top = -20 + this.dst_resize.top;
            int right = 20 + this.dst_resize.right;
            int bottom = 20 + this.dst_resize.bottom;
            return event.getX(0) >= left && event.getX(0) <= right && event.getY(0) >= top && event.getY(0) <= bottom;
        }

        /**
         * ????????????????????????????????????????????????
         *
         * @param event
         */
        private void midPointToStartPoint(MotionEvent event) {
            float[] arrayOfFloat = new float[9];
            matrix.getValues(arrayOfFloat);
            float f1 = 0.0f * arrayOfFloat[0] + 0.0f * arrayOfFloat[1] + arrayOfFloat[2];
            float f2 = 0.0f * arrayOfFloat[3] + 0.0f * arrayOfFloat[4] + arrayOfFloat[5];
            float f3 = f1 + event.getX(0);
            float f4 = f2 + event.getY(0);
            mid.set(f3 / 2, f4 / 2);
        }

        /**
         * ??????????????????????????????
         *
         * @param paramPointF
         */
        private void midDiagonalPoint(PointF paramPointF) {
            float[] arrayOfFloat = new float[9];
            this.matrix.getValues(arrayOfFloat);
            float f1 = 0.0F * arrayOfFloat[0] + 0.0F * arrayOfFloat[1] + arrayOfFloat[2];
            float f2 = 0.0F * arrayOfFloat[3] + 0.0F * arrayOfFloat[4] + arrayOfFloat[5];
            float f3 = arrayOfFloat[0] * this.mBitmap.getWidth() + arrayOfFloat[1] * this.mBitmap.getHeight() + arrayOfFloat[2];
            float f4 = arrayOfFloat[3] * this.mBitmap.getWidth() + arrayOfFloat[4] * this.mBitmap.getHeight() + arrayOfFloat[5];
            float f5 = f1 + f3;
            float f6 = f2 + f4;
            paramPointF.set(f5 / 2.0F, f6 / 2.0F);
        }


        /**
         * ????????????????????????,????????????????????????????????????????????????????????????
         *
         * @param event
         * @return
         */
        private float rotationToStartPoint(MotionEvent event) {

            float[] arrayOfFloat = new float[9];
            matrix.getValues(arrayOfFloat);
            float x = 0.0f * arrayOfFloat[0] + 0.0f * arrayOfFloat[1] + arrayOfFloat[2];
            float y = 0.0f * arrayOfFloat[3] + 0.0f * arrayOfFloat[4] + arrayOfFloat[5];
            double arc = Math.atan2(event.getY(0) - y, event.getX(0) - x);
            return (float) Math.toDegrees(arc);
        }

        /**
         * ?????????????????????????????????
         *
         * @param event
         * @return
         */
        private float diagonalLength(MotionEvent event) {
            float diagonalLength = (float) Math.hypot(event.getX(0) - mid.x, event.getY(0) - mid.y);
            return diagonalLength;
        }

        /**
         * ???????????????????????????
         */
        private float spacing(MotionEvent event) {
            if (event.getPointerCount() == 2) {
                float x = event.getX(0) - event.getX(1);
                float y = event.getY(0) - event.getY(1);
                return (float) Math.sqrt(x * x + y * y);
            } else {
                return 0;
            }
        }

        public interface OperationListener {
            void onDeleteClick();

            void onEdit(StickerView stickerView);

            void onTop(StickerView stickerView);
        }

        public void setOperationListener(OperationListener operationListener) {
            this.operationListener = operationListener;
        }

        public void setInEdit(boolean isInEdit) {
            this.isInEdit = isInEdit;
            invalidate();
        }
    }






}