package com.mozhimen.xmlk.recyclerk.commons

import android.view.View


/**
 * @ClassName IAdapterKRecyclerStuffed
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Version 1.0
 */
interface IRecyclerKAdapterStuffed {
    /**
     * 添加Header
     * @param view View
     */
    fun addHeaderView(view: View)

    /**
     * 移除Header
     * @param view View
     */
    fun removeHeaderView(view: View)

    /**
     * 添加Footer
     * @param view View
     */
    fun addFooterView(view: View)

    /**
     * 移除Footer
     * @param view View
     */
    fun removeFooterView(view: View)

    /**
     * 获取Header数量
     * @return Int
     */
    fun getHeaderViewSize(): Int

    /**
     * 获取Footer数量
     * @return Int
     */
    fun getFooterViewSize(): Int

    /**
     * 获取item数量
     * @return Int
     */
    fun getNormalItemSize(): Int
}