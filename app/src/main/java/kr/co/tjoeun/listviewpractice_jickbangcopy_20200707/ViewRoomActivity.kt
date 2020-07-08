package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_view_room.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room
import kotlin.math.floor
import kotlin.math.log

class ViewRoomActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

        setupEvents()
        setValues()
    }

    override fun setupEvents()
    {

    }

    override fun setValues()
    {
        val receivedRoom = intent.getSerializableExtra("room") as Room

        priceTxt.text = receivedRoom.getFormattedPrice()
        descTxt.text = receivedRoom.description
        addressTxt.text = receivedRoom.address
        floorTxt.text = receivedRoom.getFormattedFloor()
        Log.d("TAG", "price : " + priceTxt.text + "  descTxt :" + receivedRoom.description)

    }

}