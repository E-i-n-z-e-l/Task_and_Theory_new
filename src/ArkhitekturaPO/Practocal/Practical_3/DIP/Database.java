package ArkhitekturaPO.Practocal.Practical_3.DIP;

class Database implements DataSource {
    public String getData() {
        return "Данные из базы данных";
    }
}
