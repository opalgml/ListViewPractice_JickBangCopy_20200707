package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

class Room(val price: Int, val address: String, val floor: Int, val description: String) {

    fun getFormattedPrice() : String
    {
        //상황에 따라 다르게 결과값을 추출하는 함수
        if(this.price >= 10000)
        {
            val uk = price/10000 //int는 소수점 버림 처리
            val rest = price%10000

            if(rest == 0)
            {
                return String.format("%,d억", uk)
            }
            else
            {
                return String.format("%,d억 %,d 만원", uk, rest)
            }

        }
        else
        {
            return price.toString().format("%,d만원", this.price) //%d 는 숫자 의미.
        }
    }
    
    fun getFormattedFloor() : String
    {
//        지상, 반지하, 지하 층으로 구분
        val floor = this.floor

        if(floor >= 1)
        {
            return "${floor}층"
        }
        else if(floor == 0)
        {
            return "반지하"
        }
        else
        {
            return "지하${-floor}층"
        }
    }

}