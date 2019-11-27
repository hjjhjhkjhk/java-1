<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head><title>界面</title></head>


<body>
<h2> <% out.println("请求头");%></h2><br/><br/>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494"><th>参数名</th><th>参数值</th></tr>
    <%  Enumeration<String> em = request.getHeaderNames();  //得到请求头的name集合
        while (em.hasMoreElements()) {
            String name = em.nextElement();
            out.print("<tr><td>" + name + "</td>\n");
            String value = request.getHeader(name); //通过请求头的name等到请求头的值
            out.println("<td> " + value + "</td></tr>\n"); }%></table>

<%   Enumeration paramNames = request.getParameterNames();//得到表单参数的name集合
    while(paramNames.hasMoreElements()) {
        String paramName = (String)paramNames.nextElement();
        String paramValue = request.getParameter(paramName);
        out.println(paramName+"="+paramValue+"<br/>"); }
    Calendar calendar = new GregorianCalendar(); // 获取当前时间
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    out.println("当前时间: " + hour + ":" + minute + ":" + minute);
    int a=1;
    if (a == 1) { out.println("<p>今天是周末</p>");
    } else {out.println("<p>今天是周末</p>");}
    out.println("<input type=\"button\" value=\"返回首页\" onclick='window.open(\"index.jsp\")' />");
%>
</body>
</html>
