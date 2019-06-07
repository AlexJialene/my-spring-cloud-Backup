package com.keizyi.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class DefaultFilter extends ZuulFilter {

    /*
    pre：路由之前
    routing：路由之时
    post： 路由之后
    error：发送错误调用
     */

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {

        //TODO

        return null;
    }
}
