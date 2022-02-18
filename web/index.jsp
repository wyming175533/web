<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>bmi计算</title>
    <script type="text/javascript">
      function ajaxdo(){
        var xmlHttp=new XMLHttpRequest();
        xmlHttp.onreadystatechange=function (){

          if(xmlHttp.readyState==4 && xmlHttp.status==200){
            var data=xmlHttp.responseText;
            alert(data);
          }

        }
        var name=document.getElementById("name").value;
        var h=document.getElementById("h").value;
        var g=document.getElementById("g").value;
        var param="bmi?name="+name+"&h="+h+"&g="+g;


        xmlHttp.open("get",param,true);
        xmlHttp.send();
      }

    </script>
  </head>
  <body>
  <div>
  <p><center><h2>计算BMI值</h2></center></p>
  姓名：<input type="text" id="name"/>
  身高:<input type="text" id="h"/>
  体重:<input type="text" id="g">
  <input type="button" id="btn" value="提交" onclick="ajaxdo()">
    <div id="mydata"></div>
  </div >
  </body>
</html>
