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
public class QueryPrintResultRequest extends OpenRequest<QueryPrintResultResponse> {

    private String deviceOpenid;
    private String taskId;

    protected String getUrl() {
        return "/platform/api/open/v2/prod/queryPrintResult";
    }

    protected String getData() {
        JSONObject json = new JSONObject();
        json.put("deviceOpenid", deviceOpenid);
        json.put("taskId", taskId);
        return json.toJSONString();
    }

    @Override
    public QueryPrintResultResponse request(OpenClient client) throws OpenException {
        return super.request(client, QueryPrintResultResponse.class);
    }

    public final QueryPrintResultResponse request(OpenClient client, String deviceOpenid, String taskId) throws OpenException {
        setDeviceOpenid(deviceOpenid);
        setTaskId(taskId);
        return request(client);
    }

}
