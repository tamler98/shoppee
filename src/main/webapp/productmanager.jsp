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
<link rel="stylesheet" href="../resource/productmanager.css">
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Product Management System</title>
</head>
<body>
    <header>
        <div class="header_nav_list">
            <a href="">Product Management System</a>
            <a href="" class="header_nav_list_first">Product Management</a>
            <a href="" class="header_nav_list_first">All Management</a>
        </div>
    </header>
    <main>
        <div class="title">List Product</div>
        <div class="btn_add_student">
            <a href="new"><button class="btn_add">Add Product</button></a>
        </div>
        <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Product Name</th>
            <th scope="col">Price</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${listProduct}" var="productList">
          <tr>
            <td>${productList.id}</td>
            <td>${productList.name}</td>
            <td>${productList.price}</td>
            <td class="td_button">
            	<a href="update?pid=${productList.id}"><button>Update</button></a>
              	<a href="delete?sid=${productList.id}"><button>Delete</button></a>
                
            </td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      <div class="list">
				<c:forEach begin="1" end="${end}" var="i">
					<a href="#">${i}</a>
				</c:forEach>
		</div>
    </main>
</body>
<script>
	function showMess(sid) {
		var option = comfirm("Are you sure to delete");
		if (option === true) {
			window.location.href='delete?sid=' +sid;
		}
	}
</script>
</html>