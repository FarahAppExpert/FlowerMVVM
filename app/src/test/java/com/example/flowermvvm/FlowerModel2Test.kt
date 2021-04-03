package com.example.flowermvvm

import com.example.flowermvvm.model.FlowerModel2
import kotlinx.coroutines.flow.flow
import org.hamcrest.CoreMatchers.`is`
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith (JUnit4 :: class)
class FlowerModel2Test
{
    private lateinit var flowerModel2: FlowerModel2
    // in  Junit4 use @Before to sety up the test
    @Before
    fun setup ()
    {
        var flowerModel2 : FlowerModel2 = FlowerModel2()
    }
    @Test
    fun FlowerModel2_TestValue ()
    {

        var categoryTest: String? = "Category F"
        var priceTest: Double? = 100.50
        var instructionsTest: String? = "no instraction"
        var photo: String? = null
        var name: String? = "Rose Flower"
        var productId: Int? = 5555


        flowerModel2 = FlowerModel2()


        // this is where we create  our  the test cretira result

        assertEquals(flowerModel2.category, (categoryTest))
        assertEquals(flowerModel2.price, (priceTest))
        assertEquals(flowerModel2.instructions, (instructionsTest))
        assertEquals(flowerModel2.photo, (photo))
        assertEquals(flowerModel2.name, (name))
        assertEquals(flowerModel2.productId, productId )

    }


// Assume ignores the test if given the value "assumes
// otjerwide it return a fail


// used  Ignore to Ignor test either pass or fail

    @Ignore("Just for example test ")
    @Test
    fun FlowerModel2_TestValue2 ()
    {

        var categoryTest: String? = "Category"
        var priceTest: Double? = 100.50
        var instructionsTest: String? = "no instraction"
        var photo: String? = null
        var name: String? = "Rose Flower"
        var productId: Int? = 5555



        // this is where we create  our  the test cretira result

        assertEquals(flowerModel2.category, (categoryTest))
        assertEquals(flowerModel2.price, (priceTest))
        assertEquals(flowerModel2.instructions, (instructionsTest))
        assertEquals(flowerModel2.photo, (photo))
        assertEquals(flowerModel2.name, (name))
        assertEquals(flowerModel2.productId, productId )

    }




    @After
    fun cleansUp ()
    {

    }

}