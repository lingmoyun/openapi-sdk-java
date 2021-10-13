package com.lingmoyun.open;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * OpenRequest
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PrintTemplateRequest extends OpenRequest<PrintTemplateResponse> {

    private String deviceOpenid;
    private Long templateId;
    private Map<String, Object> dynamicData;

    public PrintTemplateRequest addDynamicData(String key, Object value) {
        if (dynamicData == null) dynamicData = new LinkedHashMap<>();
        dynamicData.put(key, value);
        return this;
    }

    protected String getUrl() {
        return "/platform/api/open/v2/prod/printTemplate";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        json.put("templateId", templateId);
        json.put("dynamicData", dynamicData);
        return json.toJSONString();
    }

    @Override
    public PrintTemplateResponse request(OpenClient client) throws OpenException {
        return super.request(client, PrintTemplateResponse.class);
    }

    public final PrintTemplateResponse request(OpenClient client, String deviceOpenid, Long templateId, Map<String, Object> dynamicData) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        setTemplateId(templateId);
        setDynamicData(dynamicData);
        return request(client);
    }

}
