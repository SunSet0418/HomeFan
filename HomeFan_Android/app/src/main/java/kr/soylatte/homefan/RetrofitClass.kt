package kr.soylatte.homefan

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by SunSet on 2017. 11. 19..
 */
class RetrofitClass {

    val Baseurl : String = "http://192.168.219.104:3000"

    val retrofit = Retrofit.Builder()
            .baseUrl(Baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

}