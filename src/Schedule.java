import com.aydar.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aydarhub on 26.05.17.
 */
@WebServlet(name = "Schedule", urlPatterns = "/schedule")
public class Schedule extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBEmulator dbEmulator = new DBEmulator();
        List<Group> groups = Arrays.asList(dbEmulator.getGroups());
        List<Lesson> lessons = Arrays.asList(dbEmulator.getLessons());
        ScheduleLab scheduleLab = new ScheduleLab();
        List<List<List<List<LessonInterval>>>> schedules = scheduleLab.getSchedule(
                groups, lessons, 5, 4, 10);

        request.setAttribute("schedules", schedules);
        request.getRequestDispatcher("WEB-INF/schedule.jsp").forward(request, response);
    }
}
