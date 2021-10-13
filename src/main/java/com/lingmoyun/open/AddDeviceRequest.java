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
public class AddDeviceRequest extends OpenRequest<AddDeviceResponse> {

    private String brandCode;
    private String deviceModel;
    private String deviceSn;
    private String deviceKey;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/addDevice";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("brandCode", brandCode);
        json.put("deviceModel", deviceModel);
        json.put("deviceSn", deviceSn);
        json.put("deviceKey", deviceKey);
        return json.toJSONString();
    }

    @Override
    public AddDeviceResponse request(OpenClient client) throws OpenException {
        return super.request(client, AddDeviceResponse.class);
    }

    public final AddDeviceResponse request(OpenClient client, String brandCode, String deviceModel, String deviceSn, String deviceKey) throws OpenException {
        setBrandCode(brandCode);
        setDeviceModel(deviceModel);
        setDeviceSn(deviceSn);
        setDeviceKey(deviceKey);
        return request(client);
    }

}
