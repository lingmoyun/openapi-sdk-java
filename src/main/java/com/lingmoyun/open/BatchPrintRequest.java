package com.lingmoyun.open;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

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
public class BatchPrintRequest extends OpenRequest<BatchPrintResponse> {

    private String deviceOpenid;
    private List<String> cpclBase64s;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/batchPrint";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        json.put("cpclBase64s", cpclBase64s);
        return json.toJSONString();
    }

    @Override
    public BatchPrintResponse request(OpenClient client) throws OpenException {
        return super.request(client, BatchPrintResponse.class);
    }

    public final BatchPrintResponse request(OpenClient client, String deviceOpenid, List<String> cpclBase64s) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        setCpclBase64s(cpclBase64s);
        return request(client);
    }

}
