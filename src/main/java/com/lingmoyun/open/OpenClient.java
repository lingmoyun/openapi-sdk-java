package com.lingmoyun.open;

import com.alibaba.fastjson.JSONObject;
import com.lingmoyun.open.util.Base64Utils;
import com.lingmoyun.open.util.DigestUtils;
import com.lingmoyun.open.util.HttpUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 开放平台客户端
 *
 * @author guoweifeng
 */
public class OpenClient {

    private String domain = "https://openapi.lingmoyun.com";
    private final String appKey;
    public final String appSecret;

    public OpenClient(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }


    /**
     * 计算签名
     */
    private String getSign(String appSecret, String data) {
        String md5 = DigestUtils.md5DigestAsHex((data + appSecret).getBytes(StandardCharsets.UTF_8));
        return Base64Utils.encodeToString(md5.getBytes(StandardCharsets.UTF_8));
    }

    private String buildSignData(String data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appKey", appKey);
        jsonObject.put("data", data);
        jsonObject.put("sign", getSign(appSecret, data));
        return jsonObject.toJSONString();
    }

    String post(String url, String data) throws IOException {
        return HttpUtils.post(domain + url, buildSignData(data));
    }

}
