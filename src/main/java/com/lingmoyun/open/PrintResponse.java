package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public class PrintResponse extends OpenResponse<PrintResponse.PrintTask> {

    @Data
    public static class PrintTask {
        private String batchTaskId;
        private List<String> taskIds;
    }

}
