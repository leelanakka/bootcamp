package com.step.bootcamp.logger;

import java.util.Calendar;

public class LogWithTimeStampInSecs extends Log {
    private String timeStamp;

    LogWithTimeStampInSecs(String event, String timeStamp) {
        super(event);
        this.timeStamp = timeStamp;
    }

    static LogWithTimeStampInSecs createLog(String event) {
        Calendar calendar = Calendar.getInstance();
        int milliSeconds = calendar.get(Calendar.MILLISECOND);
        int seconds = calendar.get(Calendar.SECOND);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        String timeStamp = "" + hours + ":" + minutes + ":" + seconds + ":" + milliSeconds;
        return new LogWithTimeStampInSecs(event,timeStamp);
    }
}
