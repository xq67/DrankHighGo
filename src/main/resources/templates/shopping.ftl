<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>访问当当购物车页面节点</title>
    <link type="text/css" rel="stylesheet" href="css/cartStyle.css" />
</head>
<body>

<div class="content">
    <div class="logo">
        <img src="images/dd_logo.jpg"><span onclick="close_plan();">关闭</span>
    </div>
    <div class="cartList" id="cartList">
        <ul>
            <li>¥<input type="text" name="price" value="21.90"></li>
            <li><input type="button" name="minus" value="-" onclick="minus(0);"><input type="text" name="amount" value="1"><input type="button" name="plus" value="+" onclick="plus(0);"></li>
            <li id="price0">¥21.90</li>
            <li><p  onclick="collection();">移入收藏</p><p onclick="del();">删除</p></li>
        </ul>
        <ul>
            <li>¥<input type="text" name="price" value="24.00"></li>
            <li><input type="button" name="minus" value="-" onclick="minus(1);"><input type="text" name="amount" value="1"><input type="button" name="plus" value="+" onclick="plus(1);"></li>
            <li id="price1">¥24.00</li>
            <li><p  onclick="collection();">移入收藏</p><p onclick="del();">删除</p></li>
        </ul>
        <ol>
            <li id="totalPrice">&nbsp;</li>
            <li><span onclick="accounts();">结 算</span></li>
        </ol>
    </div>
    <div></div>
</div>
<script type="text/javascript" src="js/shopping.js"></script>
</body>
function accounts(){
		var car=document.getElementById("cartList");
		var pri0=car.firstElementChild.lastElementChild.previousElementSibling.innerText;
		var pri1=car.firstElementChild.nextElementSibling.lastElementChild.previousElementSibling.innerText;	
		var sum=(parseFloat(pri0.substring(1))+parseFloat(pri1.substring(1)));
		car.nextElementSibling.innerText="您本次购买的信息如下\n"+"白岩松：白说："+pri0+"\n"+"岛上书店："+pri1
		+"\n"+"商品总价"+sum;
	}
</html>