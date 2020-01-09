<%@ page import="myPage.basicObjects.Nieobecnosc" %>
<%@ page import="myPage.data.dataBase.NieobecnoscData" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="myPage.data.others.SessionData" %>
<%@ page import="myPage.basicObjects.Usluga" %>
<%@ page import="myPage.data.dataBase.UslugaData" %>
<%@ page import="myPage.basicObjects.Wizyta" %>
<%@ page import="myPage.data.dataBase.WizytaData" %>
<%@ page import="myPage.basicObjects.Pracownik" %>
<%@ page import="java.awt.print.PrinterAbortException" %>
<%@ page import="myPage.data.dataBase.PracownikData" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <section id="wizyty_klient" class="bg-light-gray" style="margin:0;background-color:rgba(0,0,0,0.11);color:#ffffff;padding-bottom:20px;padding-top:20px;max-width:1140px;margin-right:auto;margin-left:auto;border-radius:20px;margin-bottom:30px;">
        <form action="${pageContext.request.contextPath}/ControllerVisitsAdder" method="post">

            <input class="form-control" type="date" name="data-wizyty" required="" style="margin:0;width:500px;margin-left:145px;margin-top:15px;" onChange="getHoursFormData();" requiredplaceholder="data Wizyty"></div>

            <script language='javascript' type='text/javascript'>
                function getHoursFormData() {
                    var a = 0;
                    document.getElementById("testField").innerHTML = "testField:" + a++;
                }
            </script>

            <table id="tablica_usług" class="table" cellspacing="0" width="100%" style="text-align: center;margin-bottom: 0;border: 3px solid #FFFFFF;width: 98%;max-width: 98%;margin-left: 12px;background-color: transparent;border-collapse: collapse;">
                <thead>
                <tr>
                    <th></th>
                    <th>GODZINA</th>
                    <th>STATUS</th>
                </tr>
                </thead>
                <tbody>
                <%
                    Wizyta wizyty = new Wizyta();
                    WizytaData temp;
                    try {
                        wizyty.getEverythingActual();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    HashMap<String, WizytaData> wizytyGodzinami = new HashMap<>();
                    String czas;
                    for(int h = 10; h<16 ;h++){
                        for(int m = 0; m <=30; m+=30){
                            czas = h + ":" + m;
                            wizytyGodzinami.put(czas, null);
                        }
                    }
                    wizytyGodzinami.put("17:00", null);

                    while (!wizyty.isEmpty()){
                        temp = wizyty.pop();
                        czas = temp.getGodzina().getHour() + ":" + temp.getGodzina().getMinute();

                        wizytyGodzinami.replace(czas, temp);
                    }

                %>

                <%
                    for(int h = 10; h<16 ;h++){
                        for(int m = 0; m <=30; m+=30){
                            czas = h + ":" + m;
                            temp = wizytyGodzinami.get("czas");
                            if(temp != null){
                                out.println("<tr><td></td>" +
                                        "<td>" + czas + "</td>" +
                                        "<td>" + "NIEDOSTEPNY" + "</td>" +
                                        "</tr>");
                            }else{
                                out.println("<tr><td> <input type=\"radio\" Name=\"wybrana_usluga\" Value =\"" + czas + "\"></td>" +
                                        "<td>" + czas + "</td>" +
                                        "<td>" + "DOSTEPNY" + "</td>" +
                                        "</tr>");
                            }
                        }
                    }
                    czas = "17:00";
                    temp = wizytyGodzinami.get(czas);
                    if(temp != null){
                        out.println("<tr><td></td>" +
                                "<td>" + czas + "</td>" +
                                "<td>" + "NIEDOSTEPNY" + "</td>" +
                                "</tr>");
                    }else{
                        out.println("<tr><td> <input type=\"radio\" Name=\"wybrana_usluga\" Value =\"" + czas + "\"></td>" +
                                "<td>" + czas + "</td>" +
                                "<td>" + "DOSTEPNY" + "</td>" +
                                "</tr>");
                    }
                %>
                </tbody>
            </table>

            <p id="testField">jakis tekst</p>

            <button class="btn btn-primary float-none align-self-center" type="submit" style="width:265px;position:static;text-align:center!important;margin-left:437px;margin-top:20px;">Zatwierdź Wizytę</button>
        </form>
        <a href="../ControllerAccount?page=wizyty"><button class="btn btn-primary float-none align-self-center" style="width:265px;position:static;text-align:center!important;margin-left:437px;margin-top:20px;">Powrót do wyboru usługi i pracownika</button></a>
        </section>
</html>