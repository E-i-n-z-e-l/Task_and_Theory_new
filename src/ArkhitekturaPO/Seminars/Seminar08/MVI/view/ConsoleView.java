package ArkhitekturaPO.Seminars.Seminar08.MVI.view;

import ArkhitekturaPO.Seminars.Seminar08.MVI.model.TasksViewState;
import ArkhitekturaPO.Seminars.Seminar08.MVI.model.ViewState;

public class ConsoleView implements BaseView {

    @Override
    public void render(ViewState state) {
        if (state instanceof TasksViewState) {
            TasksViewState tasksState = (TasksViewState) state;
            System.out.println(tasksState);
        } else {
            System.out.println("Неизвестное состояние.");
        }
    }
}
