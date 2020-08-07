Feature: Search for user functionality


@Search @one
  Scenario:  user is able to search the products.
   Given I launch the application
   When I search for a product "Samsung SyncMaster 941BW"
   Then I should see the product in the results
   
   @Search @two
   Scenario:  verify the product is being searched is not available
   Given I launch the application
   When I search for a product "Apple iphone"
   Then I should see the given msg "There is no product that matches the search criteria."