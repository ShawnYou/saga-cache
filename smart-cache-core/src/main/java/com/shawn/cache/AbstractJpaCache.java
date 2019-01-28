package com.shawn.cache;


/**
 * Abstract cache implements
 */
public abstract class AbstractJpaCache implements JpaCache{


    @Override
    public Object get(Object key) {
        //TODO
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        //TODO
    }

    @Override
    public boolean remove(Object key) {
        //TODO
        return false;
    }

    @Override
    public void clear() {

    }
}
