orderApp.config(['$routeProvider', function($routeProvider){
    $routeProvider
        .when('/', {
            controller : 'indexCtrl',
            templateUrl : '../html/index.html'
        })
        .when('/test', {
            controller : 'testCtrl',
            templateUrl: '../html/test.html'
        })
        .otherwise({
            redirectTo : '/'
        });
}]);