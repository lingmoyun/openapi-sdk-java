package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class GetModelResponse extends OpenResponse<List<GetModelResponse.Model>> {

    @Data
    public static class Model {
        private String modelCode;
        private String modelName;
    }

}
