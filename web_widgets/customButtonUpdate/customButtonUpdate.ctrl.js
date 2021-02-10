function ($scope,modalService) {
    
    $scope.update = function(){
        $scope.properties.value = $scope.properties.newValue;
        
        if($scope.properties.openModal===true){
            openModal($scope.properties.modalId);
        }
    };
    
    function openModal(modalId) {
        modalService.open(modalId);
    }
}