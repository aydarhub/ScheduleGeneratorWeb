package com.aydar;

import java.util.*;

public class ScheduleLab {


    /*
    * int scheduleCount - количество различных вариантов расписания, которое сгенерирует программа
    * */

    public List<List<List<List<LessonInterval>>>> getSchedule(List<Group> groups, List<Lesson> lessons,
                                                              int daysCountPerWeek, int lessonCountPerDay,
                                                              int scheduleCount) {
        List<SchedulePopulation> schedulePopulations = getSchedulePopulations(groups, lessons, daysCountPerWeek,
                                                                                    lessonCountPerDay);
        List<List<List<List<LessonInterval>>>> sortedSchedules = getSortedSchedules(
                schedulePopulations, lessons);
        //
        //
        // написать метод для нахождения расписаний с минимальными пересечениями.
        //
        //

        TreeMap<Integer, List<List<List<List<LessonInterval>>>>> schedules = getScheduleWithMinumumIntersections(
                sortedSchedules, daysCountPerWeek, lessonCountPerDay);

        List<List<List<List<LessonInterval>>>> schedulesReady = new ArrayList<>();

//        for (int i = 0; i < scheduleCount; i++) {
//            int key = (int) schedules.keySet().toArray()[i];
//            schedulesReady.add(schedules.get(key));
//        }

        int count = 0;
        for (List<List<List<List<LessonInterval>>>> sc : schedules.values()) {
            if (count >= scheduleCount) {
                break;
            }
            for (List<List<List<LessonInterval>>> sc1 : sc){
                if (count < scheduleCount) {
                    schedulesReady.add(sc1);
                    count++;
                }
                break;
            }
        }

        return schedulesReady;
    }

    // возвращает варианты расписаний с количеством пересечений в каждом из них
    private TreeMap<Integer, List<List<List<List<LessonInterval>>>>> getScheduleWithMinumumIntersections(
            List<List<List<List<LessonInterval>>>> schedules,
            int daysCountPerWeek, int lessonCountPerDay) {

        List<List<List<List<LessonInterval>>>> scheduleVariants = new ArrayList<>();
        TreeMap<Integer, List<List<List<List<LessonInterval>>>>> schedulesReadyVariants = new TreeMap<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            //сгенерировать различные комбинации расписаний
            scheduleVariants.add(new ArrayList<>());

            for (int j = 0; j < schedules.size(); j++) {
                int lessonNum = random.nextInt(schedules.get(j).size());
                scheduleVariants.get(i).add(schedules.get(j).get(lessonNum));
            }

//            for (List<List<List<LessonInterval>>> schedulesForGroup : schedules) {
//                int lessonNum = random.nextInt(schedulesForGroup.size());
//                scheduleVariants.get(i).add(schedules.get(i).get(lessonNum));
//            }

        }

        for (List<List<List<LessonInterval>>> schedule : scheduleVariants) {
            int overlapsCount = 0;
            for (int i = 0; i < daysCountPerWeek; i++) {
                for (int j = 0; j < lessonCountPerDay; j++) {
                    for (int k = 0; k < schedule.size() - 1; k++) {
                        Teacher teacherCurrent = schedule.get(k).get(i).get(j).getLesson().getTeacher();
                        Teacher teacherNext = schedule.get(k + 1).get(i).get(j).getLesson().getTeacher();
                        Audience audienceCurrent = schedule.get(k).get(i).get(j).getLesson().getAudience();
                        Audience audienceNext = schedule.get(k + 1).get(i).get(j).getLesson().getAudience();
                        if (teacherCurrent.equals(teacherNext) || (audienceCurrent != null &&
                                audienceCurrent.equals(audienceNext))) {
                            overlapsCount++;
                        }
                    }

                }
            }
            schedulesReadyVariants.computeIfAbsent(overlapsCount, k -> new ArrayList<>());
            schedulesReadyVariants.get(overlapsCount).add(schedule);
        }
//        schedulesReadyVariants.values().toArray();
//        List<List<List<List<LessonInterval>>>> SchedulesReady = Arrays.copyOfRange(schedulesReadyVariants.values().toArray(), 0, scheduleCount);

