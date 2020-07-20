package com.zb.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Qr Code  二维码
 */
public class QrCodeUtil {
    //创建二维码图片输出流
    private static final QRCodeWriter QR_CODE_WRITER = new QRCodeWriter();
    //保存二维码图片到文件系统
    /*
        text - 二维码码内容
        format - 生成图片的格式
        width height 生成二维码的宽高
        path  -  生成的二维码存储路径
     */
    public static void generateQrCodeAndSave
        (String text,String format,int width,int height,String path){
        try {
            //解决二维码中存储中文乱码问题
            HashMap map = new HashMap();
            map.put(EncodeHintType.CHARACTER_SET,"UTF-8");
            //二维码信息对象
            BitMatrix bitMatrix = QR_CODE_WRITER.encode(text,BarcodeFormat.QR_CODE,width,height,map);
            //将二维码信息转变成图片
            MatrixToImageWriter.writeToPath(bitMatrix,format, Paths.get(path));
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
