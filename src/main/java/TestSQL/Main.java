package TestSQL;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //Создадим объект отвечающий за соединение с нашей sql
        //В нем уже есть connection, соединение работает
        DBWorker worker = new DBWorker();
        int count = 1;

        //строковый sql запрос
        String query = "SELECT * FROM users";

        //Создаем statement
        try (Statement statement = worker.getConnection().createStatement();) {
        //Выполняем запрос
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                User user = new User();
                user.setId(1);
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                System.out.println(count + ") " + user.toString());
                count++;
            }
        } catch (SQLException e) {
            System.out.println("Не удалось получить statement");
        }

    }
}
