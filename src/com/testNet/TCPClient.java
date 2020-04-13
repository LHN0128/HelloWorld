package com.testNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象，指定ip和端口号
        Socket socket = new Socket("127.0.0.1",8888);
//        获取这个套接字提供的流对象
        OutputStream os = socket.getOutputStream();
//        发送数据，注意必须是字节数组
        os.write("你好，服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        os.close();
        is.close();

    }
}
