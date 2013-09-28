(function () {

    var blood4life = angular.module('blood4life');

    blood4life.directive('msg', function () {
        return {
            restrict: 'EA',
            link: function (scope, element, attrs) {
                var key = attrs.key;
                if (attrs.keyExpr) {
                    scope.$watch(attrs.keyExpr, function (value) {
                        key = value;
                        element.text($.i18n.prop(value));
                    });
                }
                scope.$watch('language()', function (value) {
                    element.text($.i18n.prop(key));
                });
            }
        };
    });
}());