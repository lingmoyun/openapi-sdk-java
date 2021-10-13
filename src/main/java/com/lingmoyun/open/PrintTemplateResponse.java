package com.lingmoyun.open;

import lombok.Data;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 */
public class PrintTemplateResponse extends OpenResponse<PrintTemplateResponse.PrintTask> {

    @Data
    public static class PrintTask {
        private String deviceBrand;
        private String deviceModel;
        private String deviceSn;
        private String taskid;
    }

}
