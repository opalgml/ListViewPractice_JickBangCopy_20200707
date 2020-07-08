package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun setValues() {

//        지연 처리를 해주는 핸들러 변수
        val myHandler = Handler()
        myHandler.postDelayed({
//            해들러 변수를 이용해서, 3초 후에 { } 내부의 내용을 실행하도록 함
        val myIntent = Intent(mContext, SplashActivity::class.java)

        startActivity(myIntent)
            
//            넘기고 나서는 창을 종료
            finish()
        }, 3000)
    }

    override fun setupEvents() {

    }
}