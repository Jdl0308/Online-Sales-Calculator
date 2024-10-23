// Online Sales Platform Calculator
// Written By James L

import javax.swing.*;

public class SalesCalculator
{
    public static void main(String[] args)
    {
        // Variables Declared
        char option;
        double ebayfee;
        double depopfee;
        double grailedfee;
        double ebayprofit;
        double depopprofit;
        double grailedprofit;
        double ebaypayout;
        double depoppayout;
        double grailedpayout;
        String input;

        // What price do you want to sell the item for
        input = JOptionPane.showInputDialog("What is your target sales price?");
        double soldprice = Double.parseDouble(input);

        // Find out what the item was originally purchased for
        input = JOptionPane.showInputDialog("What was the price the item was originally purchased for?" +
                                            "\n (Enter 0 if not known or not concerned for profit)");
        double purchasedprice = Double.parseDouble(input);

        // Find out the type of item seller is selling
        input = JOptionPane.showInputDialog("Please Enter the option on what you are selling:" +
                "\n Option A - Trading Cards, Tools, and Automobile Parts" +
                "\n Option B - Books and Magazines" +
                "\n Option C - Coins and Paper Money" +
                "\n Option D - Purses and Bags" +
                "\n Option E - Jewelery and Watches" +
                "\n Option E - Jewelery and Watches" +
                "\n Option F - Shoes" +
                "\n Option G - Clothing (Hoodies,Shirts,Pants,Etc" );
        option = input.charAt(0);

        // Determine the fees that will be taken and calculate profit and payout
        switch (option)
        {
            case 'A':
            case 'a':
                ebayfee = .1325;
                grailedfee = .09;
                depopfee = .1;
                ebaypayout = soldprice - (soldprice * ebayfee)  ;
                depoppayout = soldprice - (soldprice * depopfee)  ;
                grailedpayout = soldprice - (soldprice * grailedfee)  ;
                ebayprofit = ebaypayout - purchasedprice  ;
                depopprofit = depoppayout - purchasedprice  ;
                grailedprofit = grailedpayout - purchasedprice  ;
                System.out.printf("Your payout is estimated to be this on these platforms:" +
                        "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                        "\n Depop Payout: $%.2f     Profit:$%.2f" +
                        "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                        "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                break;

                case 'B':
                case 'b':
                    ebayfee = .1495;
                    grailedfee = .09;
                    depopfee = .1;
                    ebaypayout = soldprice - (soldprice * ebayfee)  ;
                    depoppayout = soldprice - (soldprice * depopfee)  ;
                    grailedpayout = soldprice - (soldprice * grailedfee)  ;
                    ebayprofit = ebaypayout - purchasedprice  ;
                    depopprofit = depoppayout - purchasedprice  ;
                    grailedprofit = grailedpayout - purchasedprice  ;
                    System.out.printf("Your payout is estimated to be this on these platforms:" +
                            "\n Ebay    Payout: $%.2f   Profit:$%.2f" +
                            "\n Depop   Payout: $%.2f   Profit:$%.2f" +
                            "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                            "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                    break;

                    case 'C':
                    case 'c':
                        ebayfee = .1325;
                        grailedfee = .09;
                        depopfee = .1;
                        ebaypayout = soldprice - (soldprice * ebayfee)  ;
                        depoppayout = soldprice - (soldprice * depopfee)  ;
                        grailedpayout = soldprice - (soldprice * grailedfee)  ;
                        ebayprofit = ebaypayout - purchasedprice  ;
                        depopprofit = depoppayout - purchasedprice  ;
                        grailedprofit = grailedpayout - purchasedprice  ;
                        System.out.printf("Your payout is estimated to be this on these platforms:" +
                                "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                                "\n Depop Payout: $%.2f     Profit:$%.2f" +
                                "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                                "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                        break;

                        case 'D':
                        case 'd':
                            ebayfee = .15;
                            grailedfee = .09;
                            depopfee = .1;
                            ebaypayout = soldprice - (soldprice * ebayfee)  ;
                            depoppayout = soldprice - (soldprice * depopfee)  ;
                            grailedpayout = soldprice - (soldprice * grailedfee)  ;
                            ebayprofit = ebaypayout - purchasedprice  ;
                            depopprofit = depoppayout - purchasedprice  ;
                            grailedprofit = grailedpayout - purchasedprice  ;
                            System.out.printf("Your payout is estimated to be this on these platforms:" +
                                    "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                                    "\n Depop Payout: $%.2f     Profit:$%.2f" +
                                    "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                                    "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                            break;

                            case 'E':
                            case 'e':
                                ebayfee = .15;
                                grailedfee = .09;
                                depopfee = .1;
                                ebaypayout = soldprice - (soldprice * ebayfee)  ;
                                depoppayout = soldprice - (soldprice * depopfee)  ;
                                grailedpayout = soldprice - (soldprice * grailedfee)  ;
                                ebayprofit = ebaypayout - purchasedprice  ;
                                depopprofit = depoppayout - purchasedprice  ;
                                grailedprofit = grailedpayout - purchasedprice  ;
                                System.out.printf("Your payout is estimated to be this on these platforms:" +
                                        "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                                        "\n Depop Payout: $%.2f     Profit:$%.2f" +
                                        "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                                        "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                                break;

                                case 'F':
                                case 'f':
                                    ebayfee = .08;
                                    grailedfee = .09;
                                    depopfee = .1;
                                    ebaypayout = soldprice - (soldprice * ebayfee)  ;
                                    depoppayout = soldprice - (soldprice * depopfee)  ;
                                    grailedpayout = soldprice - (soldprice * grailedfee)  ;
                                    ebayprofit = ebaypayout - purchasedprice  ;
                                    depopprofit = depoppayout - purchasedprice  ;
                                    grailedprofit = grailedpayout - purchasedprice  ;
                                    System.out.printf("Your payout is estimated to be this on these platforms:" +
                                            "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                                            "\n Depop Payout: $%.2f     Profit:$%.2f" +
                                            "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                                            "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                                    break;

                                    case 'G':
                                    case 'g':
                                        ebayfee = .129;
                                        grailedfee = .09;
                                        depopfee = .1;
                                        ebaypayout = soldprice - (soldprice * ebayfee)  ;
                                        depoppayout = soldprice - (soldprice * depopfee)  ;
                                        grailedpayout = soldprice - (soldprice * grailedfee)  ;
                                        ebayprofit = ebaypayout - purchasedprice  ;
                                        depopprofit = depoppayout - purchasedprice  ;
                                        grailedprofit = grailedpayout - purchasedprice  ;
                                        System.out.printf("Your payout is estimated to be this on these platforms:" +
                                                "\n Ebay Payout: $%.2f      Profit:$%.2f" +
                                                "\n Depop Payout: $%.2f     Profit:$%.2f" +
                                                "\n Grailed Payout: $%.2f   Profit:$%.2f" +
                                                "\n Remember shipping is not taken into account", ebaypayout, ebayprofit, depoppayout, depopprofit, grailedpayout, grailedprofit);
                                        break;
        }
    }
}