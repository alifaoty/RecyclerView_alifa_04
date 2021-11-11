package com.example.recyclerview_alifa_04

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NCTDream(
    val imgNCTDream: Int,
    val nameNCTDream: String,
    val descNCTDream: String
) : Parcelable