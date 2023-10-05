package ArkhitekturaPO.Seminars.SeminarFour.onlineTicket;


interface TicketActions {
    /**
     * @return true, если билет успешно забронирован, иначе false
     * @pre User должен быть авторизован и выбран маршрут.
     * @pre Билеты на выбранный маршрут и время должны быть доступны.
     * @pre У пользователя должно быть достаточно средств для бронирования.
     * @post Билет забронирован.
     * <p>
     * - Метод reserveTicket()
     * <p>
     *     <p>
     *     - Предусловия:
     *     <p>
     *         <p>
     *         - isAuthorized() == true
     *         <p>
     *         <p>
     *         - isRouteSelected() == true
     *         <p>
     *         <p>
     *         - checkTicketAvailability() == true
     *         <p>
     *         <p>
     *         - checkFunds() == true
     *     <p>
     */
    boolean reserveTicket();

    /**
     * @return true, если списание средств прошло успешно, иначе false
     * @pre Билеты на выбранный маршрут и время должны быть доступны.
     * @post Билет забронирован.
     */
    boolean deductFunds();

    /**
     * @return true, если подтверждение покупки прошло успешно, иначе false
     * @pre Билеты на выбранный маршрут и время должны быть доступны.
     * @post Билет забронирован.
     */
    boolean confirmPurchase();

    /**
     * Билеты должны быть доступны только на будущие даты
     */
    void updateTicketAvailability();

    /**
     * Невозможно забронировать билет.
     * @return true, если отмена бронирования прошла успешно, иначе false
     */
    boolean cancelReservation();
}
