app.controller("AppCtrl", ["$scope", "$http", "$routeParams", "$cookies", "$rootScope", function($scope, $http, $cookies, $routeParams, $rootScope ) {

$scope.teste = $cookies.email;

}])
