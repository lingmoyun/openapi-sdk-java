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
public class GetBrandModelRequest extends OpenRequest<GetBrandModelResponse> {

    protected String getUrl() {
        return "/platform/api/open/v2/prod/getBrandModelList";
    }

    protected String getData() {
        return null;
    }

    @Override
    public GetBrandModelResponse request(OpenClient client) throws OpenException {
        return super.request(client, GetBrandModelResponse.class);
    }
}
