package com.example.androidallsortsoftest.room_db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class quote_data(@PrimaryKey(autoGenerate = true) var id:Int, var author:String)