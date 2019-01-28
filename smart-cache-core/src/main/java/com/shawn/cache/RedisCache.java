package com.shawn.cache;

import java.util.Collection;
import java.util.Map;

/**
 * redis cache
 */
public class RedisCache extends AbstractExternalJapCache {
    @Override
    protected Object getCache(Object key) {
        return null;
    }

    @Override
    protected Object putCache(Object key, Object value) {
        return null;
    }

    @Override
    protected boolean removeCache(Object key) {
        return false;
    }

    @Override
    protected Map getAllcache(Collection keys) {
        return null;
    }
}
