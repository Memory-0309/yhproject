package com.zb.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102600767144";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCYCwXPZRKBvvn0Jy3FUtp0YR3pfhZt57BIGPOvNCssxcpo/Z/4LNGAiyvN4pey8f22+HSOEHkhzOJMGsqeI565PHUD7zGKzOKVMGDeeTqoCkshgTuVEJyDOnbH9qIY3KIgfPnE8vU9qW6o3opS7zKiFP6TMss1PrGA/feWKxelBU1hFJ3lZvtnHFEAV/S+y5x5zplkHFOzl+C9XdKKqhBjG/bnw0asqzKJLIaJGjTrZVOjsx5hZ6yTmLBDBdsq0r41++2uN/LNniNW5rG7XuTzzENLyWcIhKP4YEsezxT6kp1kjQQs+gMzubdyGvjpuAxTBkJbnpQSnOnZiw0J7chVAgMBAAECggEBAIkShu5vJLwsPJRNLgqTo7cAR0NWFUqIcnjNZgQyeCopN05oOWw4m7fTwG4hNrpxSFdIr2vUliBO4kXScZEYc+R0CNq/Ll8AT9ZIg0yO5r7QaOOP6vN8wl3cu3GTfJgFcXTwtw1ELKymr8k2uGYEmBVf8BMs297o4oZ0cF3GA88VEMkQ+D/H3ZcK81PthDXfT2PMEjiLWzfImMQVNpMhgXHztK92ASnR48lzUyB2qWrCfUoCI2Ge3sK87ifuXzbpTGh3di7Ea9kurbLwpkuqQbKYeGjECEaw3YIYpUO23R8CrQou9tTAmWlO/1eScbt8SXzP1FtImSxiGkJhpz0iZxECgYEAywRSFHG5wI3j2rxAg7kROppvjqKxRIAqvPXRRyMAJedI6PQ/jJ0OfElPCrxrNbI51PVwT6H9all75idkoI3GQJMGE07c6Qk31hVyxQivFfrn8iKMKIt4ZAuSxBCutQmyYe4ACDosG8PYQuMXngif4Q0Mb1GBO589C53oacE054sCgYEAv7kcTqBWva/ZN2kONA28t3DaJ46zOk603xe/3kOhtzzNkP8Y9qtNjZfcHKbgWSYobVAIjR2DmGiLUwnYfBXc3g9eMWrwXsmSGkt1yoCHF2nHPU+65CVqg3gr5iZ1gJW7UQT6nggW7bhS1WUDALJGIJev4ljLXd8BNe1Q08g9C58CgYBdoFB6PTh9JPLAHbFjDiZz8GUiUsWN4c3T90nclLesw01Modfs8UGM8AIT4XFQAjHJlKeHEh3cvgf1zJULtlaH0UYsAWK/1hB6GsojNC4K5PuzH1ukFy4edXfqFAd+Vkp9/1Tkdm+BHoDN2A08RJ33HB1v+RaweG+eu+RDYWcUoQKBgHLcVMAqQS1NT8Zpkw/OdxQzcQ8n5+pzwtqxIMrpG9ZqgAFxQyRsxn6gz0b/FwNx3+B1hVn9p5xEbcvm5yKX+oWzEUxr8+vluTk1ojEaxVRak/oAbUhHvkNbWHl+6wCJM/q7D+ZjlFEBD+c2qBDfvTHDjqT9a4EmnFQRhE4M9b2jAoGATl4soXp7YA0rR1Mo3oF2vnZXXFodXijG1hUE2xUFeJyejVvdt+XxEXAXAcJMfaXxqEPrnAxqxQMhKtuzHECxeVwr+t9F9DYLFSudQ9jqhKylHyRPok/l8w9XSqh5cfyK0RvfS8MdU/Pj50qStm6ykf3zVfjjMSWGvby9mceOT/4=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmAsFz2USgb759CctxVLadGEd6X4WbeewSBjzrzQrLMXKaP2f+CzRgIsrzeKXsvH9tvh0jhB5IcziTBrKniOeuTx1A+8xiszilTBg3nk6qApLIYE7lRCcgzp2x/aiGNyiIHz5xPL1PaluqN6KUu8yohT+kzLLNT6xgP33lisXpQVNYRSd5Wb7ZxxRAFf0vsucec6ZZBxTs5fgvV3SiqoQYxv258NGrKsyiSyGiRo062VTo7MeYWesk5iwQwXbKtK+NfvtrjfyzZ4jVuaxu17k88xDS8lnCISj+GBLHs8U+pKdZI0ELPoDM7m3chr46bgMUwZCW56UEpzp2YsNCe3IVQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "localhost:8080/yongheproject/paysuccess";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "localhost:8080/yongheproject/success.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

