package com.example.androidallsortsoftest

import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.test.core.app.ApplicationProvider
import com.example.androidallsortsoftest.room_db.QuoteDao
import com.example.androidallsortsoftest.room_db.QuoteDatabase
import com.example.androidallsortsoftest.room_db.quote_data
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class QuotesDaoTest {

   @get:Rule
   val instaTaskExeR = InstantTaskExecutorRule()

    lateinit var dao: QuoteDao
    lateinit var roomDatabase: QuoteDatabase
    @Before
    fun setup(){
        roomDatabase= Room.inMemoryDatabaseBuilder(ApplicationProvider.getApplicationContext(),
            QuoteDatabase::class.java).allowMainThreadQueries().build()
         dao=roomDatabase.getDao()
        }

    @Test
    fun insertData(){
        var quoteData=quote_data(0,"Andrew")
        runBlocking {
            dao.insertQuote(quoteData)
            var result= async {
                dao.getQuote()

            }
            Log.d("222", "insertData: "+result.await())
           Assert.assertEquals(1,result.await().value)

        }
    }

    @After
    fun tearDown(){
//      roomDatabase.close()
    }

}