<div class="container">
	<div class="row">
		<%@include file="./shared/sidebar.jsp"%>
		<div class="col-lg-9">
			<!-- breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProduct == true }">
						<script>
							window.categoryId='';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Product</li>
						</ol>
					</c:if>
				</div>
				<div class="col-lg-12">
					<c:if test="${userClickSingleProduct == true }">
						<script>
							window.categoryId="${category.id}";
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li><a class="active">Category</a></li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<table id="productListTable" class="table table-stripped table-bordered">
						<thead>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>