package com.example.androidallsortsoftest.utils

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

}