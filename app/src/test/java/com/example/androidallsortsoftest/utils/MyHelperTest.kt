package com.example.androidallsortsoftest.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MyHelperTest {

   lateinit var  helper:MyHelper
    @Before
    fun setup(){
        helper=MyHelper()
        println("B4 every test case")
    }

    @After
    fun tearDown(){
        println("A4 every test")
    }
    @Test
    fun isPalindrome() {

        val result=helper.isPalindrome("hello")
        assertEquals(false,result)

    }

    @Test
    fun isPalindrome_truecase() {
        val result=helper.isPalindrome("aba")
        assertEquals(true,result)

    }

    @Test
    fun passwordValidate(){

        val result=helper.validatePassword("1234567")
        assertEquals(true,result)

    }

}