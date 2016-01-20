package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * @author igiagante on 12/1/16.
 */
public class AsyncTaskTest extends AndroidTestCase {

    public void testCheckAsyncTaskJoke() {
        try {
            AsyncTaskJoke jokeTask = new AsyncTaskJoke(null);
            jokeTask.execute(mContext);
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
            Log.d("joking", joke);
            assertNotNull(joke);
        } catch (Exception e) {
            fail("Timed out");
        }
    }
}
