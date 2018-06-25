<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="container">
	<div class="row">
		<c:if test="${not empty message }">
			<div class="col-lg-12">
				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${message}
				</div>
			</div>
		</c:if>
		<div class="col-md-offset-2 col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<!-- Form Name -->
					<h4>Product Management</h4>
				</div>
				<div class="panel-body">
					<form:form class="form-horizontal"
						action="${contextRoot}/manage/product" modelAttribute="product"
						method="post">
						<fieldset>

							<!-- Text input-->
							<div class="control-group">
								<label class="control-label col-md-4" for="name">Enter
									Product Name :</label>
								<div class="controls">
									<form:input id="name" path="name" name="name"
										placeholder="Product Name" class="input-xlarge" type="text" />

								</div>
							</div>

							<!-- Text input-->
							<div class="control-group">
								<label class="control-label col-md-4" for="brand">Enter
									Brand Name :</label>
								<div class="controls">
									<form:input id="brand" path="brand" name="brand"
										placeholder="Brand Name" class="input-xlarge" type="text" />

								</div>
							</div>

							<!-- Textarea -->
							<div class="control-group">
								<label class="control-label col-md-4" for="description">Prodduct
									Description :</label>
								<div class="controls">
									<form:textarea id="description" row="4" path="description"
										name="description" placeholder="Write a description"></form:textarea>
								</div>
							</div>

							<!-- Text input-->
							<div class="control-group">
								<label class="control-label col-md-4" for="unitPrice">Enter
									Unit Price :</label>
								<div class="controls">
									<form:input id="unitPrice" path="unitPrice" name="unitPrice"
										class="input-xlarge" type="number" />

								</div>
							</div>

							<!-- Text input-->
							<div class="control-group">
								<label class="control-label col-md-4" for="quantity">Quantity
									Available :</label>
								<div class="controls">
									<form:input id="quantity" path="quantity" name="quantity"
										class="input-xlarge" type="number" />

								</div>
							</div>

							<!-- Select Basic -->
							<div class="control-group">
								<label class="control-label col-md-4" for="categoryId">Select
									Category :</label>
								<div class="controls">
									<form:select id="categoryId" path="categoryId"
										name="categoryId" class="input-xlarge" items="${categories}"
										itemLabel="name" itemValue="id" />
								</div>
							</div>

							<!-- Button -->
							<div class="control-group">
								<label class="control-label col-md-1" for="submit"></label>
								<div class="controls">
									<button id="submit" name="submit" class="btn btn-primary">Submit</button>
									<form:hidden path="id" />
									<form:hidden path="code" />
									<form:hidden path="supplierId" />
									<form:hidden path="active" />
									<form:hidden path="view" />
									<form:hidden path="purchases" />
								</div>
							</div>

						</fieldset>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>




