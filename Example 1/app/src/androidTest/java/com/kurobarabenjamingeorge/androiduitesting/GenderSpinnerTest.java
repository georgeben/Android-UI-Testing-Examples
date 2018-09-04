package com.kurobarabenjamingeorge.androiduitesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.is;

/**
 * Created by George Benjamin on 9/3/2018.
 */

@RunWith(AndroidJUnit4.class)
public class GenderSpinnerTest {
    @Rule
    public ActivityTestRule mActivity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void handleGenderSelection(){
        String[] genderOptions = mActivity.getActivity().getResources().getStringArray(R.array.gender);
        int size = genderOptions.length;

        for(int i = 0; i < size; i++){
            onView(withId(R.id.gender)).perform(click());
            onData(is(genderOptions[i])).perform(click());
        }
    }
}
