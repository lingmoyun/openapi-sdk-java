package com.lingmoyun.open;

import lombok.Data;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 */
public class QueryPrintResultResponse extends OpenResponse<QueryPrintResultResponse.PrintResult> {

    @Data
    public static class PrintResult {
        private String brand;
        private String model;
        private String serial;
        private String taskId;
        private String errCode;
        private String errMsg;
    }

}
