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
public class GetModelRequest extends OpenRequest<GetModelResponse> {

    private String brandCode;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/getModelList";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("brandCode", brandCode);
        return json.toJSONString();
    }

    @Override
    public GetModelResponse request(OpenClient client) throws OpenException {
        return super.request(client, GetModelResponse.class);
    }

    public GetModelResponse request(OpenClient client, String brandCode) throws OpenException {
        setBrandCode(brandCode);
        return request(client);
    }

}
