package ArkhitekturaPO.Seminars.Seminar08.MVPVM.presenter;

import ArkhitekturaPO.Seminars.Seminar08.MVPVM.model.Task;
import ArkhitekturaPO.Seminars.Seminar08.MVPVM.view.TaskView;
import ArkhitekturaPO.Seminars.Seminar08.MVPVM.viewModel.TaskViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskPresenter {
    private List<Task> tasks = new ArrayList<>();
    private TaskView view;

    public TaskPresenter(TaskView view) {
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void displayTasks() {
        List<TaskViewModel> taskViewModels = tasks.stream()
                .map(TaskViewModel::new)
                .collect(Collectors.toList());
        view.showTasks(taskViewModels);
    }

    public void completeTask(int index) {
        tasks.get(index).complete();
        displayTasks();
    }
}
