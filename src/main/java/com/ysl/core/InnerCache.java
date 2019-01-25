package com.ysl.core;

import java.util.Collection;
import java.util.Map;

/**
 *
 */
public interface InnerCache {

    Object getValue(Object key);

    Map getAllValues(Collection keys);

    void putValue(Object key,Object value);

    void putAllValues(Map map);

    void removeAllValues(Collection keys);
}
