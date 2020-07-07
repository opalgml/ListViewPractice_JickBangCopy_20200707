package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.R
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class RoomAdapter(val mContext: Context, val resId: Int, val mList: List<Room>) : ArrayAdapter<Room>(mContext, resId, mList)
    {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null)
        {
            tempRow = inf.inflate(R.layout.activity_room_list_item, null) //inflate :: 객체로 생성해 주세요~
        }

        val row = tempRow!!

        val data = mList[position]

//        내용을 가져와 TextView 반영
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        priceTxt.text = data.price.toString()
        addressTxt.text = "${data.address}, ${data.floor}층"
        descriptionTxt.text = data.description

        return row
    }

}