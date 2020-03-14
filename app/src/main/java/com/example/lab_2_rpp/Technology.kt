package com.example.lab_2_rpp

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable
import android.R.id
import android.widget.TextView


class Technology (val graphic: String, val name: String, val helptext: String) : Parcelable{

    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<Technology> {
            override fun createFromParcel(parcel: Parcel) : Technology = Technology(parcel)
            override fun newArray(size: Int) = arrayOfNulls<Technology>(size)
        }
    }

    private constructor(parcel: Parcel) : this(
        graphic = parcel.readString()!!,
        name = parcel.readString()!!,
        helptext = parcel.readString()!!
    )

    fun getG(): String { return graphic }
    fun getN(): String { return name }
    fun getH(): String { return helptext}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(graphic)
        parcel.writeString(name)
        parcel.writeString(helptext)
    }

    override fun describeContents() = 0
}