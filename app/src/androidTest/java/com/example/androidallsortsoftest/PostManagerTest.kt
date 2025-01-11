package com.example.androidallsortsoftest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class PostManagerTest {


    @Test(expected = FileNotFoundException::class)
    fun populateDataFromAsset() {
        var postManager=PostManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        postManager.populateDataFromAsset(context,"")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testpopulateDataFromAssetInvalidJson() {
        var postManager=PostManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        postManager.populateDataFromAsset(context,"post_malform.json")
    }


    @Test()
    fun testpopulateDataFromAssetValidJson() {
        var postManager=PostManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        postManager.populateDataFromAsset(context,"post.json")
        assertEquals(20,postManager.postList.size)
    }




}