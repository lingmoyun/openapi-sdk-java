package com.lingmoyun.open;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OpenRequest
 *
 * @author guoweifeng
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
