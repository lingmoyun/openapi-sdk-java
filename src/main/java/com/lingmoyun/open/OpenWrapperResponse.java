package com.lingmoyun.open;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OpenWrapperResponse
 *
 * @author guoweifeng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenWrapperResponse {

    private String originJson;

    private String msg;

    private Integer code;

    private String data;

    public boolean isSuccess() {
        return OpenWrapperResponse.isSuccess(code);
    }

    @Override
    public String toString() {
        String[] excludeProperties = {"originJson"};
        PropertyPreFilters filters = new PropertyPreFilters();
        PropertyPreFilters.MySimplePropertyPreFilter excludeFilter = filters.addFilter();
        excludeFilter.addExcludes(excludeProperties);
        return JSON.toJSONString(this, excludeFilter);
    }

    static boolean isSuccess(Integer code) {
        return code != null && code.equals(200);
    }

}
