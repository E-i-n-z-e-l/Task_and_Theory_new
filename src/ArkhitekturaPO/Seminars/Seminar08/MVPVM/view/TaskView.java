package ArkhitekturaPO.Seminars.Seminar08.MVPVM.view;

import ArkhitekturaPO.Seminars.Seminar08.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
