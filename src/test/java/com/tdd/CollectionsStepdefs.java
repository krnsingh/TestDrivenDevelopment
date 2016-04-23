package com.tdd;

import com.tdd.collections.Palindrome;
import com.tdd.collections.StreamsPractice;
import com.tdd.entity.Address;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.notNullValue;

public class CollectionsStepdefs {

    List<Address> addresses;
    List<String> countries;
    private String inputString;
    private boolean resultOfPalindromeCheck;

    @Given("^There is random list of addresses:$")
    public void There_is_random_list_of_addresses(List<Address> addressList) throws Throwable {
        addresses = addressList;
    }

    @When("^the operation to get list of unique countries applied$")
    public void the_operation_to_get_list_of_unique_countries_applied() throws Throwable {
        countries = StreamsPractice.countries(addresses);
        assertThat(countries, is(notNullValue()));
    }

    @Then("^the result should be$")
    public void the_result_should_be(List<String> countryList) throws Throwable {
        assertThat(countries, containsInAnyOrder(countryList.toArray()));
    }

    @Given("^The input string is \"([^\"]*)\"$")
    public void The_input_string_is(String input) throws Throwable {
        inputString = input;
    }

    @When("^palindrome method is executed$")
    public void palindrome_method_is_executed() throws Throwable {
        resultOfPalindromeCheck = new Palindrome().isPalindrome(inputString);
    }

    @Then("^then (true|false) is returned$")
    public void then_true_is_returned(boolean result) throws Throwable {
        assertThat(resultOfPalindromeCheck, is(result));
    }
}
