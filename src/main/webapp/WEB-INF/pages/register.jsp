<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div>
	<!-- student should match in the controller -->
<form:form action="registerUser" method="POST" modelAttribute="users" >
<section class="h-100 bg-dark">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">Student registration form</h3>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                    <form:input type="text" class="form-control" id="name" path="name" />
                      <form:label class="form-label" for="form3Example1m" path="name"> Name</form:label>
                    </div>
                  </div>


                 <div class="form-outline mb-4">
                 <form:input type="email" class="form-control" id="email" path="email" />
                                <form:label class="form-label" for="form3Example97" path="email">Email ID</form:label>
                              </div>
                <div class="form-outline mb-4">
              <form:input type="text" class="form-control" id="password" path="password" />
                <form:label class="form-label" for="form3Example97" path="password">password</form:label>
                  </div>
              <div class="form-outline mb-4">
              <form:input type="text" class="form-control" id="cPassword" path="confirmPassword" />
                <form:label class="form-label" for="form3Example97" path="confirmPassword">Confirm password</form:label>
                  </div>

                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                  <h6 class="mb-0 me-4">Gender: </h6>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <form:input class="form-check-input" type="radio"  id="femaleGender"
                      value="female"  name="radio" path="Gender"/>
                    <form:label class="form-check-label" for="femaleGender" path="Gender">Female</form:label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <form:input class="form-check-input" type="radio"  id="maleGender"
                      value="Male" name="radio" path="Gender" />
                    <form:label class="form-check-label" for="maleGender" path="Gender">Male</form:label>
                  </div>


                </div>

                <div class="row">
                  <div class="col-md-6 mb-4">
                <h6 class="form-check-label">Select the state: </h6>
                    <form:select class="select" path="state">
                      <form:option value="1" name="state">State</option>
                      <form:option value="2" name="state">AP</option>
                      <form:option value="3" name="state">TS</option>
                      <form:option value="4" name="state">KS</option>
                    </select>

                  </div>

                </div>
                 <div class="col-md-6 mb-4">
                <h6 class="form-check-label" >Select the Language::</h6>
                                 <form:input type="checkbox" id="vehicle1" name="language" value="telugu" path="languages"/>
                                 <form:label for="vehicle1" path="languages" > Telugu</form:label><br>
                                 <form:input type="checkbox" id="vehicle2" name="language" value="Hindi" path="languages"/>
                                 <form:label for="vehicle2" path="languages"> Hindi</form:label><br>

                                  </div>

                <div class="d-flex justify-content-end pt-3">

                <input type="submit" class="btn btn-warning btn-lg ms-2">Submit form</input>
                <a href="index">Login here</a>
                </div>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>