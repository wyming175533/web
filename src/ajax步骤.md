四步骤

- 创建异步对象：

  ```
  var xmlHttp=new XMLHttpRequest();
  ```

-  给异步对象绑定事件，当异步对象发起请求，获取数据都会除法这个事件:

  ```
  xmlHttp.oonreadystatechange=function(){
  	if(xmlHttp.readyStae=4 && xmlHttp.status==200)//异步对象接受完数据并且请求成功
  	{
  	var data =xmlHttp.responseText;
  	document.getElementByld("name").value=data;//更新操作
  	}
  
  }
  ```

- 初始化异步请求对象

  ```
    xmlHttp.open("get", "loginServlet?name=zs&pwd=123",true);
  ```

- 使用异步对象发送请求

  ```
  xmlHttp.responseText;
  ```

  

