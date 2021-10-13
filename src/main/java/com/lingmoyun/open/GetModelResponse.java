package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 */
public class GetModelResponse extends OpenResponse<List<GetModelResponse.Model>> {

    @Data
    public static class Model {
        private String modelCode;
        private String modelName;
    }

}
