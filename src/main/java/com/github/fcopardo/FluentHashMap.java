package com.github.fcopardo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fco on 24-11-17.
 */
public class FluentHashMap<E, X> extends HashMap<E, X> {

    public FluentHashMap<E, X> putFluent(E key, X value){
        super.put(key, value);
        return this;
    }

    public FluentHashMap<E, X> putAllFluent(Map<? extends E, ? extends X> map){
        super.putAll(map);
        return this;
    }

    public FluentHashMap<E, X> removeFluent(Object key){
        super.remove(key);
        return this;
    }
}
