package com.example.androidallsortsoftest.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
@RunWith(value = Parameterized::class)
class ParamaterizedExample(val input:String, val expexctedValue:Boolean) {


    @Test
    fun test(){

        val helper=MyHelper()
        val result=helper.isPalindrome(input)
       Assert.assertEquals(expexctedValue,result)

    }

    companion object{


     @JvmStatic
      @Parameters(name = "{index} :{0} is palindrome -{1}")
      fun data():List<Array<Any>>{

            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true),

            )

        }
    }



}