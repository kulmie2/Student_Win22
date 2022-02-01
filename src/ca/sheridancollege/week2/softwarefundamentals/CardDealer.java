/*
 * Author: Sharif Kulmie
 * Student ID: 991637947
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card cardObject = new Card("Spades", 10);
        cardObject.setValue(11);
        System.out.println("The Card Suit" + cardObject.getSuit() + " and the value is " + cardObject.getValue());
        
        Card newCardObject = new Card("Heart", 7);
        System.out.println("The Card Suit" + newCardObject.getSuit() + " and the value is " + newCardObject.getValue());
    }
}
