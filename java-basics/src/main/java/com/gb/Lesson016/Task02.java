/* Создайте метод doSomething(),
который может быть источником одного из типов checked exceptions
(тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение,
которое вызвал метод doSomething().*/

package com.gb.Lesson016;

import java.io.IOException;

public class Task02 {

    public void doSomething() throws IOException {

    }

    public void main(String[] args) {
        try {
            doSomething();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
