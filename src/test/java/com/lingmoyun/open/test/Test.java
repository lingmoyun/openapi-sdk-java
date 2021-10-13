package com.lingmoyun.open.test;

import com.lingmoyun.open.*;

import java.util.Arrays;
import java.util.List;

/**
 * Test
 *
 * @author guoweifeng
 * @date 2021/8/24 14:48
 */
public class Test {
    private static String deviceOpenid = "fef74f6d94614571890c7d9d54c1f2c2";
    private static String cpclBase64 = "ISAwIDIwMyAyMDMgMTA0MCAxClBXIDYwOApUQVNLSUQgV2luZm9yZDAwMQpURVhUIDIyMiAwIDAgMiDE47rDMTIzYWJjClRFWFQgMjIyIDIgMCA0NyDE47rDMTIzYWJjClRFWFQgMjIyIDMgMCA4NyDE47rDMTIzYWJjClRFWFQgMjIyIDQgMCAxMzkgxOO6wzEyM2FiYwpURVhUIDIyMiA1IDAgMjE1IMTjusMxMjNhYmMKVEVYVCAyMjIgNiAwIDI5NSDE47rDMTIzYWJjCkxJTkUgMzAwIDEwMCAzMDAgMzAwIDEKTElORSAzMDAgMTAwIDUwMCAxMDAgMgpMSU5FIDMwMCAxMDAgNTAwIDMwMCAzCgpCQVJDT0RFIDEyOCAxIDEgMTAwIDEwMCA0MDAgQTQzMDA5MjAwMDA1ClRFWFQgMCAwIDE2MCA1MTAgQTQzMDA5MjAwMDA1CkJBUkNPREUgUVIgMTAwIDU4MCBNIDIgVSA2Ck1BLGh0dHBzOi8vd3d3Lmdvb2dsZS5jb20KRU5EUVIKQkFSQ09ERSBRUiAzMDAgNTgwIE0gMiBVIDYKUUEsaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbQpFTkRRUgpGT1JNClBSSU5UCg==";


    public static void main(String[] args) throws OpenException {
        String domain = "https://openapi.lingmoyun.cn";
        //String appKey = "a2jqc8qXdGaNOhfT";
        //String appSecret = "ca73e81887424d1394603c631918b591";
        String appKey = "8UWO7pjYKdZpjZZZ";
        String appSecret = "4833af62990e4b80ae1cfe94d6059896";
        OpenClient client = new OpenClient(appKey, appSecret);
        client.setDomain(domain);

        // 获取品牌型号列表
        testGetBrandModel(client);

        // 获取品牌列表
        //testGetBrand(client);

        // 获取型号列表
        //testGetModel(client);

        // 添加设备
        //testAddDevice(client);

        // 获取设备信息
        //testGetDeviceInfo(client);

        // 获取自定义模板
        //testGetCustomTemplates(client);

        // 获取公共模板
        //testGetPublicTemplates(client);

        // 打印模板
        //testPrintTemplate(client);

        // 打印指令
        //testPrint(client);

        // 批量打印指令
        //testBatchPrint(client);

        // 获取打印结果
        //testQueryPrintResult(client);

    }

    // 获取品牌列表
    public static void testGetBrandModel(OpenClient client) throws OpenException {
        GetBrandModelRequest getBrandModelRequest = new GetBrandModelRequest();
        GetBrandModelResponse getBrandModelResponse = getBrandModelRequest.request(client);
        //System.out.println(getBrandModelResponse);
    }

    // 获取品牌列表
    public static void testGetBrand(OpenClient client) throws OpenException {
        GetBrandRequest getBrandRequest = new GetBrandRequest();
        GetBrandResponse getBrandResponse = getBrandRequest.request(client);
        //System.out.println(getBrandResponse);
    }

