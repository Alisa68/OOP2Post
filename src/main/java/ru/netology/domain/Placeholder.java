package ru.netology.domain;
//заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.

public class Placeholder {
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editModeAll;// значения VK Donut можно изменить в записи всю информациюо VK Donut.
    private String editModeDuration; // изменить время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private int postponedId; //Идентификатор отложенной записи возвращается тогда, когда запись стояла на таймере
}
