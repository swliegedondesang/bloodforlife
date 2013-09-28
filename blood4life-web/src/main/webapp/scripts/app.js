//Define a function scope, variables used inside it will NOT be globally visible
(function () {

    var
    //the HTTP headers to be used by all requests
        httpHeaders,
    //the message to be shown to the user
        message,
    //Define the main module.
    //The module is accessible everywhere using "angular.module('blood4life')", therefore global variables can be avoided totally.
        blood4life = angular.module('blood4life', []);

    blood4life.config(function ($routeProvider) {

        //configure the rounting of ng-view
        $routeProvider.when('/', { controller: 'HomeCtrl', templateUrl: 'views/home.html'}).
//            when('/legal', { templateUrl: 'views/legal.html'}).
//            when('/users', { controller: 'UserCtrl', templateUrl: 'views/user/list.html'}).
//            when('/users/:id', { controller: 'UserCtrl', templateUrl: 'views/user/detail.html'}).
//            when('/users/user', { controller: 'UserCtrl', templateUrl: 'views/user/detail.html'}).
//            when('/activities', { controller: 'ActivityCtrl', templateUrl: 'views/activity/list.html'}).
//            when('/activities/activity', { templateUrl: 'views/activity/createActivity.html'}).
            otherwise({redirectTo:'/'});

    });


    blood4life.run(function ($rootScope) {

        //make current message accessible to root scope and therefore all scopes
        $rootScope.message = function () {
            return message;
        };
    });

}());