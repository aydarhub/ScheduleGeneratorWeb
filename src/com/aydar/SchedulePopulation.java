package com.aydar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SchedulePopulation {

    private List<List<List<LessonInterval>>> scheduleList = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

    public SchedulePopulation(int groupId, List<Lesson> lessons,
                              int daysCountPerWeek, int lessonCountPerDay) {

        for(Lesson lesson : lessons) {
            if (lesson.getGroup().getId() == groupId) {
                this.lessons.add(lesson);
            }
        }

        for (Lesson lesson : this.lessons) {
            System.out.println(lesson.getGroup().getName() + " : " + lesson.getDiscipline().getName());
        }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < 50000; i++) { // Количество особей
            scheduleList.add(new ArrayList<>());
            for (int j = 0; j < daysCountPerWeek; j++) { // Количество дней
                scheduleList.get(i).add(new ArrayList<>());
                for (int k = 0; k < lessonCountPerDay; k++) { // Количество пар за день

                    int lessonNumber = random.nextInt(this.lessons.size());
                    scheduleList.get(i).get(j).add(new LessonInterval(j, k, this.lessons.get(lessonNumber)));
                }
            }
        }
    }

    public List<List<List<LessonInterval>>> getScheduleList() {
        return scheduleList;
    }


}
