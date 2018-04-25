<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<!-- <link rel="stylesheet" href="../../static/css/x-admin.css" media="all"> -->
<link rel="stylesheet" type="text/css"
	href="../../static/css/aui-production.min.css" />
<link id="layout-theme" rel="stylesheet" type="text/css"
	href="../../static/css/dark-blue.min.css" />
<link rel="stylesheet" type="text/css"
	href="../../static/css/common.min.css" />
<link rel="stylesheet" type="text/css"
	href="../../static/css/responsive.min.css" />
</head>

<body>
<div class="col-md-6">

        <div class="row">
            <div class="col-lg-6">

                <div class="dashboard-panel content-box remove-border bg-blue-alt">
                    <div class="content-box-wrapper">
                        <div class="header">
                            New registrations
                            <span>August - October 2013</span>
                        </div>
                        <div class="sparkline-big">700,579,180,311,405,342,579,405,311,311,450,302,370,510</div>
                    </div>
                    <div class="button-pane">
                        <div class="heading medium">
                            <b>521</b> active accounts
                        </div>
                        <a href="javascript:;" class="medium btn bg-blue float-right tooltip-button" data-placement="top" title="Download now!">
                            <i class="glyph-icon icon-cloud-download"></i>
                        </a>
                    </div>
                </div>

                <div class="dashboard-panel content-box remove-border bg-orange">
                    <div class="content-box-wrapper">
                        <div class="header">
                            Shipped items
                            <span>January - December 2013</span>
                        </div>
                        <div class="sparkline-big">183,579,180,311,405,342,579,405,450,311,180,311,450,302,370,210</div>
                    </div>
                    <div class="button-pane">
                        <div class="heading medium">
                            <b>5</b> pending shipments
                        </div>
                        <a href="javascript:;" class="medium btn bg-black float-right tooltip-button" data-placement="top" title="View details">
                            <i class="glyph-icon icon-cog"></i>
                        </a>
                    </div>
                </div>

            </div>
            <div class="col-lg-6">

                <div class="dashboard-panel content-box remove-border bg-green">
                    <div class="content-box-wrapper">
                        <div class="header">
                            YoY growth
                            <span>2013 - 2014</span>
                        </div>
                        <div class="sparkline-big">183,579,180,311,240,180,311,450,302,370,210,610</div>
                    </div>
                    <div class="button-pane">
                        <div class="heading medium">
                            <b>289</b> new visits
                        </div>
                        <a href="javascript:;" class="medium btn bg-yellow float-right tooltip-button" data-placement="top" title="Add content">
                            <i class="glyph-icon icon-plus"></i>
                        </a>
                    </div>
                </div>

                <div class="dashboard-panel content-box remove-border bg-yellow">
                    <div class="content-box-wrapper">
                        <div class="header">
                            Monthly evolution
                            <span>July - December 2013</span>
                        </div>
                        <div class="sparkline-big">183,579,180,311,230,311,405,342,230,302,405,230,405,342,579,405</div>
                    </div>
                    <div class="button-pane">
                        <div class="heading medium">
                            <b>8</b> overdue orders
                        </div>
                        <a href="javascript:;" class="medium btn bg-white float-right tooltip-button" data-placement="top" title="View details">
                            <i class="glyph-icon icon-link"></i>
                        </a>
                    </div>
                </div>

            </div>
        </div>
        

        <div class="row">
            <div class="col-lg-6">

                <div class="profile-box profile-box-alt content-box">
                    <div class="content-box-header clearfix bg-blue">
                        <div class="user-details">
                            There have been <b>134</b> sales
                            <span>January 2013 - December 2014</span>
                        </div>
                    </div>

                    <div class="pie-wrapper">
                        <div class="pie-sparkline-alt">5,2,3</div>
                    </div>

                    <table class="table">
                        <tbody>
                            <tr>
                                <td class="font-bold text-left">
                                    <div class="badge badge-small bg-blue"></div>
                                    New user registrations
                                </td>
                                <td class="text-center">
                                    <a href="javascript:;" class="btn small hover-yellow tooltip-button" data-placement="top" title="Flag">
                                        <i class="glyph-icon icon-flag"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-blue-alt tooltip-button" data-placement="top" title="Edit">
                                        <i class="glyph-icon icon-edit"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-red tooltip-button" data-placement="top" title="Remove">
                                        <i class="glyph-icon icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td class="font-bold text-left">
                                    <div class="badge badge-small bg-orange"></div>
                                    Returning visitors
                                </td>
                                <td class="text-center">
                                    <a href="javascript:;" class="btn small hover-yellow tooltip-button" data-placement="top" title="Flag">
                                        <i class="glyph-icon icon-flag"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-blue-alt tooltip-button" data-placement="top" title="Edit">
                                        <i class="glyph-icon icon-edit"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-red tooltip-button" data-placement="top" title="Remove">
                                        <i class="glyph-icon icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td class="font-bold text-left">
                                    <div class="badge badge-small bg-gray"></div>
                                    Page views
                                </td>
                                <td class="text-center">
                                    <a href="javascript:;" class="btn small hover-yellow tooltip-button" data-placement="top" title="Flag">
                                        <i class="glyph-icon icon-flag"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-blue-alt tooltip-button" data-placement="top" title="Edit">
                                        <i class="glyph-icon icon-edit"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small hover-red tooltip-button" data-placement="top" title="Remove">
                                        <i class="glyph-icon icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                        </tbody>
                    </table>

                </div>

            </div>

        </div>

    </div>

</div>
	</body>
  <script type="text/javascript" src="../../static/js/aui-production.min.js"></script>
  <script type="text/javascript">
            jQuery(window).load(
                function(){

                    var wait_loading = window.setTimeout( function(){
                      $('#loading').slideUp('fast');
                      jQuery('body').css('overflow','auto');
                    },1000
                    );

                });

        </script>
</html>
