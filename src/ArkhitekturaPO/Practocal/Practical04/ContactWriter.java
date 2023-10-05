package ArkhitekturaPO.Practocal.Practical04;

public interface ContactWriter {
    /**
     * - Метод writeContact: записывает новый контакт.
     * Предусловием является передача корректных данных (имя, фамилия и номер телефона).
     * Постусловием является успешная запись контакта в файл.
     * @param name
     * @param surname
     * @param phone
     */
    void writeContact(String name, String surname, String phone);
}
