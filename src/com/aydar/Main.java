package com.aydar;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBEmulator dbEmulator = new DBEmulator();
        List<Group> groups = Arrays.asList(dbEmulator.getGroups());
        List<Lesson> lessons = Arrays.asList(dbEmulator.getLessons());
        ScheduleLab scheduleLab = new ScheduleLab();
        List<List<List<List<LessonInterval>>>> schedules = scheduleLab.getSchedule(groups, lessons, 5, 4, 10);


    }
}
