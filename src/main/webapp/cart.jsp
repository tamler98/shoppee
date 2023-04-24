<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="../resource/cart.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
<div class="header_cart">
				<div class="header__cart header__cart--has-cart">
                    <i class="header__cart-icon fas fa-shopping-cart"></i>
                    <div class="header__cart-count">${count}</div>
                
                    <div class="header__cart-list no-cart">
                        <img src="./assets/img/sp/no-cart.png" class="header__no-cart-img">
                        <p class="header__no-cart-text">Chưa có sản phẩm</p>
                    </div>
                
                    <div class="header__cart-list has-cart">
                        <h4 class="header__cart-heading">Sản phẩm mới thêm</h4>
                        <c:forEach items="${items}" var="item">
                        <a href="/JavaWeb/api/product?pid=${item.getId()}">
	                        <ul class="header__cart-list-item">
	                            <li class="header__cart-item"><img src="${item.getImage()}"
	                                class="header__cart-item-img">
	                                <div class="header__cart-item-info">
	                                    <div class="header__cart-item-heading">
	                                        <h3 class="header__cart-item-name">${item.getName()}</h3>
	                                        <p class="header__cart-item-price">${item.getPrice()*item.count}</p>
	                                    </div>
	                                    <div class="header__cart-item-body">
	                                        <p class="header__cart-item-number">x${item.count}</p>
	                                        <div class="header__cart-item-close">
	                                            <a href="oderdelete?orderid=${item.getId()}">Xóa</a>
	                                        </div>
	                                    </div>
	                                </div></li>
	                        </ul>
	                        </a>
	                       </c:forEach>
                        <div class="header__cart-footer">
                            <a href="cart">Xem giỏ hàng</a>
                        </div>
                    </div>
                </div>
			</div>