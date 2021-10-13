package com.lingmoyun.open;

import lombok.Data;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 */
public class AddDeviceResponse extends OpenResponse<AddDeviceResponse.Device> {

    @Data
    public static class Device {
        private String deviceOpenid;
    }

}
