package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapter.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mAdapter: ArrayAdapter<Room>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()

        setValues()

    }

    override fun setupEvents()
    {
    }

    override fun setValues()
    {
        mRoomList.add(Room(8000, "서울시 마포구", 5, "첫번째 방 입니다"))
        mRoomList.add(Room(25000, "서울시 중랑구", 64, "두번째 방 입니다"))
        mRoomList.add(Room(30000, "서울시 강남구", 65, "세번째 방 입니다"))
        mRoomList.add(Room(5000, "서울시 은평구", 0, "네번째 방 입니다"))
        mRoomList.add(Room(4000, "서울시 종로구", 0, "다섯번째 방 입니다"))
        mRoomList.add(Room(3000, "서울시 중구", -2, "여섯번째 방 입니다"))
        mRoomList.add(Room(4000, "서울시 중구", -1, "일곱번째 방 입니다"))
        mRoomList.add(Room(5000, "서울시 동작구", 0, "여덟번째 방 입니다"))
        mRoomList.add(Room(9900, "서울시 동작구", 0, "아홉번째 방 입니다"))
        mRoomList.add(Room(18000, "서울시 마포구", 2, "열번째 방 입니다"))
        mRoomList.add(Room(128000, "서울시 강서구", 3, "열하나번째 방 입니다"))

        mAdapter = RoomAdapter(mContext, R.layout.activity_room_list_item, mRoomList)
        roomListView.adapter = mAdapter
    }

}