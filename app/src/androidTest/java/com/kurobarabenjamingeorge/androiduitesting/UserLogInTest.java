package com.kurobarabenjamingeorge.androiduitesting;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class UserLogInTest {

    @Rule
    public ActivityTestRule MActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onActivityLaunch(){
        onView(withId(R.id.nameEditText)).perform(typeText("My name is George"));
        onView(withId(R.id.submitButton)).perform(click());
       onView(withId(R.id.usernameTextview)).check(matches(withText("My name is George")));
    }

}
