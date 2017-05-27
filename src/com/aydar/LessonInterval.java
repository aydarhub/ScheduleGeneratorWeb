package com.aydar;

public class LessonInterval {

    private int day;
    private int number;
    private Lesson lesson;

    public LessonInterval(int day, int number, Lesson lesson) {

        this.day = day;
        this.number = number;
        this.lesson = lesson;
    }

    public int getDay() {
        return day;
    }

    public int getNumber() {
        return number;
    }

    public Lesson getLesson() {
        return lesson;
    }
}
