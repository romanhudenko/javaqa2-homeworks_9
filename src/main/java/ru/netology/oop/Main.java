package ru.netology.oop;

import ru.netology.oop.data.FormDate;
import ru.netology.oop.data.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate birthday = new FormDate();
        birthday.day = 13;
        birthday.month = 6;
        birthday.year = 1999;
        post.birthday = birthday;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}