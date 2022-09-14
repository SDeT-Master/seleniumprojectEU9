package com.cydeo.tests.day9_javafaker_testbase_driveUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {
    @Test
    public void test1(){

        Faker faker= new Faker();

       // Faker faker=new Faker(new Locale("tr"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //numerify method will generate random numbers in the format we want to get
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-###\") =" +
                " " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        // letterify() method will return random letters where we pass "?";
        System.out.println("faker.letterify(\"?????-????\") = " + faker.letterify("?????-????"));

        //
        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("9","F"));


        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));



    }
}
