package com.proyectofinal01.comparaapp01

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        Espresso.onView(ViewMatchers.withId(R.id.editText1)).perform(ViewActions.typeText("Hola"))
        Espresso.onView(ViewMatchers.withId(R.id.editText2)).perform(ViewActions.typeText("Hola"))
        Espresso.onView(ViewMatchers.withId(R.id.buttonCompare)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textResult)).check(ViewAssertions.matches(ViewMatchers.withText("Las cadenas son iguales")))
        }
}
