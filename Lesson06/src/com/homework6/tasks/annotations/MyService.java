package com.homework6.tasks.annotations;

import java.util.Objects;

/**
 * Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
 * get и set методы, переопределенные методы equals и hashcode, а так же private метод
 * (private thisClassInfo), который будет просто печатать данные о самом классе (данные любые на ваш выбор),
 * в котором он определен.
 */
@Version(isActive = true, version = "1.7", name = "Nougat")
public class MyService {
    private String version;
    private String name;

    public MyService(String version, String name) {
        this.version = version;
        this.name = name;
    }

    public MyService(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Objects.equals(version, myService.version) &&
                Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, name);
    }


    private void thisClassInfo() {
        System.out.format("MyService{version='%s', name='%s'}", version, name);
    }
}
