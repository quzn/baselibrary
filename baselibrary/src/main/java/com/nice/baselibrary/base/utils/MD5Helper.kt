package com.nice.baselibrary.base.utils

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**
 * @author JPlus
 * @date 2019/3/1.
 */

/**
 * byte数组转MD5字符串
 * @return
 */
fun ByteArray.encryptionMD5(): String {
    val messageDigest: MessageDigest
    val md5StrBuff = StringBuffer()
    try {
        messageDigest = MessageDigest.getInstance("MD5")
        messageDigest.reset()
        messageDigest.update(this)
        val byteArray = messageDigest.digest()
//            return Base64.encodeToString(byteArray,Base64.NO_WRAP);
        for (i in byteArray.indices) {
            if (Integer.toHexString(0xFF and byteArray[i].toInt()).length == 1) {
                md5StrBuff.append("0").append(Integer.toHexString(0xFF and byteArray[i].toInt()))
            } else {
                md5StrBuff.append(Integer.toHexString(0xFF and byteArray[i].toInt()))
            }
        }
    } catch (e: NoSuchAlgorithmException) {
        e.printStackTrace()
    }
    return md5StrBuff.toString()
}
