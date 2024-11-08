Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
	Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
 And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
    |name| langauge| Address    |
    |Bhus|Kannada  |Bangalore   |
    |Lavs|Telugu   |Amidalagondi|

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working

	Given DeletePlace Payload
	When user calls "deletePlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"

#Scenario: verify the response is correct or not
#
#Given Check the resopnse after running the request
#When User calls "AddPlaceAPI" with "POST" http request
#Then  "Status" should be OK not any other msg
#And Check the "scope" should be present 
   



	

	
	
	
	
	
	

	
	
	