package com.lingmoyun.open;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
public class PrintTestPageRequest extends OpenRequest<PrintTestPageResponse> {

    private String deviceOpenid;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/print";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        return json.toJSONString();
    }

    @Override
    public PrintTestPageResponse request(OpenClient client) throws OpenException {
        return super.request(client, PrintTestPageResponse.class);
    }

    public final PrintTestPageResponse request(OpenClient client, String deviceOpenid) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        return request(client);
    }

}
