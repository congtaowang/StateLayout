package com.lxj.statelayout

import android.view.View

// some extentions
fun StateLayout.setLoadingRes(resId: Int): StateLayout{
    loadingView = View.inflate(context, resId, null)
    return this
}

fun StateLayout.setEmptyRes(resId: Int): StateLayout{
    emptyView = View.inflate(context, resId, null)
    return this
}

fun StateLayout.setErrorRes(resId: Int): StateLayout{
    errorView = View.inflate(context, resId, null)
    return this
}

fun StateLayout.customViewRes(loadingResId: Int = 0,
                              emptyResId: Int = 0,
                              errorResId: Int = 0): StateLayout{
    when{
        loadingResId!=0 -> return setLoadingRes(loadingResId)
        emptyResId!=0 -> return setEmptyRes(loadingResId)
        errorResId!=0 -> return setErrorRes(loadingResId)
    }
    return this
}