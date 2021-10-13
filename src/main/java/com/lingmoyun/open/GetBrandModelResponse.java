package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 设备型号响应体
 *
 * @author guoweifeng
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
