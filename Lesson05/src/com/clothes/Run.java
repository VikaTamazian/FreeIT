package com.clothes;

import com.clothes.jacket.Sweater;
import com.clothes.jacket.TShirt;
import com.clothes.shoes.HighBoots;
import com.clothes.shoes.Sneakers;
import com.clothes.trousers.Jeans;
import com.clothes.trousers.Shorts;

/**
 * 2) По аналогии с первым задание делаем след. задание.
 * Интерфейсы:
 * - Куртка
 * - Штаны
 * - Обувь
 * в каждом интерфейсе есть 2 метода (надеть и снять)
 * Делаем несколько реализации каждого интерфейса.
 * Создаём класс человек:
 * У человека поля:
 * -имя
 * -куртка
 * -штаны
 * -обувь
 * У человека есть 2 метода:
 * - одеться(вызываются методы надеть у всех вещей)
 * - раздеться (вызываются методы снять у всех вещей)
 */

public class Run {

    public static void main(String[] args) {
        Sweater sweater = new Sweater();
        TShirt tShirt = new TShirt();
        Jeans jeans = new Jeans();
        Shorts shorts = new Shorts();
        HighBoots highBoots = new HighBoots();
        Sneakers sneakers = new Sneakers();

        Person person1 = new Person("Mary", sweater, jeans, highBoots);
        Person person2 = new Person("Mike", tShirt, shorts, sneakers);

        System.out.println(person1.getName());
        person1.dressUp();
        System.out.println(person2.getName());
        person2.undress();

    }


}
