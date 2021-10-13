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
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PrintRequest extends OpenRequest<PrintResponse> {

    private String deviceOpenid;
    private String cpclBase64;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/print";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        json.put("cpclBase64", cpclBase64);
        return json.toJSONString();
    }

    @Override
    public PrintResponse request(OpenClient client) throws OpenException {
        return super.request(client, PrintResponse.class);
    }

    public final PrintResponse request(OpenClient client, String deviceOpenid, String cpclBase64) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        setCpclBase64(cpclBase64);
        return request(client);
    }

}
