package com.zukira.klinikapp_zukira.model

import com.zukira.klinikapp_zukira.R
import kotlin.collections.ArrayList

data class ModelIcon(
    var gambar : Int,
    var judul : String
)

object MockList{
    fun getModel() : List<ModelIcon>{

        val itemModel1 = ModelIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )

        val itemModel2 = ModelIcon(
            R.drawable.icon_eye,
            "Ophthalmologyst"
        )

        val itemModel3 = ModelIcon(
            R.drawable.icontooth,
            "Dentist"
        )

        val itemModel4 = ModelIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )

        val itemModel5 = ModelIcon(
            R.drawable.icon_eye,
            "Ophthalmologyst"
        )

        val itemModel6 = ModelIcon(
            R.drawable.icontooth,
            "Dentist"
        )


        val itemList : ArrayList<ModelIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }

}