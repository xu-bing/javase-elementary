* API
// 服务器
ServerSocket　server = new ServerSocket(9999);
server.accept()

// 客户端
Socket socket = new Socket("127.0.0.1",9999);

//获得远端的Ip地址和端口号
InetSocketAddress add = (InetSocketAddress)socket.getRemoteSocketAddress();
String ip = add.getAddress().getHostAddress();//获得ip地址
int port = add.getPort();

发消息
PrintStream ps = new PrintStream(socket.getOutputStream());

收消息
ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

* 流程
介绍基本知识
群聊
私聊

* 问题
如何查看程序的运行流程（看程序运行到了哪一步停下来了？）
