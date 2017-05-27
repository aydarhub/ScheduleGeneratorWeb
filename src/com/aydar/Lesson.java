package com.aydar;

public class Lesson {

    private int id;
    private Discipline discipline;
    private Teacher teacher;
    private Group group;
    private Audience audience;
    private int countPerWeek;

    public Lesson(int id, Discipline discipline, Teacher teacher, Group group, Audience audience, int countPerWeek) {
        this.id = id;
        this.discipline = discipline;
        this.teacher = teacher;
        this.group = group;
        this.audience = audience;
        this.countPerWeek = countPerWeek;
    }

    public int getId() {
        return id;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public Audience getAudience() {
        return audience;
    }

    public int getCountPerWeek() {
        return countPerWeek;
    }
}
