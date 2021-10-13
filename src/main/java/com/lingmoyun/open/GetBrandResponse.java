package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class GetBrandResponse extends OpenResponse<List<GetBrandResponse.Brand>> {

    @Data
    public static class Brand {
        private String brandCode;
        private String brandName;
    }

}
