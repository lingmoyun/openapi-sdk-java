package com.lingmoyun.open;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;
import lombok.Data;

/**
 * OpenWrapperResponse
 *
 * @author guoweifeng
 */
@Data
public class OpenResponse<T> {

    private OpenWrapperResponse wrapperResponse;

    private String msg;

    private Integer code;

    private T data;

    public boolean isSuccess() {
        return OpenWrapperResponse.isSuccess(code);
    }

    @Override
    public String toString() {
        String[] excludeProperties = {"wrapperResponse"};
        PropertyPreFilters filters = new PropertyPreFilters();
        PropertyPreFilters.MySimplePropertyPreFilter excludeFilter = filters.addFilter();
        excludeFilter.addExcludes(excludeProperties);
        return JSON.toJSONString(this, excludeFilter);
    }

}
