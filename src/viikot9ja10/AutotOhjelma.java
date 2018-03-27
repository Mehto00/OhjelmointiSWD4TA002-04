package viikot9ja10;

import viikot7ja8.Lukija;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AutotOhjelma {

    private Lukija lukija = new Lukija();
    String timeStamp = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
    int year = Integer.parseInt(timeStamp);

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement stmtPrep = null;
    private String sql;

    private void showOptions() {

        int options = 0;

        do {
            System.out.println("1. Näytä kaikki autot");
            System.out.println("2. Lisää auto");
            System.out.println("3. Muuta auto");
            System.out.println("4. Poista auto");
            System.out.println("0. Lopetus\n");

            options = lukija.lueKokonaisluku("Anna valintasi (0-4): ");

            switchBoard(options);

        } while (options !=0);
    }

    private void switchBoard(int options) {
        String userChose;
        switch (options) {
            case 1:  userChose = "1";
                nautaAutot();
                break;
            case 2:  userChose = "2";
                lisaaAuto();
                break;
            case 3:  userChose = "3";
                muutaAuto();
                break;
            case 4:  userChose = "4";
                poistaAuto();
                break;
            case 5:  userChose = "0";
                System.out.println(userChose + ": Lopetit ohjelman");
                break;

            default: userChose = "Väärä syöte: annettu luku ei kelpaa";
                break;
        }
    }

    private void poistaAuto() {
        nautaAutot();
        String rekno = lukija.lueTeksti("Anna poistettavan auton rekisterinumero (formaatissa ABC-123): ");
        sql = "SELECT * FROM autot WHERE rekno=?";

        try {
            con=yhdista();
            if (con != null) {
                stmtPrep = con.prepareStatement(sql);
                stmtPrep.setString(1,rekno);
                rs = stmtPrep.executeQuery();
                if (rs.isBeforeFirst()){
                    rs.next();
                    if(lukija.lueTeksti("Haluatko varmasti poistaa tiedot kannasta? (k/e): ").equals("k")){
                        sql="DELETE FROM autot WHERE rekno =?";
                        stmtPrep=con.prepareStatement(sql);
                        stmtPrep.setString(1, rekno);
                        stmtPrep.executeUpdate();

                        System.out.println("\n");
                        System.out.println("Tiedot poistettu");
                        System.out.println("\n");

                        con.close();
                    } else {
                        System.out.println("\n");
                        System.out.println("Antamasi arvot eivät kelpaa");
                        System.out.println("\n");
                    }
                }
            } else {
                System.out.println("Antamaasi rekisterinumeroa ei löydy tietokannasta");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void muutaAuto() {
        String rekno = lukija.lueTeksti("Anna muutettavan auton rekisterinumero (formaatissa ABC-123): ");
        sql = "SELECT * FROM autot WHERE rekno=?";

        try {
            con=yhdista();
            if (con != null) {
                stmtPrep = con.prepareStatement(sql);
                stmtPrep.setString(1,rekno);
                rs = stmtPrep.executeQuery();
                if (rs.isBeforeFirst()){
                    String merkki = lukija.lueTeksti("Anna auton uusi merkki: ");
                    String malli = lukija.lueTeksti("Anna auton uusi malli: ");
                    int vuosi = lukija.lueKokonaisluku("Anna auton uusi vuosimalli: ");
                    if(rekno.length() == 7 && vuosi >= 1769 && vuosi <= year){
                        sql="UPDATE autot SET merkki=?, malli=?, vuosi=? WHERE rekno =?";
                        stmtPrep=con.prepareStatement(sql);
                        stmtPrep.setString(1,merkki);
                        stmtPrep.setString(2,malli);
                        stmtPrep.setInt(3,vuosi);
                        stmtPrep.setString(4,rekno);
                        stmtPrep.executeUpdate();

                        System.out.println("\n");
                        System.out.println("Muokatut tiedot tallennettu");
                        System.out.println("\n");

                        con.close();
                    } else {
                        System.out.println("\n");
                        System.out.println("Antamasi arvot eivät kelpaa");
                        System.out.println("\n");
                    }
                }
            } else {
                System.out.println("Antamaasi rekisterinumeroa ei löydy tietokannasta");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void lisaaAuto() {
       String rekno = lukija.lueTeksti("Anna uuden auton rekisterinumero (formaatissa ABC-123): ");
       String merkki = lukija.lueTeksti("Anna uuden auton merkki: ");
       String malli = lukija.lueTeksti("Anna uuden auton malli: ");
       int vuosi = lukija.lueKokonaisluku("Anna uuden auton vuosimalli: ");

       if(rekno.length() == 7 && vuosi >= 1769 && vuosi <= year){
            sql="INSERT INTO autot VALUES(?,?,?,?)";
            try {
                con = yhdista();
                stmtPrep=con.prepareStatement(sql);
                stmtPrep.setString(1,rekno);
                stmtPrep.setString(2,merkki);
                stmtPrep.setString(3,malli);
                stmtPrep.setInt(4,vuosi);
                stmtPrep.executeUpdate();

                System.out.println("\n");
                System.out.println("Uusi auto tallennettu");
                System.out.println("\n");

                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

       } else {
           System.out.println("\n");
           System.out.println("Antamasi arvot eivät kelpaa");
           System.out.println("\n");
       }
    }

    private void nautaAutot() {
        sql = "SELECT * FROM autot";
        try {
            con=yhdista();
            if (con != null) {
                stmtPrep = con.prepareStatement(sql);
                rs = stmtPrep.executeQuery();
                if (rs!=null) {
                    System.out.println();
                    while (rs.next()) {
                        System.out.println(rs.getString(1) + "\t");
                        System.out.println(rs.getString(2) + "\t");
                        System.out.println(rs.getString(3) + "\t");
                        System.out.println(rs.getString(4) + "\t");
                        System.out.println();
                    }
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection yhdista() {
        Connection sqlConnection = null;
        String JDBCADriver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mysql://localhost:15001/a1303465";
        String USER = "a1303465";
        String PASS = "MINUN-OMA-SALASANA";

        try {
            Class.forName(JDBCADriver);
            sqlConnection = DriverManager.getConnection(url, USER, PASS);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return sqlConnection;
    }

    public AutotOhjelma() {
        showOptions();
    }

    public static void main(String[] args) {
        new AutotOhjelma();
    }

}
