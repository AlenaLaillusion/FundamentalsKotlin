package com.example.fundamentalskotlin.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val poster: String,
    val backdrop: String,
    val ratings: Float,
    val adult: Boolean,
    val runtime: Int,
    val reviews: Int,
    val genres: List<Genre>,
    val actors: List<Actor>,
    val like: Boolean = false
) : Parcelable


