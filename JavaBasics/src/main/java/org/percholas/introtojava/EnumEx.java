package org.percholas.introtojava;

public class EnumEx {
    enum cards
    {
        spade, club, heart, diamond;
    }

    public static void main(String[] args) {
        /* stored each of the enumerators in the reference variables
        a1,a2,a3,a4 respectively.  note that the new keyword was not used here  */
        cards a1 = cards.spade;
        cards a2 = cards.club;
        cards a3 = cards.heart;
        cards a4 = cards.diamond;

        System.out.println("Enumerators are: "+ a1 + "," + a2 + "," +  a3 + "," + a4);
        System.out.println("----- printing using enhanced loop -----");
        for (cards index:cards.values()) {
            System.out.println(index);
        }

        MyDatabaseConnection db = MyDatabaseConnection.ORACLEDB;
        System.out.println(db);
        System.out.println(db.getEstablishDatabaseConnection());


    }
}
