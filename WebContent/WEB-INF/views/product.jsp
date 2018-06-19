<div class="container">
	<div class="row">
		<%@include file="./shared/sidebar.jsp"%>
		<div class="col-lg-9">
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProduct == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Product</li>
						</ol>
					</c:if>
				</div>
				<div class="col-lg-12">
					<c:if test="${userClickSingleProduct == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li><a active>Category</a></li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>