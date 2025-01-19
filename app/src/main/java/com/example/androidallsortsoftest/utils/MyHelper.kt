package com.example.androidallsortsoftest.utils

import androidx.core.util.rangeTo
import org.junit.After
import org.junit.Before
import org.junit.Test

class MyHelper {

//normally cretae class then just alt insert> create junit 4 test
    // //coverage test to check entire fun call-
    @Test
    fun isPalindrome(input:String):Boolean{

        var i=0
        var j=input.length-1
        var match=true
        while (i<j){
            if(input[i]!=input[j])
            {
                match=false
                break
            }

            i++
            j--
        }

    return match
    }



    fun validatePassword(password:String)=

//        if(password.isNotBlank() && password.length>6 && password.length < 12){
//            return true
//        }else return false

        when{
            password.isBlank() ->"Password is required"
            password.length< 6->"Should be more than 6"
            password.length> 12->"Should be less than 12"
            else->"valid"
        }

 fun reverseString(input: String):Boolean{
     var rev=""
     for (i in input.length-1 downTo 0){
         rev+=input.get(i).toString()
     }

     if(rev.equals(input)){
         return true
     }else return false

 }

}


