
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>日总结编写</title>
    <!--引入插件-->
    <script type="text/javascript" src="ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="ueditor/ueditor.all.js"></script>
    <link rel="stylesheet" href="ueditor/themes/default/css/ueditor.css">
</head>
<body>
    <!--富文本编辑器存放到form中，进行提交-->
    <form action="${pageContext.request.contextPath}/doueditor" method="post" style="width: 800px">
        <!--此标签为多行文本输入控件 此文本去可容纳无限数量的文本-->
        <textarea name="content" id="myEditor">
            这是默认的初始化内容
        </textarea>

        <script>
            UE.getEditor("myEditor");//初始化编辑器 id保持一致
        </script>

        <input type="submit" value="提交">
    </form>
</body>
</html>
