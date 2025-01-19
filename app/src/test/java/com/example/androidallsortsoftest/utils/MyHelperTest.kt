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
    fun passwordValidateTrue(){

        val result=helper.validatePassword("1234567")
        assertEquals("valid",result)

    }

    @Test
    fun passwordValidateEmptyFalse(){

        val result=helper.validatePassword("")
        assertEquals("Password is required",result)

    }

    @Test
    fun passwordValidateLess6False(){

        val result=helper.validatePassword("12345")
        assertEquals("Should be more than 6",result)

    }

    @Test
    fun passwordValidateLess12False(){

        val result=helper.validatePassword("1234567891012")
        assertEquals("Should be less than 12",result)

    }

    @Test
    fun reverseStrCheck(){

        val result=helper.reverseString("123321")
        assertEquals(true,result)

    }

}