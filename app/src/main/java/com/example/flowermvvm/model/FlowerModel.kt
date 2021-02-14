package com.example.flowermvvm.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FlowerModel(
    @SerializedName("category")
    @Expose
    var category: String? = null,
    @SerializedName("price")
    @Expose
    var price: Int? = null,
    @SerializedName("instructions")
    @Expose
    var instructions: String? = null,
    @SerializedName("photo")
    @Expose
    var photo: String? = null,
    @SerializedName ("name")
    @Expose
    var name: String? = null,
    @SerializedName("productId")
    @Expose
    var productId: Int? = null




): Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(category)
        parcel.writeValue(price)
        parcel.writeString(instructions)
        parcel.writeString(photo)
        parcel.writeString(name)
        parcel.writeValue(productId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FlowerModel> {
        override fun createFromParcel(parcel: Parcel): FlowerModel {
            return FlowerModel(parcel)
        }

        override fun newArray(size: Int): Array<FlowerModel?> {
            return arrayOfNulls(size)
        }
    }
}