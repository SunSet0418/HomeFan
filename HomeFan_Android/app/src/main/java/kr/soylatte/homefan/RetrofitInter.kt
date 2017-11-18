package kr.soylatte.homefan

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by SunSet on 2017. 11. 19..
 */
interface RetrofitInter {
    @GET("/on")
    fun on(
    ) : Call<Response>

    @GET("/off")
    fun off(
    ) : Call<Response>
}