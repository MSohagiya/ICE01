/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * @modified by Maharshi Sohagiya
 * @date February 2,2022
 * Student ID: 991619583
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("clubs");
        
        Card twoHearts = new Card("Hearts", 2);
        twoHearts.setSuit("hearts");
        
        Card fiveSpades = new Card("Spades", 5);
        fiveSpades.setSuit("spades");
        
        Card fourDiamonds = new Card("Diamonds", 4);
        fourDiamonds.setSuit("diamonds");
    }
}
