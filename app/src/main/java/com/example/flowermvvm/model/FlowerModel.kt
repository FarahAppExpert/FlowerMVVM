package com.example.flowermvvm.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FlowerModel(
    @SerializedName("category")
    @Expose
    var category: String? = null,
    @SerializedName("price")
    @Expose
    var price: Double? = null,
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




): Parcelable
{

}