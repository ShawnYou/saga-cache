package com.shawn.cache;

import com.shawn.cache.eliminateAlgorithm.EliminateCode;
import com.shawn.cache.eliminateAlgorithm.FIFOCache;
import com.shawn.cache.eliminateAlgorithm.LFUCache;
import com.shawn.cache.eliminateAlgorithm.LRUCache;

import java.util.Collection;
import java.util.Map;

/**
 *  local cache
 */
public class LocalCache extends AbstractLocalJpaCache{

    private EliminateCode eliminateCode;

    private InnerCache innerCache;

    public LocalCache(EliminateCode code){
        this.eliminateCode = code;
        this.innerCache = buildLocalInnerCache(code);
    }

    private InnerCache buildLocalInnerCache(EliminateCode eliminateCode){
        if(eliminateCode.equals(EliminateCode.LRU)){
            return new LRUCache(10);
        }else if(eliminateCode.equals(EliminateCode.LFU)){
            return new LFUCache(10);
        }else {
            //TODO so on
            return new FIFOCache();
        }
    }

    @Override
    protected Object getCache(Object key) {
        return innerCache.getValue(key);
    }

    @Override
    protected Object putCache(Object key, Object value) {
        return innerCache.putValue(key,value);
    }

    @Override
    protected boolean removeCache(Object key) {
        //TODO
        return false;
    }

    @Override
    protected Map getAllcache(Collection keys) {
        return null;
    }
}
