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
<link rel="stylesheet" href="../resource/login.css">
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
<link rel="icon" href="../resource/img/shopee-logo.png" type="image/x-icon">
<title>Shopee - Đăng nhập</title>
</head>
<body>
	<header>
		<div class="header_content">
			<div class="content">
				<div class="header_logo">
					<a href="index"><img src="../resource/img/Shopee.svg"
						alt="erro"></a>
					<div class="header_text">Đăng Nhập</div>
				</div>
				<div class="header_helps">
					<a href="">Bạn cần giúp đỡ?</a>
				</div>
			</div>
	</header>
	<main>
		<div class="main_content">
			<div class="main_logo">
				<div class="main_logo_logo">
					<img src="../resource/img/logo_shopee.png" width="210">
				</div>
				<div class="main_logo_slogan">
					<p>Nền tảng thương mại điện tử</p>
					<p>yêu thích ở Đông Nam Á & Đài Loan</p>
				</div>
			</div>
			<div class="main_form">
				<div class="text">
					<div class="text_login">Đăng nhập</div>
					<div class="text_QR">
						<div class="box_QR">
							<p>Đăng nhập với mã QR</p>
						</div>
						<div class="QR_code">
							<a href=""><img src="../resource/img/qr.png" width="45px"></a>
						</div>
					</div>
				</div>
				<div class="login-note">${notes}
				</div>
				<div class="login">
					<form action="login" method="post" class="form_login">
						<label for="fname"></label> <input type="text" id="fname"
							name="username" placeholder="Email/Số điện thoại/ Tên đăng nhập"><br>
						<label for="password"></label> <input type="password" id="pass"
							name="password" placeholder="Mật khẩu"><br> <input
							type="submit" value="Đăng nhập" id="button_login">
					</form>
					<div class="form_forgot">
						<div class="form_forgot_password">
							<a href="">Quên mật khẩu</a>
						</div>
						<div class="form_login_phonenumber">
							<a href="">Đăng nhập với SMS</a>
						</div>
					</div>
					<br>
					<div class="form_or">
						<div class="form_or_text">------------------------------
							HOẶC ------------------------------</div>
					</div>
					<br>
					<div class="login_socials">
						<a href="" class="login_social">
							<div class="social_logo">
								<img src="../resource/img/fblogo.webp" width="20px">
							</div>
							<div class="social_name">Facebook</div>
						</a> <a href="" class="login_social">
							<div class="social_logo">
								<img src="../resource/img/gg.png" width="20px">
							</div>
							<div class="social_name">Google</div>
						</a> <a href="" class="login_social">
							<div class="social_logo">
								<img src="../resource/img/ap.png" width="18px">
							</div>
							<div class="social_name">Apple</div>
						</a>
					</div>
				</div>

				<div class="new_signup">
					<div class="signup_text">Bạn mới đến Shopee?</div>
					<div class="signup_link">
						<a href="signup">Đăng ký</a>
					</div>
				</div>
			</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>