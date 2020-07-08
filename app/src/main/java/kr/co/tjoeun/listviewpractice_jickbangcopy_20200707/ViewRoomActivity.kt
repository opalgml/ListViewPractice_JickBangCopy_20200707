package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room
import kotlin.math.floor

class ViewRoomActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)
    }

    override fun setupEvents()
    {

    }

    override fun setValues()
    {
        val receivedRoom = intent.getSerializableExtra("room") as Room

        priceTxt.text = receivedRoom.getFormattedFloor()
        descTxt.text = receivedRoom.description
        addressTxt.text = receivedRoom.address
        floorTxt.text = receivedRoom.getFormattedFloor()

    }

}