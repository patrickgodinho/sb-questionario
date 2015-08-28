app.controller("QuizCtrl", ["$scope", "$http", "$cookies", function($scope, $http, $cookies) {
    $scope.userEmail = $cookies.email;
    $scope.quiz = {};
    $scope.answers = [];
    $scope.questions = [{
        "question": "",
        "type": "text",
        "options": []
    }];
    $scope.questionsToAnswer = [{
        "question": "",
        "type": "",
        "optionz": []
    }];



    $scope.list = function() {
        $http.get('http://localhost:9000/api/quiz').then(function(resp) {
            console.log('Success', resp.data);
            $scope.quiz = resp.data;
        }, function(err) {
            console.error('ERR', err);
        })
    }

    //Save Quiz first
    $scope.save = function() {
        $scope.error = null;
        var question, optionzx;
        $scope.quiz.user = $scope.userEmail;
        if ($scope.quiz.title == null || $scope.quiz.title == "") {
            $scope.error = "Coloque um título para seu questionário";
        } else {

        	$scope.error = null;
            $http({
                    url: 'http://localhost:9000/api/quiz',
                    method: "POST",
                    data: {
                        'quiz': $scope.quiz
                    }
                })
                //then save Questions
                .then(function(response) {
                        for (var i = 0; i < $scope.questions.length; i++) {
                            question = $scope.questions[i];
                            question.questiontxt = question.question;
                            if (question.questiontxt == null || question.questiontxt == "") {

                                $scope.error = "Existem perguntas com o título vazio."
                            } else if ($scope.error == null) {

                                optionzx = question.optionz;
                                question.quiz = response.data.Id;
                                $http({
                                        url: 'http://localhost:9000/api/question',
                                        method: "POST",
                                        data: {
                                            'question': question
                                        }
                                    })
                                    .then(function(response) {

                                        },
                                        function(err) {

                                        });
                            }
                        }; // success
                    },
                    function(err) { // optional
                        // failed
                    });
        }

    }

    $scope.answer = function(q) {
    	
    	if(q.title == null){
    		alert("Coloque um título para seu questinário")
    	}

        var quiz = [];
        var questions = [{}];
        var options = [];


        $scope.quizToAnswer = q;
        $http.get('http://localhost:9000/api/question/findByQuiz/' + q.id).then(function(resp) {
            questions = resp.data;
            angular.forEach(questions, function(question) {
                console.log(angular.toJson(question.Id));
                $http.get('http://localhost:9000/api/option/findByQuestion/' + question.Id).then(function(resp) {
                    options = resp.data
                    question.options = options;
                    //console.log(angular.toJson(questions, true))
                })
            })
            $scope.quizToAnswer.questions = questions;
            //console.log(angular.toJson($scope.quizToAnswer, true))

        }, function(err) {
            console.error('ERR', err);
        })
    }

    $scope.submitAnswer = function() {
        console.log(angular.toJson($scope.quizToAnswer.questions));
        var questions = $scope.quizToAnswer.questions
        angular.forEach(questions, function(question) {
            if (question.answer == null) {
                $scope.error = "Existem questões sem responder.";
            } else if ($scope.error == null) {


                $http({
                        url: 'http://localhost:9000/api/answer',
                        method: "POST",
                        data: {
                            'answer': question.answer,
                            'question': question.id,
                            'email': $scope.answerEmail
                        }
                    })
                    .then(function(response) {
                            if (response.data.error == null) {
                                $("#modal").hide();
                                $('body').removeClass('modal-open');
                                $('.modal-backdrop').remove();
                                alert("Obrigado!");
                                $scope.answerEmail = "";
                            } else {
                                $scope.error = "Voce já respondeu esse questionário."
                            }


                        },
                        function(err) {

                        });
            }
        });

    }


    $scope.remove = function() {
        $scope.questions.splice(0, 1);
    }

    $scope.add = function() {
        $scope.questions.push({
            "question": "",
            "type": "text",
            "options": []
        });
    }

    $scope.addOption = function(question) {
        console.log("veio" + angular.toJson(question));
        question.options.push({
            "value": ""
        });
        console.log(question);
    }

    $scope.removeOption = function(question) {
        question.optionz.splice(0, 1);
    }

    $scope.showConsole = function() {
        //console.log(angular.element(e.srcElement).scope());
        //console.log($scope.quiz);
        console.log($scope.questions);
    }
}])
