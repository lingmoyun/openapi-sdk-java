package com.lingmoyun.open;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.io.IOException;

/**
 * OpenRequest
 *
 * @author guoweifeng
 * @date 2021/8/24 16:41
 */
public abstract class OpenRequest<Res extends OpenResponse<?>> {

    protected abstract String getUrl();

    protected abstract String getData();

    public abstract Res request(OpenClient client) throws OpenException;

    protected final Res request(OpenClient client, Class<Res> tClass) throws OpenException {
        String res = null;
        try {
            res = client.post(getUrl(), getData());
        } catch (IOException e) {
            throw new OpenException(500, e.getMessage(), e);
        }
        System.out.println(res);
        if (res == null) {
            throw new OpenException(500, "http error.");
        }
        OpenWrapperResponse openWrapperResponse = JSON.parseObject(res, new TypeReference<OpenWrapperResponse>() {
        });
        openWrapperResponse.setOriginJson(res);
        if (!openWrapperResponse.isSuccess()) {
            throw new OpenException(openWrapperResponse.getCode(), openWrapperResponse.getMsg());
        }
        Res r = JSON.parseObject(openWrapperResponse.getData(), tClass);
        /*if (r == null) {
            throw new OpenException(500, "Data analysis error.");
        }*/
        if (!r.isSuccess()) {
            throw new OpenException(r.getCode(), r.getMsg());
        }
        r.setWrapperResponse(openWrapperResponse);
        return r;
    }

}
