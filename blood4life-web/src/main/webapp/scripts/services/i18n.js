(function () {

    var blood4life = angular.module('blood4life');

    blood4life.service('i18n', function () {
        var self = this;
        this.setLanguage = function (language) {
            $.i18n.properties({
                name: 'messages',
                path: 'scripts/i18n/',
                mode: 'map',
                language: language,
                callback: function () {
                    self.language = language;
                }
            });
        };

        //TODO: check the browser language

        this.setLanguage('fr');
    });
}());