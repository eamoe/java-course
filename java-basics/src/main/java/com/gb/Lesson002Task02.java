/* Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера */

package com.gb;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Lesson002Task02 {
    public static void main(String[] args) {

        String query = "SELECT * FROM students";
        String where = " WHERE ";
        String queryClause = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        Object jsonStr = JSONValue.parse(queryClause);

        JSONObject obj = (JSONObject) jsonStr;
        String name = (String) obj.get("name");
        String country = (String) obj.get("country");
        String city = (String) obj.get("city");
        String age = (String) obj.get("age");

        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append(query);

        if(!name.equals("null")
            || !country.equals("null")
            || !city.equals("null")
            || !age.equals("null")) {
            sqlQuery.append(where);
        }

        boolean after = false;

        if (!name.equals("null")) {
            sqlQuery.append("name = '" + name + "'");
            after = true;
        }

        if(!country.equals("null")) {
            if (after == true) {
                sqlQuery.append(" AND ");
            }
            sqlQuery.append("country = '" + country + "'");
            after = true;
        }

        if(!city.equals("null")) {
            if (after == true) {
                sqlQuery.append(" AND ");
            }
            sqlQuery.append("city = '" + city + "'");
            after = true;
        }

        if(!age.equals("null")) {
            if (after == true) {
                sqlQuery.append(" AND ");
            }
            sqlQuery.append("age = '" + age + "'");
        }

        System.out.print(sqlQuery);

    }
}
