package gr.codehub.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ui ui = new Ui();
        Basket basket = new Basket();
        ui.manageBasket(basket);
    }

}
