package ru.netology.domain;

public class LikesInfo {
    private int count; //число пользователей, которым понравилась запись;
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя (есть — true, нет— false);
    private boolean canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (true — может, false — не может);
    private boolean canPublish;//информация о том, может ли текущий пользователь сделать репост записи (true — может, false — не может)

    //+getter/setter
}
