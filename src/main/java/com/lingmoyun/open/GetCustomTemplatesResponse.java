package com.lingmoyun.open;

import lombok.Data;

import java.util.List;

/**
 * 添加设备请求
 *
 * @author guoweifeng
 */
public class GetCustomTemplatesResponse extends OpenResponse<List<GetCustomTemplatesResponse.Template>> {

    @Data
    public static class Template {
        private Long templateId;
        private String templateName;
        private int templateWidth;
        private int templateHeight;
        private String templatePic;
    }

}
