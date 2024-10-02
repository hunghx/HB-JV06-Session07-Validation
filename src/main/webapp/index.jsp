<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Upload file</h1>
<%--Ảnh, âm thanh--%>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="image"><br>
    <input type="file" name="audio"><br>
    <button type="submit">Gửi</button>

</form>
</body>
</html>