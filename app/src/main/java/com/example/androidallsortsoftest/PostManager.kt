package com.example.androidallsortsoftest

import android.content.Context
import com.google.gson.Gson

class PostManager {


    var currentIndex=0
    var postData= PostData()
    var postList=ArrayList<Posts>()

    fun populateDataFromAsset(context: Context, fileName:String)
    {
        val inputStream = context.assets.open(fileName)
        val size:Int = inputStream.available()
        val buffer= ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer,Charsets.UTF_8)
        val gson=Gson()
        postData=gson.fromJson(json,PostData::class.java)
        postList=postData.posts

    }

    fun populateQuotes(posts:Array<Posts>){

    }


    fun getCurrentQuotes():Posts{
        return postList[currentIndex]
    }

    fun getPreviousQuotes():Posts{
        if(currentIndex==0) return postList[currentIndex]
        return postList[currentIndex--]
    }


    fun getNextQuotes():Posts{
        if(currentIndex == postList.size -1) return postList[currentIndex]
        return postList[currentIndex++]
    }






}