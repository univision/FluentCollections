package com.github.fcopardo;

import java.util.ArrayList;

/**
 * Created by fco on 16-11-17.
 */
public class FluentArrayList<E> extends ArrayList<E> {

    public FluentArrayList<E> addFluent(E element){
        this.add(element);
        return this;
    }

    public E getElement(E element){
        if(this.contains(element)){
            return get(this.indexOf(element));
        }
        return null;
    }

}
