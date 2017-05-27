package com.aydar;

public class DBEmulator {

    private Audience[] audiences = {
            new Audience(1, "Л215"),
            new Audience(2, "301"),
            new Audience(3, "402"),
            new Audience(4, "218"),
            new Audience(5, "219"),
            new Audience(6, "2к/211"),
            new Audience(7, "Л113"),
            new Audience(8, "306"),
            new Audience(9, "233"),
            new Audience(10, "227"),
            new Audience(11, "401"),
            new Audience(12, "Л201"),
            new Audience(13, "Л315"),
            new Audience(14, "302"),
            new Audience(15, "Л113"),
            new Audience(16, "Л301"),
            new Audience(17, "Л306"),
            new Audience(18, "Л309"),
            new Audience(19, "Л207"),
            new Audience(20, "2к/202"),
            new Audience(21, "234"),
            new Audience(22, "201"),
    };

    private Group[] groups = {
            new Group(1, "423К"),
            new Group(2, "324K"),
            new Group(3, "325K"),
            new Group(4, "226K"),
            new Group(5, "227K"),
            new Group(6, "128K"),
            new Group(7, "129K")
    };

    private Teacher[] teachers = {
            new Teacher(1, "Нуриев"),
            new Teacher(2, "Ганиева"),
            new Teacher(3, "Габутдинов"),
            new Teacher(4, "Белова"),
            new Teacher(5, "Алимова"),
            new Teacher(6, "Бикмуллина"),
            new Teacher(7, "Газдалиев"),
            new Teacher(8, "Шамсутдинова"),
            new Teacher(9, "Солдатов"),
            new Teacher(10, "Гильфанов"),
            new Teacher(11, "Шуленкова"),
            new Teacher(12, "Ролдугина"),
            new Teacher(13, "Федосеев"),
            new Teacher(14, "Газизова"),
            new Teacher(15, "Гильфанова"),
            new Teacher(16, "Фасхутдинова"),
            new Teacher(17, "Ильина"),
            new Teacher(18, "Мусина"),
            new Teacher(19, "Кипрова"),
            new Teacher(20, "Трапезникова"),
            new Teacher(21, "Грязнов"),
            new Teacher(22, "Набиуллина"),
            new Teacher(23, "Фаизова"),
            new Teacher(24, "Салихова"),
            new Teacher(25, "Цветков"),
            new Teacher(26, "Хаматшин"),
            new Teacher(27, "Габдрахманова"),
            new Teacher(28, "Елькина"),
            new Teacher(29, "Кузнецова")
    };

    private Discipline[] disciplines = {
            new Discipline(1, "МДК 0301"),
            new Discipline(2, "Инф.безопасность"),
            new Discipline(3, "Семьеведение"),
            new Discipline(4, "Пакеты прикл.пр."),
            new Discipline(5, "Ин. язык"),
            new Discipline(6, "Физ-ра"),
            new Discipline(7, "Этика дел.отнош."),
            new Discipline(8, "Мат.методы"),
            new Discipline(9, "Основы философии"),
            new Discipline(10, "Химия"),
            new Discipline(11, "МДК 0201"),
            new Discipline(12, "МДК 0101"),
            new Discipline(13, "МДК 0202"),
            new Discipline(14, "МДК 0302"),
            new Discipline(15, "МДК 0102"),
            new Discipline(16, "Основы экономики"),
            new Discipline(17, "Осн.программирования"),
            new Discipline(18, "Архит.комп.сист."),
            new Discipline(19, "Теор.вер. и мат.стат."),
            new Discipline(20, "Эл.мат.лог."),
            new Discipline(21, "Эл.высш.мат."),
            new Discipline(22, "Тат.язык"),
            new Discipline(23, "Операц.сист."),
            new Discipline(24, "МДК 0401"),
            new Discipline(25, "ТСИ"),
            new Discipline(26, "Дискр.матем."),
            new Discipline(27, "Информатика"),
            new Discipline(28, "Экология"),
            new Discipline(29, "География"),
            new Discipline(30, "Физика"),
            new Discipline(31, "Математика"),
            new Discipline(32, "История"),
            new Discipline(33, "Черчение"),
            new Discipline(34, "Обществознание"),
            new Discipline(35, "Литература"),
            new Discipline(36, "ОБЖ")
    };

