package jc.sky.modules.methodProxy;

import java.util.concurrent.ConcurrentHashMap;

import jc.sky.core.SKYIBiz;

/**
 * @创建人 sky
 * @创建时间 16/4/8 下午9:37
 * @类描述 代理类
 */
public class SKYProxy {

    public Object impl;                                // 实现类

    public Object proxy;                                // 代理类

    public ConcurrentHashMap<String, SKYMethod> methodCache = new ConcurrentHashMap();    // 方法缓存


    /**
     * 清空
     */
    public void clearProxy() {
        if(impl instanceof SKYIBiz){
            ((SKYIBiz)impl).detach();
        }
        impl = null;
        proxy = null;
        methodCache.clear();
        methodCache = null;
    }
}
