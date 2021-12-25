package ru.netology.domain;
//Информация о просмотрах записи. Объект с единственным полем

public class ViewsInfo {
    private int count;//число просмотров записи;
    private String postType;//Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
}
