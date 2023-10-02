package ArkhitekturaPO.Practical04;

public interface ContactReader {
    /**
     * Метод readContacts: читает контакты из файла и выводит их на экран.
     * Предусловием является передача корректного имени файла.
     * Постусловием является успешное чтение контактов из файла и вывод на экран.
     * @param csvFile
     */
    void readContacts(String csvFile);
}
