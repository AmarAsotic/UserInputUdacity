package com.example.android.justjava;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity=quantity+1;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        quantity=quantity-1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        int price = calculatePrice();
        //String priceMessage = "Total: $" + price;
        //priceMessage = priceMessage + "\nThank you!";
        //displayMessage(priceMessage);
        displayMessage(createOrderSummary(price));
    }

    /**
     * Calculates the price of the order.
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    private String createOrderSummary(int price) {
        return "Amar Asotic" + "\nQuantity: " + quantity + "\nTotal: $" + price + "\nThank you!";
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}