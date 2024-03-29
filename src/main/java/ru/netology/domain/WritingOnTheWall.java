package ru.netology.domain;

public class WritingOnTheWall {
    private int id;//Идентификатор записи;
    private int ownerId; //Идентификатор владельца стены, на которой размещена запись;
    private int fromId;//Идентификатор автора записи (от чьего имени опубликована запись);
    private int createdBy;//Идентификатор администратора, который опубликовал запись
    // (возвращается только для сообществ при запросе с ключом доступа администратора).
    // Возвращается в записях, опубликованных менее 24 часов назад;
    private int data;//Время публикации записи в формате unixtime;
    private String text;//текст записи;
    private int replyOwnerId;//Идентификатор владельца записи, в ответ на которую была оставлена текущая;
    private int replyPostId;//Идентификатор записи, в ответ на которую была оставлена текущая;
    private int friendsOnly;//1, если запись была создана с опцией «Только для друзей»;

}
