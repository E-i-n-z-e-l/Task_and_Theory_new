package ArkhitekturaPO.Seminars.SeminarFour.onlineTicket;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        boolean isBookingSuccessful = user.reserveTicket();

        if (isBookingSuccessful) {
            System.out.println("Билет успешно забронирован.");
        } else {
            System.out.println("Не удалось забронировать билет.");
        }
    }
}
