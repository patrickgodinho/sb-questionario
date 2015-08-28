app.controller("NavCtrl", ["$scope", "$http", "$routeParams", "$cookies", "$rootScope", function($scope, $http, $cookies, $routeParams, $rootScope ) {


$scope.userEmail = $rootScope.email;

}])
