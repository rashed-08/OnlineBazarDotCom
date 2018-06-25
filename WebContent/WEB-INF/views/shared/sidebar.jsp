<!-- Sidebar for code  -->
<div class="col-lg-3">

	<h1 class="my-4">OnlineBazar</h1>
	<div class="list-group">
		<c:forEach items="${categories}" var="category">
			<a href="${contextRoot}/show/category/${category.id}/product"
				class="list-group-item" id="a_${category.name}">${category.name}</a>
		</c:forEach>
	</div>

</div>
<!-- /.col-lg-3 -->
