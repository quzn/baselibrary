package com.jplus.manyfunction.utils

import com.nice.baselibrary.base.net.RequestTool
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author JPlus
 * @date 2020/3/23.
 */
class ParseVideoInUrl {


    fun getResponse(url:String){
        RequestTool.doGet(url, object : Callback<ResponseBody>{
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {

            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {

            }
        })
    }

}