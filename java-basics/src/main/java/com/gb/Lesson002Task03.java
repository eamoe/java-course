/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

package main.java.com.gb;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.Iterator;

public class Lesson002Task03 {
    public static void main(String[] args) {

        String jsonFile =   "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},\n" +
                            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},\n" +
                            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        Object json = JSONValue.parse(jsonFile);
        JSONArray array = (JSONArray) json;

        Iterator it = array.iterator();
        while(it.hasNext()){

            JSONObject student = (JSONObject) it.next();
            String lastName = (String) student.get("фамилия");
            String score = (String) student.get("оценка");
            String subject = (String) student.get("предмет");

            StringBuilder response = new StringBuilder();
            response.append("Студент ").append(lastName);
            response.append(" получил ").append(score);
            response.append(" по предмету ").append(subject);
            response.append(".");

            System.out.println(response);
        }






    }
}