        return schedulesReadyVariants;

    }

    /*
    * Метод принимает список всех рандомно сгенерированных популяций расписаний для всех групп, список всех учебных пар
    * и возвращает отсортированные по условию расписания для каждой группы.
    * Условие: (каждый предмет должен повторяться за неделю определенное количество раз).
    * */
    private List<List<List<List<LessonInterval>>>> getSortedSchedules(
            List<SchedulePopulation> schedulePopulations, List<Lesson> lessons) {

        List<List<List<List<LessonInterval>>>> schedules = new ArrayList<>();
        Boolean isToAdd;

        for (SchedulePopulation schedulePopulation : schedulePopulations) { // для расписаний каждой группы
            List<List<List<LessonInterval>>> sl = schedulePopulation.getScheduleList(); // все расписания группы
            Map<Integer, Integer> lessonsForGroup = new TreeMap<>(); // счетчик количества определенных предметов
                                                                    // за неделю

            List<List<List<LessonInterval>>> sortedScheduleListForGroup = new ArrayList<>();

            for (List<List<LessonInterval>> onePerWeek : sl) { // для каждого расписания группы
                isToAdd = true;
                for (int i = 0; i < lessons.size(); i++) {
                    if (lessons.get(i).getGroup().equals(sl.get(0).get(0).get(0).getLesson().getGroup())) {
                        lessonsForGroup.put(i, 0);
                    }
                }
                for (List<LessonInterval> lessonPerDay : onePerWeek) { // для каждого дня
                    for (LessonInterval lessonInterval : lessonPerDay) { // если есть повторение,
                                                                        // увеличиваем значение счетчика
                        //int lessonId = 0;
                        for (int i = 0; i < lessons.size(); i++) {
                            if (lessons.get(i).getId() == lessonInterval.getLesson().getId()) {
                                if (lessonsForGroup.get(i) == null) {
                                    System.out.println("lessonsForGroup.get(i) = null");
                                    System.out.println("item = " + i);
                                    System.out.println("groupId = " + lessonInterval.getLesson().getGroup().getId());
                                    System.out.println("day = " + lessonInterval.getDay());
                                }
                                lessonsForGroup.put(i, lessonsForGroup.get(i) + 1);
                                break;
                            }
                        }
//                        lessonsForGroup.put(lessonId, lessonsForGroup.get(lessonId) + 1);
//                        lessonsForGroup.put(lessonInterval.getLesson().getId(),
//                                            lessonsForGroup.get(lessonInterval.getLesson().getId()) + 1);

                    }
                }
                for (Map.Entry lessonEntry : lessonsForGroup.entrySet()) {
                    int lessonId = (int) lessonEntry.getKey();
                    int count = (int) lessonEntry.getValue();
                    if ((count == 0) || (count < lessons.get(lessonId).getCountPerWeek() - 1) ||
                            (count > lessons.get(lessonId).getCountPerWeek() + 1)) {
                        isToAdd = false;
                        break;
                    }
                }
                if (isToAdd) {
                    sortedScheduleListForGroup.add(onePerWeek);
                }

            }

            schedules.add(sortedScheduleListForGroup);

        }
        return schedules;

    }

    private List<SchedulePopulation> getSchedulePopulations(List<Group> groups, List<Lesson> lessons,
                                                            int daysCountPerWeek, int lessonCountPerDay) {
        List<SchedulePopulation> schedulePopulations = new ArrayList<>();

        for (Group group : groups) {
            schedulePopulations.add(new SchedulePopulation(group.getId(), lessons, daysCountPerWeek,
                                                            lessonCountPerDay));
        }

        return schedulePopulations;
    }
}
