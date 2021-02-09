package com.example.namequiz;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.example.namequiz.activity.DatabaseActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DatabaseEntryTest {

    @Rule
    public ActivityScenarioRule<DatabaseActivity> activityRule =
            new ActivityScenarioRule<DatabaseActivity>(DatabaseActivity.class);

    @Test
    public void entryCountTest(){
        
    }
}