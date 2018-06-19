# UDP以接收数据为中心   非面向连接 不安全，数据可能丢失，但是效率高

** 一、类DatagramSocket DatagramPacket **
1. 客户端
  * 创建客户端 DatagramSocket 类+指定端口
  * 准备数据，字节数组
  * 打包DatagramPacket +服务器地址以及端口
  * 发送
  * 释放资源
 2. 服务器端
  * 创建服务器端 DatagramSocket类+指定端口
  * 准备接收容器 字节数组，封装DatagramPacket
  * 包：接收数据
  * 分析
  * 释放资源
