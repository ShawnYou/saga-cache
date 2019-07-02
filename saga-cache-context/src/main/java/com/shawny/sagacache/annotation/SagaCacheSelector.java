package com.shawny.sagacache.annotation;

import com.shawny.sagacache.config.RedisConfiguration;
import com.shawny.sagacache.config.SagaCachingConfiguration;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.context.annotation.AutoProxyRegistrar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn_lin on 2019/5/9.
 */
public class SagaCacheSelector extends AdviceModeImportSelector<EnableSagaCache>{
    public SagaCacheSelector(){
    }

    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode){
            case PROXY:
                return getProxyImports();
            default:
                return null;
        }
    }

    private String[] getProxyImports(){
        List<String> result = new ArrayList<>();
        result.add(AutoProxyRegistrar.class.getName());
        result.add(SagaCachingConfiguration.class.getName());
        result.add(RedisConfiguration.class.getName());
        return result.toArray(new String[result.size()]);
    }
}
