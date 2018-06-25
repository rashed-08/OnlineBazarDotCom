<div class="container">
	<!-- Breadcrumb -->
	<div class="row">
		<div class="col-lg-12">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/all/product">Products</a></li>
				<li class="active">${product.name}</li>
			</ol>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-4 col-sm-4">
			<div class="thumbnail">
				<img alt="image" src="${images}/${product.code}"
					class="img img-responsive">
			</div>
		</div>
		<div class="col-lg-8 col-sm-8">
			<h3>${product.name}</h3>
			<hr />
			<p>${product.description}</p>
			<hr />
			<h4>
				Price: <strong>&#2547; ${product.unitPrice} /-</strong>
			</h4>
			<hr />

			<c:choose>
				<c:when test="${product.quantity <1 }">
					<h6>
						Quantity Available: <span style="color: red">Out of Stock</span>
					</h6>
				</c:when>
				<c:otherwise>
					<h6>Quantity Available: ${product.quantity}</h6>
				</c:otherwise>
			</c:choose>


			<a href="${contextRoot}/all/product" class="btn btn-primary">Back</a>



			<c:choose>
				<c:when test="${product.quantity <1 }">
					<a href="javascript:void(0);" class="btn btn-success disabled"><strike><span
							class="glyphicon glyphicon-shopping-cart"></span>Add to cart</strike></a>
				</c:when>
				<c:otherwise>
					<a href="${contextRoot}/add/cart/${product.id}/product"
						class="btn btn-success"><span
						class="glyphicon glyphicon-shopping-cart"></span>Add to cart</a>
				</c:otherwise>
			</c:choose>








			<%-- 			<c:choose>
				<c:when test=" ${product.quantity< 1} ">
					<a href="javascript:void(0);" class="btn btn-success disabled"><strike><span
							class="glyphicon glyphicon-shopping-cart"></span>Add to cart</strike></a>
				</c:when>
				<c:otherwise>
					<a href="${contextRoot}/add/cart/${product.id}/product"
						class="btn btn-success"><span
							class="glyphicon glyphicon-shopping-cart"></span>Add to cart</a>
				</c:otherwise>
			</c:choose>
 --%>
		</div>
	</div>
</div>