    private Lesson[] lessons = {
            //423К
            new Lesson(1, disciplines[0], teachers[0], groups[0], null, 4), // МДК 0301
            new Lesson(2, disciplines[1], teachers[2], groups[0], audiences[0], 4), // Инф. безоп.
            new Lesson(3, disciplines[2], teachers[3], groups[0], audiences[1], 1), // Семьеведение
            new Lesson(4, disciplines[3], teachers[1], groups[0], audiences[2], 3), // ПППр
            new Lesson(5, disciplines[4], teachers[4], groups[0], audiences[3], 1), // Ин. яз.
            new Lesson(6, disciplines[5], teachers[6], groups[0], null, 1), // Физ-ра
            new Lesson(7, disciplines[6], teachers[7], groups[0], null, 1), // Этика
            //324К
            new Lesson(8, disciplines[7], teachers[1], groups[1], audiences[2], 3), // Мат.методы
            new Lesson(9, disciplines[8], teachers[10], groups[1], audiences[8], 1), // Основы философии
            new Lesson(10, disciplines[10], teachers[9], groups[1], audiences[7], 3), // МДК 0201
            new Lesson(11, disciplines[5], teachers[8], groups[1], null, 1), // Физ-ра
            new Lesson(12, disciplines[11], teachers[2], groups[1], audiences[0], 1), // МДК 0101
            new Lesson(13, disciplines[12], teachers[1], groups[1], audiences[2], 3), // МДК 0202
            new Lesson(14, disciplines[13], teachers[2], groups[1], audiences[0], 1), // МДК 0302
            new Lesson(15, disciplines[14], teachers[2], groups[1], audiences[0], 3), // МДК 0102
            new Lesson(16, disciplines[15], teachers[11], groups[1], audiences[9], 2), // Основы экономики
            new Lesson(17, disciplines[4], teachers[4], groups[1], audiences[3], 1), // Ин. яз.
            //325К
            new Lesson(18, disciplines[7], teachers[1], groups[2], audiences[2], 3), // Мат.методы
            new Lesson(19, disciplines[8], teachers[10], groups[2], audiences[8], 1), // Основы философии
            new Lesson(20, disciplines[10], teachers[9], groups[2], audiences[7], 3), // МДК 0201
            new Lesson(21, disciplines[5], teachers[8], groups[2], null, 1), // Физ-ра
            new Lesson(22, disciplines[11], teachers[2], groups[2], audiences[0], 1), // МДК 0101
            new Lesson(23, disciplines[12], teachers[1], groups[2], audiences[2], 3), // МДК 0202
            new Lesson(24, disciplines[13], teachers[2], groups[2], audiences[0], 1), // МДК 0302
            new Lesson(25, disciplines[14], teachers[2], groups[2], audiences[0], 3), // МДК 0102
            new Lesson(26, disciplines[15], teachers[11], groups[2], audiences[9], 2), // Основы экономики
            new Lesson(27, disciplines[4], teachers[4], groups[2], audiences[3], 1), // Ин. яз.
            //226К
            new Lesson(28, disciplines[5], teachers[12], groups[3], null, 1), // Физ-ра
            new Lesson(29, disciplines[16], teachers[2], groups[3], audiences[0], 2), // Основы программирования
            new Lesson(30, disciplines[17], teachers[13], groups[3], audiences[10], 2), // Архит.комп.сист.
            new Lesson(31, disciplines[19], teachers[1], groups[3], audiences[2], 3), // Эл.мат.лог.
            new Lesson(32, disciplines[20], teachers[16], groups[3], audiences[13], 3), // Эл.высш.мат.
            new Lesson(33, disciplines[22], teachers[2], groups[3], audiences[0], 1), // Опер.сист.
            new Lesson(34, disciplines[23], teachers[2], groups[3], audiences[0], 1), // МДК 0401
            new Lesson(35, disciplines[24], teachers[13], groups[3], audiences[10], 1), // ТСИ
            new Lesson(36, disciplines[18], teachers[1], groups[3], audiences[2], 1), // Теор.вер.и мат.стат.
            new Lesson(37, disciplines[25], teachers[16], groups[3], audiences[13], 1), // Дискр.матем.
            new Lesson(38, disciplines[4], teachers[4], groups[3], audiences[3], 1), // Ин. яз.
            new Lesson(39, disciplines[21], teachers[14], groups[3], audiences[11], 1), // Тат. яз.
            //227К
            new Lesson(40, disciplines[5], teachers[12], groups[4], null, 1), // Физ-ра
            new Lesson(41, disciplines[16], teachers[2], groups[4], audiences[0], 2), // Основы программирования
            new Lesson(42, disciplines[17], teachers[13], groups[4], audiences[10], 2), // Архит.комп.сист.
            new Lesson(43, disciplines[19], teachers[1], groups[4], audiences[2], 3), // Эл.мат.лог.
            new Lesson(44, disciplines[20], teachers[16], groups[4], audiences[13], 3), // Эл.высш.мат.
            new Lesson(45, disciplines[22], teachers[2], groups[4], audiences[0], 1), // Опер.сист.
            new Lesson(46, disciplines[23], teachers[2], groups[4], audiences[0], 1), // МДК 0401
            new Lesson(47, disciplines[24], teachers[13], groups[4], audiences[10], 1), // ТСИ
            new Lesson(48, disciplines[18], teachers[1], groups[4], audiences[2], 1), // Теор.вер.и мат.стат.
            new Lesson(49, disciplines[25], teachers[16], groups[4], audiences[13], 1), // Дискр.матем.
            new Lesson(50, disciplines[4], teachers[4], groups[4], audiences[3], 1), // Ин. яз.
            new Lesson(51, disciplines[21], teachers[14], groups[4], audiences[11], 1), // Тат. яз.
            //128К
            new Lesson(52, disciplines[4], teachers[21], groups[5], audiences[17], 2), // Ин. яз.
            new Lesson(53, disciplines[26], teachers[23], groups[5], audiences[18], 2), // Информатика
            new Lesson(54, disciplines[27], teachers[17], groups[5], audiences[14], 1), // Экология
            new Lesson(55, disciplines[28], teachers[18], groups[5], audiences[15], 1), // География
            new Lesson(56, disciplines[29], teachers[19], groups[5], audiences[16], 2), // Физика
            new Lesson(57, disciplines[31], teachers[20], groups[5], null, 2), // История
            new Lesson(58, disciplines[30], teachers[16], groups[5], audiences[13], 3), // Математика
            new Lesson(59, disciplines[33], teachers[26], groups[5], audiences[20], 1), // Обществознание
            new Lesson(60, disciplines[34], teachers[10], groups[5], audiences[8], 2), // Литература
            new Lesson(61, disciplines[35], teachers[25], groups[5], audiences[19], 1), // ОБЖ
            new Lesson(62, disciplines[5], teachers[24], groups[5], null, 1), // Физ-ра
            new Lesson(63, disciplines[32], teachers[27], groups[5], audiences[21], 1), // Черчение
            new Lesson(64, disciplines[9], teachers[17], groups[5], audiences[14], 1), // Химия
            //129К
            new Lesson(65, disciplines[4], teachers[21], groups[6], audiences[17], 2), // Ин. яз.
            new Lesson(66, disciplines[26], teachers[23], groups[6], audiences[18], 2), // Информатика
            new Lesson(67, disciplines[27], teachers[17], groups[6], audiences[14], 1), // Экология
            new Lesson(68, disciplines[28], teachers[18], groups[6], audiences[15], 1), // География
            new Lesson(69, disciplines[29], teachers[19], groups[6], audiences[16], 2), // Физика
            new Lesson(70, disciplines[31], teachers[20], groups[6], null, 2), // История
            new Lesson(71, disciplines[30], teachers[16], groups[6], audiences[13], 3), // Математика
            new Lesson(72, disciplines[33], teachers[26], groups[6], audiences[20], 1), // Обществознание
            new Lesson(73, disciplines[34], teachers[10], groups[6], audiences[8], 2), // Литература
            new Lesson(74, disciplines[35], teachers[25], groups[6], audiences[19], 1), // ОБЖ
            new Lesson(75, disciplines[5], teachers[24], groups[6], null, 1), // Физ-ра
            new Lesson(76, disciplines[32], teachers[27], groups[6], audiences[21], 1), // Черчение
            new Lesson(77, disciplines[9], teachers[17], groups[6], audiences[14], 1) // Химия
    };

    public Audience[] getAudiences() {
        return audiences;
    }

    public Group[] getGroups() {
        return groups;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Discipline[] getDisciplines() {
        return disciplines;
    }

    public Lesson[] getLessons() {
        return lessons;
    }
}
