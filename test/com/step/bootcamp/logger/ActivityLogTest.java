package com.step.bootcamp.logger;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityLogTest {
    @Test
    void shouldAddLogToActivityLogWithoutTimeStamp() {
        LogWithoutTimeStamp someLog = new LogWithoutTimeStamp("some log");

        List<Log> expected = new ArrayList<>();
        expected.add(someLog);

        ActivityLog<LogWithoutTimeStamp> activityLog = new ActivityLog<>();

        assertEquals(expected, activityLog.add(someLog));
    }

    @Test
    void shouldAddMultipleLogsWithoutTimeStamp() {
        LogWithoutTimeStamp log1 = new LogWithoutTimeStamp("some log");
        LogWithoutTimeStamp log2 = new LogWithoutTimeStamp("game has started");
        List<Log> expected = new ArrayList<>();
        expected.add(log1);
        expected.add(log2);

        ActivityLog<LogWithoutTimeStamp> activityLog = new ActivityLog<>();

        activityLog.add(log1);
        List<Log> actual = activityLog.add(log2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAddLogsWithTimeStamps() {
        LogWithTimeStampInMilliSecs log1 = LogWithTimeStampInMilliSecs.createLog("some log");
        LogWithTimeStampInMilliSecs log2 = LogWithTimeStampInMilliSecs.createLog("game has started");
        List<Log> expected = new ArrayList<>();
        expected.add(log1);
        expected.add(log2);

        ActivityLog<LogWithTimeStampInMilliSecs> activityLog = new ActivityLog<>();

        activityLog.add(log1);
        List<Log> actual = activityLog.add(log2);


        assertEquals(expected, actual);
    }
}