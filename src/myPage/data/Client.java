package myPage.data;

import java.util.Date;

public class Client {
    public enum TypKonta{
        PRACOWNIK(1),
        ADMINISTRATOR(2),
        KLIENT(3);

        private int val;

        TypKonta(int val){
            this.val=val;
        }
    }

    private String imie;
    private String nazwisko;
    private String ulica;
    private String kod_pocztowy;
    private String miejscowosc;
    private Date data_urodzenia;
    private int telefon;
    private String e_mail;
    private int ilosc_punktow;
    private boolean p_p1;
    private boolean p_p2;
    private boolean p_p3;
    private boolean p_p4;
    private boolean p_p5;
    private boolean p_p6;
    private boolean p_p7;
    private boolean p_p8;
    private boolean p_p9;
    private String p_ocena_skory;
    private String p_rodzaj_jakosc;
    private String p_wrazliwosc;
    private String p_inne_uwagi;
    private String haslo;
    private String hasloPowtorz;
    private TypKonta typ_konta;

    public Client(){
        this.imie = "";
        this.nazwisko = "";
        this.ulica = "";
        this.kod_pocztowy = "";
        this.miejscowosc = "";
        this.data_urodzenia = new Date();
        this.telefon = 0;
        this.e_mail = "";
        this.ilosc_punktow = 0;
        this.p_p1 = true;
        this.p_p2 = true;
        this.p_p3 = true;
        this.p_p4 = true;
        this.p_p5 = true;
        this.p_p6 = true;
        this.p_p7 = true;
        this.p_p8 = true;
        this.p_p9 = true;
        this.p_ocena_skory = "";
        this.p_rodzaj_jakosc = "";
        this.p_wrazliwosc = "";
        this.p_inne_uwagi = "";
        this.haslo = "";
        this.hasloPowtorz = "";
    }

    public Client(
            //String imie,
            //String nazwisko,
            //String ulica,
            //int kod_pocztowy,
            //String miejscowosc,
            //Date data_urodzenia,
            //int telefon,
            String e_mail,
            //int ilosc_punktow,
            //boolean p_p1,
            //boolean p_p2,
            //boolean p_p3,
            //boolean p_p4,
            //boolean p_p5,
            //boolean p_p6,
            //boolean p_p7,
            //boolean p_p8,
            //boolean p_p9,
            //String p_ocena_skory,
            //String p_rodzaj_jakosc,
            //String p_wrazliwosc,
            //String p_inne_uwagi
            String haslo
            //String hasloPowtorz;
    ){
        this();
        this.e_mail = e_mail;
        this.haslo = haslo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getIlosc_punktow() {
        return ilosc_punktow;
    }

    public void setIlosc_punktow(int ilosc_punktow) {
        this.ilosc_punktow = ilosc_punktow;
    }

    public boolean isP_p1() {
        return p_p1;
    }

    public void setP_p1(boolean p_p1) {
        this.p_p1 = p_p1;
    }

    public boolean isP_p2() {
        return p_p2;
    }

    public void setP_p2(boolean p_p2) {
        this.p_p2 = p_p2;
    }

    public boolean isP_p3() {
        return p_p3;
    }

    public void setP_p3(boolean p_p3) {
        this.p_p3 = p_p3;
    }

    public boolean isP_p4() {
        return p_p4;
    }

    public void setP_p4(boolean p_p4) {
        this.p_p4 = p_p4;
    }

    public boolean isP_p5() {
        return p_p5;
    }

    public void setP_p5(boolean p_p5) {
        this.p_p5 = p_p5;
    }

    public boolean isP_p6() {
        return p_p6;
    }

    public void setP_p6(boolean p_p6) {
        this.p_p6 = p_p6;
    }

    public boolean isP_p7() {
        return p_p7;
    }

    public void setP_p7(boolean p_p7) {
        this.p_p7 = p_p7;
    }

    public boolean isP_p8() {
        return p_p8;
    }

    public void setP_p8(boolean p_p8) {
        this.p_p8 = p_p8;
    }

    public boolean isP_p9() {
        return p_p9;
    }

    public void setP_p9(boolean p_p9) {
        this.p_p9 = p_p9;
    }

    public String getP_ocena_skory() {
        return p_ocena_skory;
    }

    public void setP_ocena_skory(String p_ocena_skory) {
        this.p_ocena_skory = p_ocena_skory;
    }

    public String getP_rodzaj_jakosc() {
        return p_rodzaj_jakosc;
    }

    public void setP_rodzaj_jakosc(String p_rodzaj_jakosc) {
        this.p_rodzaj_jakosc = p_rodzaj_jakosc;
    }

    public String getP_wrazliwosc() {
        return p_wrazliwosc;
    }

    public void setP_wrazliwosc(String p_wrazliwosc) {
        this.p_wrazliwosc = p_wrazliwosc;
    }

    public String getP_inne_uwagi() {
        return p_inne_uwagi;
    }

    public void setP_inne_uwagi(String p_inne_uwagi) {
        this.p_inne_uwagi = p_inne_uwagi;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getHasloPowtorz() {
        return hasloPowtorz;
    }

    public void setHasloPowtorz(String hasloPowtorz) {
        this.hasloPowtorz = hasloPowtorz;
    }

    public TypKonta getTyp_konta() {
        return typ_konta;
    }

    public void setTyp_konta(String typKonta) {
        switch (typKonta){
            case "KLIENT":
                typ_konta = TypKonta.KLIENT;
                break;
            case "PRACOWNIK":
                typ_konta = TypKonta.PRACOWNIK;
                break;
            case "ADMINISTRATOR":
                typ_konta = TypKonta.ADMINISTRATOR;
                break;
            default:
                break;
        }
    }

    public String getTyp_konta_String(){
        String string;
            switch (typ_konta){
                case KLIENT:
                    string = "KLIENT";
                    break;
                case PRACOWNIK:
                    string = "PRACOWNIK";
                    break;
                case ADMINISTRATOR:
                    string = "ADMINISTRATOR";
                    break;
                default:
                    string = "nieznany";
                    break;
            }
        return string;
    }
}
