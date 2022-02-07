# Insurance company
## Difficulty: ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg)
In this assignment we are going to calculate premiums for insurance policies based on whether this is a trip, a house
or a car. Each insurance has a base price, but could benefit from discounts based on the client that is taking out the
insurance. Please note that we just "did some calculations" with regards to prices, as actual formulas usually cannot be
found. It is therefore quite possible that some of the values are completely incorrect if you compare them to your own
insurances!

In the `Application` class we have included the code that generated the sample output below. Please note that you should
this `Application` class as is. No adjustments should be required.

The program works with `Client`s that can insure multiple things. In this application, only 3 things can be insured: 
Houses, Cars and trips. Cars and houses are also so-called `InsurableObjects`, physical things that you can insure 
based on the market value. A trip can be insured based on location and the number of days (and thus does not inherit 
from this class).

You are tasked to complete this program by implementing the insurance part. In doing so, use the following design:
- Each `Insurance` has a unique identifier (number) within the application. The first insurance gets number "1000",
  all insurances that are subsequently created each get "the next logical value".
- Each `Insurance` also has a `Client` to whom the insurance is linked. This client cannot be changed once the insurance
  policy has been created.
- For each insurance you must be able to get the cost by using the `getCost()` method. How these costs are calculated will 
  be explained below.

For a `TravelInsurance`, besides the client, the destination, date of departure and the number of days of the trip must 
must be recorded. The destination and the number of days determine the _basic price_ of an insurance. Please use
the table below to determine the right price. We recommend that you develop a static method for this, which can 
convert the destination and number of days to the _basic_ price of the insurance.

| Destination        | Calculation           | 
| ------------- |:-------------:|
| America     | 20 euro default + 5 euro per day of trip |
| Africa     | 50 euro default + 7 euro per day of trip |
| Europe     | 5 euro default + 2 euro per day of trip |
| Asia     | 30 euro default + 5 euro per day of trip |

It is possible that a insurance holder can receive a discount on their insurance. In fact, the company gives _all persons
under 30, 20% off their travel insurance policies_. Study the example below, the trip of young Tristan (the top) costs 
180 euros for 30 days in Asia, but gets 36 euro discount, so his total cost is only 180-36 = 144 euros. The old Tristan
does not get this discount (as he is older than 30) for the trip to Africa.

A `CarInsurace` is a little more direct. The basic price of car insurance is 2% of the market value of the car. However,
the discount that is then calculated for the driver is based on the number of years he/she has driven damage free. At 25 
claim-free years, the maximum discount of 90% is reached. A beginner driver (with 0 claim-free years) will therefore start 
at (90-25) 65% discount and will receive an extra 1% discount on his insurance policy every year he/she has no claims (up 
to a maximum of 90%). Technically this is implemented by taking out a new insurance policy every year until the maximum 
discount is reached.

A `HomeInsurance` policy only requires the market value of the home as the required information. The basic price of a 
`HomeInsurance` is just 1% of the value of the home. In addition, the company has the following discount: _All insurers
who are older than 60 years, get 90% on their home insurance!_ Whether this is fair or not we will not discuss, but 
notice therefore that old Tristan pays very little for his home insurance!

A few tips:
- Start with the home insurance. This one should make you understand what is ask. Then try implementing the more interesting
  insurance types.
- Note the static methods are also used for printing the basic prices. This is mainly done to "force" you to use
  "force" you to make certain methods really static. This can of course be done differently (but you shouldn't)!
  
# Example
```text
The base insurance price for van Galenstraat 19, Enschede is 1250
The base price for a car insurance for 123-456-AB (Ford) is: EUR 500
The base price for a travel insurance to Asia costs for 30 days: EUR 180

Overview for Tristan Pothoven, born 2000-01-01: 
	Insurance id: 1001, Car insurance for 123-456-AB (Ford): EUR 335
	Insurance id: 1002, Home insurance for van Galenstraat 19, Enschede (125000): EUR 1250
	Insurance id: 1003, Travel insurance for the trip to Asia for 30 on 2021-08-01: EUR 144

The total cost of all insurances are EUR 1729

******** A FEW YEARS LATER *************
The base insurance price for Handelskade 75, Deventer is 4500
The base price for a car insurance for AB-1234-XY (Flying Tesla) is: EUR 1500
The base price for a travel insurance to Africa costs for 15 days: EUR 155

Overview for Tristan Pothoven, born 1960-01-01: 
	Insurance id: 1004, Home insurance for Handelskade 75, Deventer (450000): EUR 450
	Insurance id: 1005, Car insurance for AB-1234-XY (Flying Tesla): EUR 1350
	Insurance id: 1006, Travel insurance for the trip to Africa for 15 on 2035-01-01: EUR 155

The total cost of all insurances are EUR 1955
```