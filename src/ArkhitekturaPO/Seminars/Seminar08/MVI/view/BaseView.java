package ArkhitekturaPO.Seminars.Seminar08.MVI.view;

import ArkhitekturaPO.Seminars.Seminar08.MVI.model.ViewState;

/**
 * BaseView - базовый интерфейс для всех видов.
 */
public interface BaseView {
    void render(ViewState state);
}
