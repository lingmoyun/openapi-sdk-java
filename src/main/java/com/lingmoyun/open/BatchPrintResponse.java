package com.lingmoyun.open;

import lombok.Data;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class BatchPrintResponse extends OpenResponse<BatchPrintResponse.Device> {

    @Data
    public static class Device {
        private String deviceOpenid;
    }

}
