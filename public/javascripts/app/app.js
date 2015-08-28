var app = angular.module('app', ['ngResource', 'ngCookies'])
	.config(["$routeProvider", function ($routeProvider) {
		return $routeProvider.when('/', {
			templateUrl: '/assets/partials/index.html',
			controller: 'QuizCtrl'
		}).when('/questionario', {
			templateUrl: '/assets/partials/new.html',
			controller: 'QuizCtrl'
		}).when('/usuario', {
			templateUrl: '/assets/partials/user.html',
			controller: 'UserCtrl'
		}).when('/responder', {
			templateUrl: '/assets/partials/answer.html',
			controller: 'AppCtrl'
		}).otherwise({ 
			redirectTo: '/' 
		});
	}])
	.config(["$locationProvider", function ($locationProvider) {
		return $locationProvider.html5Mode(true).hashPrefix("!");
	}]);