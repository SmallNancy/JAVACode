# 网络编程
  在同一个协议下，端口号不能重复，不同协议可以重复<br>
### 资源定位：URL:统一资源定位
### 数据的传输
1. TCP、UDP协议结合使用
  TCP：面向连接，安全，效率低<br>
  UDP:非面向连接，效率高<br>
  
![avatar](https://github.com/SmallNancy/trueChain/blob/master/picture/net7.png) 
2. 传输 先封装，后拆分
### 类
  1. InetAddress  InetSocketAddress
  2. URL 
  3. TCP:ServerSocket Socket
  4. UDP :DatagramPacket
## 获取资源网络流
1. InputStream 可能有乱码
2.输入缓冲流和输出缓冲流BufferedReader BufferedWriter 无乱码
  
