package ArkhitekturaPO.Seminars.Seminar08.MVPVM.viewModel;

import ArkhitekturaPO.Seminars.Seminar08.MVPVM.model.Task;

public class TaskViewModel {
    private String displayName;

    public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
    }

    public String getDisplayName() {
        return displayName;
    }
}
