package myPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(description = "kontroler do obsługi logowania klientow", urlPatterns = { "/UserRegister" })
public class ControllerRegister extends HttpServlet {
    private HttpSession session;

    public ControllerRegister(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session = request.getSession();
        if(session.getAttribute("userData") != null){
            System.out.println("najpierw sie wyloguj");
            response.sendRedirect("logowanie.jsp");
            return;
        }

        Client inputData = new Client();
        inputData.setE_mail(request.getParameter("e-mail"));
        inputData.setHaslo(request.getParameter("haslo"));
        inputData.setHasloPowtorz(request.getParameter("powtorz-haslo"));
        inputData.setImie(request.getParameter("imie"));
        inputData.setNazwisko(request.getParameter("nazwisko"));
        System.out.println(request.getParameter("data-urodzenia"));

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(request.getParameter("data-urodzenia"));
            inputData.setData_urodzenia(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        inputData.setTelefon(Integer.parseInt(request.getParameter("telefon")));
        inputData.setUlica(request.getParameter("ulica"));
        inputData.setKod_pocztowy(Integer.parseInt(request.getParameter("kod")));
        inputData.setMiejscowosc(request.getParameter("miejscowosc"));

        if(inputData.getHaslo().compareTo(inputData.getHasloPowtorz()) != 0){
            System.out.println("hasla nie sa takie same");
            response.sendRedirect("rejestracja.jsp");
            return;
        }

        DataSource dataSource = new DataSource();
        User user = dataSource.getUserDB(inputData.getE_mail());

        if(user != null){
            System.out.println("urzytkownik o podanym niku juz istnieje");
            response.sendRedirect("rejestracja.jsp");
            return;
        }

        Encrypter pws = new Encrypter();
        String encryptedPasswd = pws.encrypt(inputData.getHaslo());
        inputData.setHaslo(encryptedPasswd);
        inputData.setHasloPowtorz(encryptedPasswd);

        dataSource.createClientDB(inputData);

        response.sendRedirect("logowanie.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}