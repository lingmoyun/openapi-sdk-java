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
public class DeleteDeviceRequest extends OpenRequest<DeleteDeviceResponse> {

    private String deviceOpenid;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/deleteDevice";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        return json.toJSONString();
    }

    @Override
    public DeleteDeviceResponse request(OpenClient client) throws OpenException {
        return super.request(client, DeleteDeviceResponse.class);
    }

    public final DeleteDeviceResponse request(OpenClient client, String deviceOpenid) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        return request(client);
    }

}
