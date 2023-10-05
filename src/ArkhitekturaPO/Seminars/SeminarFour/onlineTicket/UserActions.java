package ArkhitekturaPO.Seminars.SeminarFour.onlineTicket;

import java.util.Date;

/**
 * Компонент: UserActions
 * Версия: 1.0.0
 *
 * Описание: Этот компонент определяет контракты для действий пользователя.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 * - 1.1.0: Добавлена поддержка новой функциональности.
 */
interface UserActions {
    /**
     * Предусловия: username и password не должны быть пустыми
     * @param username
     * @param password
     * @return true, если авторизация прошла успешно, иначе false
     */
    boolean authorize(String username, String password);

    /**
     * Предусловия:
     * <p>
     * 1. routeId не должен быть пустым.
     * <p>
     * <p>
     * 2. time должно быть больше текущего времени.
     * <p>
     * @param routeId
     * @param time
     * @return true, если маршрут успешно выбран, иначе false
     */
    boolean selectRoute(String routeId, Date time);

    /**
     * Проверяем доступны ли билеты.
     * @return  true, если билеты доступны, иначе false
     */
    boolean checkTicketAvailability();

    /**
     * Проверяем есть ли средства у заказчика билета(user).
     * @return true, если достаточно средств, иначе false
     */
    boolean checkFunds();
}
