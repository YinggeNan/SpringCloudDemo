package com.cdb;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.teaopenapi.models.Config;

import java.util.Arrays;
import java.util.List;

/**
 * @Author yingge
 * @Date 12/11/2021 9:27 PM
 */
public class SMSExample {
    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }
    public static void main(String[] args_) throws Exception {
        List<String> args = Arrays.asList(args_);
        Client client = SMSExample.createClient("LTAI5tMmTUiMexUUqLLovf57", "E7uXnYW7eHMg8F2xvlwNBgg8WcCDLz");
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setSignName("阿里云短信测试")
                .setTemplateCode("SMS_154950909")
                .setPhoneNumbers("13456722383");
        // 复制代码运行请自行打印 API 的返回值
        client.sendSms(sendSmsRequest);
    }
}
