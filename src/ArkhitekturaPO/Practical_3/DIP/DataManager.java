package ArkhitekturaPO.Practical_3.DIP;

class DataManager {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String fetchData() {
        return dataSource.getData();
    }
}
