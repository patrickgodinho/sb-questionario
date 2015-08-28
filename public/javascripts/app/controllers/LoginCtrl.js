app.controller("LoginCtrl", ["$scope", "$http", "$location", "$cookies", '$cookieStore',"$rootScope", function($scope, $http, $location, $cookies, $cookieStore, $rootScope) {

    $scope.user;
    $scope.userEmail = $cookies.email;
    $rootScope.userEmail = $cookies.email;
    $scope.save = function() {

        $http({
                url: 'http://localhost:9000/api/user',
                method: "POST",
                data: {
                    'user': $scope.user
                }
            })
            .then(function(response) {});
    }

    $scope.close = function() {
        $("#modal-login").hide();
        $('body').removeClass('modal-open');
        $('.modal-backdrop').remove();
        $location.path("/usuario");
    };

    $scope.login = function(){
    	console.log("entrou");
    	$http({
                url: 'http://localhost:9000/api/login',
                method: "POST",
                data: {
                    'email': $scope.login.email,
                    'password': $scope.login.password,
                }
            })
            .then(function(response) {
            	//$cookieStore.put( 'email', $rootScope.user );
            	$cookies.email = response.data.email;

            	$("#modal-login").hide();
        		$('body').removeClass('modal-open');
        		$('.modal-backdrop').remove();

   				$scope.userEmail = response.data.email;
            	
            },
            function(err){
            });	
            	 window.location.reload(true);
    }

    $scope.logoff = function(){
    	console.log("entrou");
    	$http({
                url: 'http://localhost:9000/api/logoff',
                method: "POST"
            })
            .then(function(response) {
            	$cookieStore.remove( 'email');
            	$scope.userEmail = null;
            	$location.path("/");
            },
            function(err){
            });	
            	
    }

    $scope.createQuiz = function(){
    	if($scope.userEmail != null){
    		$location.path('/questionario');
    	}
    	else{
    		$location.path('/usuario');
    	}
    }

}])
