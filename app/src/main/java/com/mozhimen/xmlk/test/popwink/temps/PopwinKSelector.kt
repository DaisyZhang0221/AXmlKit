package com.mozhimen.xmlk.test.popwink.temps

import android.content.Context
import android.graphics.Color
import android.util.Log
import com.mozhimen.basick.utilk.android.util.UtilKLogWrapper
import android.view.View
import android.view.animation.Animation
import com.mozhimen.basick.animk.builder.AnimKBuilder
import com.mozhimen.basick.animk.builder.temps.AnimKTranslationType
import com.mozhimen.xmlk.popwink.bases.BasePopwinKLifecycle
import com.mozhimen.xmlk.viewk.wheel.ViewKWheel
import com.mozhimen.xmlk.viewk.wheel.temps.ArrayWheelAdapter
import com.mozhimen.xmlk.test.R


/**
 * @ClassName PopwinSelector
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/1/31 13:10
 * @Version 1.0
 */
class PopwinKSelector(
    context: Context,
    private var _items: List<String>
) : BasePopwinKLifecycle(context) {
    private var _viewKWheel: ViewKWheel? = null

    init {
        setContentView(R.layout.popwink_selector)
        setBackgroundColor(Color.TRANSPARENT)
    }

    override fun onViewCreated(contentView: View) {
        super.onViewCreated(contentView)
        _viewKWheel = contentView.findViewById(R.id.popwink_selector_wheel)
        _viewKWheel!!.apply {
            setCyclic(false)
            setItemSelectedListener { UtilKLogWrapper.d(TAG, "onViewCreated: $it") }
            setItems(_items)
        }
    }

    fun setItems(items: List<String>) {
        if (_viewKWheel == null || items.isEmpty()) return
        _viewKWheel!!.adapter = ArrayWheelAdapter(items.also { _items = items })
    }

    override fun onCreateShowAnimation(): Animation {
        return AnimKBuilder.asAnimation().add(AnimKTranslationType.FROM_BOTTOM_SHOW).build()
    }

    override fun onCreateDismissAnimation(): Animation {
        return AnimKBuilder.asAnimation().add(AnimKTranslationType.TO_BOTTOM_HIDE).build()
    }
}