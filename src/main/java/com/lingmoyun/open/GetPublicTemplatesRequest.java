package com.lingmoyun.open;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OpenRequest
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GetPublicTemplatesRequest extends OpenRequest<GetPublicTemplatesResponse> {

    protected String getUrl() {
        return "/platform/api/open/v2/prod/getPublicTemplates";
    }

    protected String getData() {
        return null;
    }

    @Override
    public GetPublicTemplatesResponse request(OpenClient client) throws OpenException {
        return super.request(client, GetPublicTemplatesResponse.class);
    }

}
