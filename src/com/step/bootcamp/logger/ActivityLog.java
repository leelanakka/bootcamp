package com.step.bootcamp.logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ActivityLog<T extends Log> {
    private List<T> logs;

    ActivityLog() {
        this.logs = new ArrayList<>();
    }

    List<Log> add(T log) {
        logs.add(log);
        return Collections.unmodifiableList(logs);
    }
}
