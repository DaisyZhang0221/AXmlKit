package com.mozhimen.uicorek.test.popwink.temps

import android.content.Context
import android.graphics.Color
import android.view.animation.Animation
import com.mozhimen.basick.animk.builder.AnimKBuilder
import com.mozhimen.basick.animk.builder.temps.AnimKTranslationType
import com.mozhimen.uicorek.popwink.bases.BasePopwinKLifecycle
import com.mozhimen.uicorek.test.R


/**
 * @ClassName Popwin
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/1/31 13:08
 * @Version 1.0
 */
class PopwinKAnim(context: Context) : BasePopwinKLifecycle(context) {
    init {
        setContentView(R.layout.popwink)
        setBackgroundColor(Color.TRANSPARENT)
    }

    override fun onCreateShowAnimation(): Animation {
        return AnimKBuilder.asAnimation().add(AnimKTranslationType.FROM_TOP_SHOW).build()
    }

    override fun onCreateDismissAnimation(): Animation {
        return AnimKBuilder.asAnimation().add(AnimKTranslationType.TO_TOP_HIDE).build()
    }
}