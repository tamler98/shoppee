<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../resource/profile.css">
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
	rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/solid.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/svg-with-js.min.css">
<link rel="icon" href="../resource/img/shopee-logo.png"
	type="image/x-icon">
<title>Shopee Việt Nam | Mua và Bán Trên Ứng Dụng Di Động Hoặc
	Website</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main>
		<div class="main_profile">
		<div class="main_container">
			<div class="main_left">
				<div class="main_left-top">
					<div class="main_left-top-img">
						<img src="${users.image}" alt="">
					</div>
					<div class="main_left-top-user">
						<div class="main_left-top-user-username">${users.username}</div>
						<div class="main_left-top-user-update-info">
							<a href=""><i class="fa-solid fa-screwdriver"></i> Sửa hồ sơ</a>
						</div>
					</div>
				</div>
				<div class="main_left-bottom">
					<div class="main_left-bottom-list">
						<ul class="main_left-bottom-list-account">
				            	<a href=""><i class="fa-regular fa-user"></i>
				            	&nbspTài Khoản của tôi</a>
								<li><a href="">Hồ sơ</a></li>
								<li><a href="">Ngân hàng</a></li>
								<li><a href="">Địa chỉ</a></li>
								<li><a href="">Đổi mật khẩu</a></li>
							
						</ul>
						<ul class="main_left-bottom-list-item_bought">
							<a href=""><i class="fa-solid fa-basket-shopping"></i>&nbspĐơn
								mua</a>
						</ul>
						<ul class="main_left-bottom-list-notificate">
							<a href=""> <i class="fa-regular fa-bell"></i>&nbspThông báo</a>
						</ul>
						<ul class="main_left-bottom-list-voucher">
							<a href=""><i class="fa-brands fa-cc-diners-club"></i>&nbspKho
								Voucher</a>
						</ul>
						<ul class="main_left-bottom-list-coin">
							<a href="">&nbsp<i class="fa-solid fa-bitcoin-sign"></i>&nbspShopee Xu</a>
						</ul>
					</div>
				</div>
			</div>
			<div class="main_right">
				<div class="main_right-top">
					<div class="texth1">Hồ sơ của tôi</div>
					<div class="texth2">Quản lý thông tin hồ sơ để bảo mật tài
						khoản</div>
				</div>
				<div class="main_right-bottom">
					<div class="main_right-bottom-form_user_info">
						<form action="" class="profile_form">
							<p>
								<label for="get_username">Tên đăng nhập</label>${users.username}</p>
							<p>
								<label for="name">Tên</label><input type="text" name="name"
									id="name" value="${users.name}">
							</p>
							<p>
								<label for="email">Số điện thoại</label> ${users.phone} &nbsp <a
									href="">Thay đổi</a>
							</p>
							<p>
								<label for="male">Giới tính</label> ${users.sex} &nbsp <a
									href="">Thay đổi</a>
							</p>
							<p>
								<label for="born">Ngày sinh</label><input type="date"
									value="21/02/1998" name="psw" required>
							</p>
							<p>
								<label for="born"></label><a href=""><button>Lưu</button></a>
							</p>
						</form>
					</div>
					<div class="main_right-bottom-add_user_avatar">
						<div class="avatar">
							<div class="adding_avatar">
								<img src="${users.image}" alt="">
							</div>
							<div class="adding_avatar-button">
								<button>Chọn Ảnh</button>
							</div>
							<div class="adding_avatar-des">Dung lượng file tối đa 1 MB
								Định dạng:.JPEG, .PNG</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>