    // 获取品牌列表
    public static void testGetModel(OpenClient client) throws OpenException {
        GetModelRequest getBrandRequest = new GetModelRequest();
        getBrandRequest.setBrandCode("PrintMan");
        GetModelResponse getBrandResponse = getBrandRequest.request(client);
        //System.out.println(getBrandResponse);
    }

    // 添加设备
    public static void testAddDevice(OpenClient client) throws OpenException {
        AddDeviceRequest addDeviceRequest = new AddDeviceRequest();
        addDeviceRequest.setBrandCode("PrintMan");
        addDeviceRequest.setDeviceModel("DLK-200Y");
        //addDeviceRequest.setDeviceSn("W31607210037");
        //addDeviceRequest.setDeviceKey("960903");
        addDeviceRequest.setDeviceSn("W31308210005");
        addDeviceRequest.setDeviceKey("178880");
        AddDeviceResponse addDeviceResponse = addDeviceRequest.request(client);
        deviceOpenid = addDeviceResponse.getData().getDeviceOpenid();
        //AddDeviceResponse addDeviceResponse = addDeviceRequest.request(client, "PrintMan", "DLK-200Y", "W31607210037", "2083200");
        //System.out.println(addDeviceResponse);
    }

    // 获取设备信息
    public static void testGetDeviceInfo(OpenClient client) throws OpenException {
        GetDeviceInfoRequest request = new GetDeviceInfoRequest();
        request.setDeviceOpenid(deviceOpenid);
        GetDeviceInfoResponse response = request.request(client);
        //System.out.println(response);
    }

    // 获取自定义模板
    public static void testGetCustomTemplates(OpenClient client) throws OpenException {
        GetCustomTemplatesRequest request = new GetCustomTemplatesRequest();
        GetCustomTemplatesResponse response = request.request(client);
        //System.out.println(response);
    }

    // 获取公共模板
    public static void testGetPublicTemplates(OpenClient client) throws OpenException {
        GetPublicTemplatesRequest request = new GetPublicTemplatesRequest();
        GetPublicTemplatesResponse response = request.request(client);
        //System.out.println(response);
    }

    // 打印模板
    public static void testPrintTemplate(OpenClient client) throws OpenException {
        PrintTemplateRequest request = new PrintTemplateRequest();
        request.setDeviceOpenid(deviceOpenid);
        request.setTemplateId(91L);
        PrintTemplateResponse response = request.request(client);
        //System.out.println(response);
    }

    // 打印指令
    public static void testPrint(OpenClient client) throws OpenException {
        PrintRequest request = new PrintRequest();
        request.setDeviceOpenid(deviceOpenid);
        request.setCpclBase64(cpclBase64);
        PrintResponse response = request.request(client);
        //System.out.println(response);
    }

    // 批量打印
    public static void testBatchPrint(OpenClient client) throws OpenException {
        BatchPrintRequest request = new BatchPrintRequest();
        request.setDeviceOpenid(deviceOpenid);
        request.setCpclBase64s(Arrays.asList(cpclBase64, cpclBase64));
        BatchPrintResponse response = request.request(client);
        //System.out.println(response);
    }

    // 打印测试页
    public static void testPrintTestPage(OpenClient client) throws OpenException {
        PrintTestPageRequest request = new PrintTestPageRequest();
        request.setDeviceOpenid(deviceOpenid);
        PrintTestPageResponse response = request.request(client);
        //System.out.println(response);
    }

    // 获取打印结果
    public static void testQueryPrintResult(OpenClient client) throws OpenException {
        QueryPrintResultRequest request = new QueryPrintResultRequest();
        request.setDeviceOpenid(deviceOpenid);
        //request.setTaskId("ST880484917316190209");
        request.setTaskId("ST884478156404424705");
        QueryPrintResultResponse response = request.request(client);
        //System.out.println(response);
    }

    // 删除设备
    public static void testDeleteDevice(OpenClient client) throws OpenException {
        DeleteDeviceRequest request = new DeleteDeviceRequest();
        DeleteDeviceResponse response = request.request(client);
        //System.out.println(response);
    }


}
