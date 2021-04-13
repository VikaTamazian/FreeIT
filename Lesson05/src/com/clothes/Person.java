package com.clothes;

import com.clothes.jacket.IJacket;
import com.clothes.shoes.IShoes;
import com.clothes.trousers.ITrousers;

public class Person implements IPerson{
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;

    public Person (String name, IJacket jacket, ITrousers trousers, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    @Override
    public void dressUp() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }
}
