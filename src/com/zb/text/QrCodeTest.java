package com.zb.text;

import com.zb.utils.QrCodeUtil;

//测试二维码生成
public class QrCodeTest {
    //定义一个图片存储的地址
    private static final String QR_CODE_IMAGE_PATH = "C:/Users/57437/Desktop/MyQrCode.png";
    public static void main(String[] args) {

       QrCodeUtil.generateQrCodeAndSave
                ("女神，我暗恋你很久了，这是我微信：574373426","png",350,350,QR_CODE_IMAGE_PATH);
       QrCodeUtil.generateQrCodeAndSave
                ("","png",350,350,QR_CODE_IMAGE_PATH);
    }
}
