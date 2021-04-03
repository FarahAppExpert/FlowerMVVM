package com.example.flowermvvm.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class FlowerModel2 (
    @SerializedName("category")
    @Expose
    var category: String? = "Category F",
    @SerializedName("price")
    @Expose
    var price: Double? = 100.50,
    @SerializedName("instructions")
    @Expose
    var instructions: String? = "no instraction",
    @SerializedName("photo")
    @Expose
    var photo: String? = null,
    @SerializedName("name")
    @Expose
    var name: String? = "Rose Flower",
    @SerializedName("productId")
    @Expose
    var productId: Int? = 5555
        ) : Parcelable
{

}