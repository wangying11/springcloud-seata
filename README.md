# seata-demo
基于spring cloud+spring jpa+spring cloud alibaba seata+mysql的分布式示例


### 准备工作
1. 执行数据库脚本
2. 启动fescar server
   使用默认配置
2. 启动启动business、storage、account、order
   数据库默认连接127.0.0.1:3306，不同的注意修改
3. 事务成功
   GET 127.0.0.1:8084/purchase?userId=1001&commodityCode=2001&orderCount=1
4. 事务回滚 GET 127.0.0.1:8084/purchase?userId=1001&commodityCode=2001&orderCount=2

