package com.nice.baselibrary.base.net.download

import okhttp3.ResponseBody

/**
 * 下载监听
 * @author JPlus
 * @date 2019/2/22.
 */
interface JDownloadCallback {
    /**
     * 下载中
     * @param read 读取中的大小
     * @param count 下载文件大小
     * @param done 是否读取完成
     */
    fun update(read:Long, count:Long, done:Boolean)
    /**
     * 下载暂停
     */
    fun pause()
    /**
     * 下载成功
     */
    fun downloadSuccess()

    /**
     *
     */
    fun next(responseBody: ResponseBody)

    /**
     * 下载失败
     * @param e
     */
    fun downloadFailed(e:Throwable)
    /**
     * 下载取消
     */
    fun downloadCancel()
}