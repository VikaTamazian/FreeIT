package com.homework6.tasks.annotations;

import java.lang.reflect.InvocationTargetException;

/**
 * Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса
 * сервиса (поле обязательное) MyService и кодовое название версии (поле не обязательное) -
 * (например номер версии = 7.1, а кодовое название версии = Nougat).
 * Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
 * get и set методы, переопределенные методы equals и hashcode, а так же private метод
 * (private thisClassInfo), который будет просто печатать данные о самом классе (данные любые на ваш выбор),
 * в котором он определен.
 * Написать программу, которая будет анализировать присутствие аннотации над классом MyService
 * и если она присутствует - создавать экземпляр этого класса, задавать значения его полям и
 * вызывать метод thisClassInfo (использовать возможности пакета reflection).
 */

public class MyServiceRunner {
    public static void main(String[] args) throws Exception {
        MyServiceAnnotationProcessor processor = new MyServiceAnnotationProcessor();
        processor.process(MyService.class);


    }
}
