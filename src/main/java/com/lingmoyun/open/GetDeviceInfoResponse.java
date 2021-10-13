package com.lingmoyun.open;

import lombok.Data;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class GetDeviceInfoResponse extends OpenResponse<GetDeviceInfoResponse.DeviceInfo> {

    @Data
    public static class DeviceInfo {
        private boolean online;
        private String brand;
        private String model;
        private String serial;
        private String btName;
        private String btMAC;
        private String hardVer;
        private String softVer;
        private int widthMin;
        private int widthMax;
        private String status;
        private String statusCode;
    }

}
