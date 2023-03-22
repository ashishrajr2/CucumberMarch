Feature: Validation of Adactin Hotel Application

  Scenario Outline: Validating the Application with same login credentials and booking five rooms
    Given user launches the Adactin Hotel app
    When user enters the "<username>" and "<password>"
    And user selects the "<location>"
    And name of the "<hotel>"
    And type of "<room type>"
    And no of "<no of rooms>"
    And adult per room "<adult per room>"
    And child per room "<children per room>"
    And enters the "<check in date>" and "<check out date>"
    And confirms the Hotel
    And enters the "<firstname>","<lastname>","<address>"
    And enter "<credit card no>" "<ccv number>"
    Then confirms the booking

    Examples: 
      | username   | password   | location | hotel          | room type    | no of rooms | adult per room | children per room | check in date | check out date | firstname | lastname | address     | credit card no   | ccv number |
      | ashishrajr | 8220120137 | Sydney   | Hotel Creek    | Standard     | 1 - One     | 1 - One        | 1 - One           | 15/11/2022    | 16/11/2022     | Ashish    | Raj      | Krishnagiri | 4452684078945612 |        399 |
      | ashishrajr | 8220120137 | Adelaide | Hotel Sunshine | Double       | 2 - Two     | 1 - One        | 2 - Two           | 18/11/2022    | 20/11/2022     | Naveen    | kumar    | Krishnagiri | 4646645335445435 |        454 |
      | ashishrajr | 8220120137 | Brisbane | Hotel Hervey   | Deluxe       | 1 - One     | 1 - One        | 1 - One           | 22/11/2022    | 25/11/2022     | Lokesh    | kumar    | Krishnagiri | 8795645745124165 |        686 |
      | ashishrajr | 8220120137 | London   | Hotel Cornice  | Super Deluxe | 2 - Two     | 1 - One        | 2 - Two           | 27/11/2022    | 29/11/2022     | Muthu     | krishnan | Krishnagiri | 3457684357654548 |        453 |
      | ashishrajr | 8220120137 | Paris    | Hotel Creek    | Standard     | 1 - One     | 2 - Two        | 1 - One           | 1/12/2022     | 3/12/2022      | Karthik   | kumar    | Krishnagiri | 5689454745465757 |        545 |
