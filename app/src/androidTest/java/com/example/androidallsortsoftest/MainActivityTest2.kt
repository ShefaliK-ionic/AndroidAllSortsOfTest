package com.example.androidallsortsoftest

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.Matchers.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

//todo Espresso test should add in androidTest pkg
class MainActivityTest2{

    @get:Rule
    val activitySecnarioRule= activityScenarioRule<MainActivity>()

    @Test
    fun testWithFieldFill(){
        Espresso.onView(withId(R.id.btnView)).perform(click())
        Espresso.onView(withId(R.id.etFirstName)).check(matches(withText("Shriti")))
//        Espresso.onView(withId(R.id.btnSubmit)).perform(click())
    }


    @Test
    fun checkIntent(){
        Intents.init()
        val expected=allOf(hasAction(Intent.ACTION_VIEW))
        Espresso.onView(withId(R.id.btnSubmit)).perform(click())

        intended(expected)
        Intents.release()
    }

    @Test
    fun checkExpectedvalue(){

        Espresso.onView(withId(R.id.etFirstName)).check(matches(withText("Shriti")))
        Espresso.onView(withId(R.id.etLastName)).check(matches(withText("Devoy")))
        Espresso.onView(withId(R.id.btnSend)).perform(click())

       Espresso.onView(withId(R.id.tvResult)).check(matches(withText("Firstname - Shriti | Lastname - Devoy")))

    }

}