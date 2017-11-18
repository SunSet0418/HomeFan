package kr.soylatte.homefan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Callback
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call

class MainActivity : AppCompatActivity() {

    val apiRequest : RetrofitInter = RetrofitClass().retrofit.create(RetrofitInter::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fanoff.setOnClickListener {
            apiRequest.off().enqueue(object : Callback<Response> {
                override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>?) {
                    when(response!!.code()){
                        200 ->{
                            Toast.makeText(this@MainActivity, response.body()!!.data, Toast.LENGTH_SHORT).show()
                        }
                        500 ->{
                            Toast.makeText(this@MainActivity, "Server Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

                override fun onFailure(call: Call<Response>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "Server Connection Error", Toast.LENGTH_SHORT).show()
                }
            })
        }

        fanon.setOnClickListener{
            apiRequest.on().enqueue(object : Callback<Response> {
                override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>?) {
                    when(response!!.code()){
                        200 ->{
                            Toast.makeText(this@MainActivity, response.body()!!.data, Toast.LENGTH_SHORT).show()
                        }
                        500 ->{
                            Toast.makeText(this@MainActivity, "Server Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

                override fun onFailure(call: Call<Response>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "Server Connection Error", Toast.LENGTH_SHORT).show()
                }
            })
        }


    }

}
