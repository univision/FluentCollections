package com.github.fcopardo;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

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

    public FluentArrayList<E> fluentReplaceAll(UnaryOperator<E> operator) {
        super.replaceAll(operator);
        return this;
    }

    public FluentArrayList<E> fluentClear(){
        clear();
        return this;
    }

}
