package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 设备型号响应体
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class GetBrandModelResponse extends OpenResponse<List<GetBrandModelResponse.Brand>> {

    @Data
    public static class Brand {
        private String brandCode;
        private String brandName;
        private List<Model> modelList;
    }

    @Data
    public static class Model {
        private String modelCode;
        private String modelName;
    }

}
