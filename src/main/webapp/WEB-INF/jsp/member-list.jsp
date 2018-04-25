<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="../../static/css/x-admin.css" media="all">
<!-- <link rel="stylesheet" href="../../static/css/bootstrap.min.css" media="all"> -->
</head>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>会员管理</cite></a>
			<a><cite>会员列表</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height:1.6em;margin-top:3px;float:right"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="layui-icon" style="line-height:30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<form class="layui-form x-center" action="" style="width:800px">
			<div class="layui-form-pane" style="margin-top: 15px;">
				<div class="layui-form-item">
					<label class="layui-form-label">日期范围</label>
					<div class="layui-input-inline">
						<input class="layui-input" placeholder="开始日" id="LAY_demorange_s">
					</div>
					<div class="layui-input-inline">
						<input class="layui-input" placeholder="截止日" id="LAY_demorange_e">
					</div>
					<div class="layui-input-inline">
						<input type="text" name="username" placeholder="请输入用户名"
							autocomplete="off" class="layui-input">
					</div>
					<div class="layui-input-inline" style="width:80px">
						<button class="layui-btn" lay-submit="" lay-filter="sreach">
							<i class="layui-icon">&#xe615;</i>
						</button>
					</div>
				</div>
			</div>
		</form>
		<xblock>
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon">&#xe640;</i>批量删除
		</button>
		<span class="x-right" style="line-height:40px">共有数据：88 条</span></xblock>
		<table class="layui-table">
			<thead>
				<tr>
					<th><input type="checkbox" name="" value=""></th>
					<th>ID</th>
					<th>用户名</th>
					<th>性别</th>
					<th>手机</th>
					<th>邮箱</th>
					<th>地址</th>
					<th>加入时间</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${page.currentDate }" var="user">
				<tr>
					<td><input type="checkbox" value="1" name=""></td>
					<td>${user.uid}</td>
					<td><u style="cursor:pointer"
						onclick="member_show('张三','member-show.html','10001','360','400')">
							${user.uname} </u></td>
					<td>男</td>
					<td>${user.uphone}</td>
					<td>${user.uemail}</td>
					<td>${user.dizhi}</td>
					<td>${user.time}</td>
					<td class="td-status"><span
						class="layui-btn layui-btn-normal layui-btn-mini"> 已启用 </span></td>
					<td class="td-manage"><a style="text-decoration:none"
						onclick="member_stop(this,'10001')" href="javascript:;" title="停用">
							<i class="layui-icon">&#xe601;</i>
					</a> <a title="编辑" href="javascript:;"
						onclick="member_edit('编辑','member-edit.html','4','','510')"
						class="ml-5" style="text-decoration:none"> <i
							class="layui-icon">&#xe642;</i>
					</a> <a style="text-decoration:none"
						onclick="member_password('修改密码','member-password.html','10001','600','400')"
						href="javascript:;" title="修改密码"> <i class="layui-icon">&#xe631;</i>
					</a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')"
						style="text-decoration:none"> <i class="layui-icon">&#xe640;</i>
					</a></td>
				</tr>
				</c:forEach>
			</tbody>
			
		</table>
			<a href="ShowUser.do?pno=1">首页</a>
	<c:if test="${pno>1}">
	 		<a href="ShowUser.do?pno=${pno-1 }">上一页</a>	 
	 </c:if>
	 <c:if test="${page.currentpage==1}">
	 		<a href="ShowUser.do?pno=1">上一页</a>	 
	 </c:if>
	 <c:forEach  begin="1"  end="${page.pagenum }" var="x">
			 <a href="ShowUser.do?pno=${x }">${x }</a>
	 </c:forEach>
	 <c:if test="${page.currentpage<page.pagenum }">
			 <a href="ShowUser.do?pno=${ page.currentpage+1}">下一页</a>
	 </c:if>
	  <c:if test="${page.currentpage==page.pagenum }">
	 		<a href="ShowUser.do?pno=${ page.pagenum}">下一页</a>
	 </c:if>
	 		共<span>${page.pagenum}</span>页
		
	</div>
	<script src="../../static/lib/layui/layui.js" charset="utf-8"></script>
	<script src="../../static/js/x-layui.js" charset="utf-8"></script>
	<!-- <script src="../../static/js/bootstrap.min.js" ></script> -->
	<script>
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              /* laypage = layui.laypage;//分页 */
              layer = layui.layer;//弹出层

              //以上模块根据需要引入

      /*         laypage({
                cont: 'page'
                ,pages: 100
                ,first: 1
                ,last: 100
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
              });  */
              
              var start = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                  end.min = datas; //开始日选好后，重置结束日的最小日期
                  end.start = datas //将结束日的初始值设定为开始日
                }
              };
              
              var end = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                  start.max = datas; //结束日选好后，重置开始日的最大日期
                }
              };
              
              document.getElementById('LAY_demorange_s').onclick = function(){
                start.elem = this;
                laydate(start);
              }
              document.getElementById('LAY_demorange_e').onclick = function(){
                end.elem = this
                laydate(end);
              }
              
            });

            //批量删除提交
             function delAll () {
                layer.confirm('确认要删除吗？',function(index){
                    //捉到所有被选中的，发异步进行删除
                    layer.msg('删除成功', {icon: 1});
                });
             }
             /*用户-添加*/
            function member_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }
            /*用户-查看*/
            function member_show(title,url,id,w,h){
                x_admin_show(title,url,w,h);
            }

             /*用户-停用*/
            function member_stop(obj,id){
                layer.confirm('确认要停用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="layui-icon">&#xe62f;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-disabled layui-btn-mini">已停用</span>');
                    $(obj).remove();
                    layer.msg('已停用!',{icon: 5,time:1000});
                });
            }

            /*用户-启用*/
            function member_start(obj,id){
                layer.confirm('确认要启用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            // 用户-编辑
            function member_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
            /*密码-修改*/
            function member_password(title,url,id,w,h){
                x_admin_show(title,url,w,h);  
            }
            /*用户-删除*/
            function member_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            }
            </script>

</body>
</html>