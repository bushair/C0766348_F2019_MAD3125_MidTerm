package com.santalu.maskedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class MaskEditText extends View {
    public MaskEditText(Context context) {
        this(context, null);
    }

    public MaskEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaskEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
