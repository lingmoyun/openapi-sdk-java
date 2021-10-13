package com.lingmoyun.open;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
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
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GetBrandRequest extends OpenRequest<GetBrandResponse> {

    protected String getUrl() {
        return "/platform/api/open/v2/prod/getBrandList";
    }

    protected String getData() {
        return null;
    }

    @Override
    public GetBrandResponse request(OpenClient client) throws OpenException {
        return super.request(client, GetBrandResponse.class);
    }
}
