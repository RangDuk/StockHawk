package com.example.android.stockhawk.sync;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

import timber.log.Timber;

/**
 * Created by Gabe on 2016-11-24.
 */

public class QuoteJobService extends JobService {


    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Timber.d("Intent handled");
        Intent nowIntent = new Intent(getApplicationContext(), QuoteIntentService.class);
        getApplicationContext().startService(nowIntent);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

}