package com.mozhimen.uicorek.layoutk.untouch

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import com.mozhimen.uicorek.layoutk.bases.BaseLayoutKFrame

/**
 * @ClassName LayoutKGridUnTouch
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2023/1/28 23:53
 * @Version 1.0
 */
class LayoutKUnTouchFrame @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    BaseLayoutKFrame(context, attrs, defStyleAttr) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return true
    }
}