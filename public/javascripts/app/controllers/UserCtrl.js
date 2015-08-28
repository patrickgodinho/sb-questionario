app.controller("UserCtrl", ["$scope", "$http","$rootScope", "$location", function($scope, $http, $rootScope, $location)  {

	$scope.user;

	$scope.save = function(){

		$http({
			url: 'http://localhost:9000/api/user',
			method: "POST",
			data: { 'user' : $scope.user }
		})
		.then(function(response) {
			$location.path("/questionario")
		});
	}
}])