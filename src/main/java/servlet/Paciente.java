package servlet;

import Adapter.Medico;
import Adapter.Usuario;
import Facade.AdminCitas;
import Facade.Facede;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

@WebServlet(
        name = "Paciente",
        urlPatterns = {"/verDisponibilidad","/reservar"}
)

public class Paciente extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/verDisponibilidad")) {
            String fecha = req.getParameter("fecha");
            String hora = req.getParameter("hora");
            ArrayList<Medico> lista = facade.Traer(fecha, hora);
            req.setAttribute("lista", lista);
            rd = req.getRequestDispatcher("/PedirCita2.jsp");
            rd.forward(req, resp);
        }else if(url.equalsIgnoreCase("/reservar")){
            String fecha = req.getParameter("fecha");
            String hora = req.getParameter("hora");
            String reserva = req.getParameter("reserva");
            String paciente = req.getParameter("paciente");
            System.out.print(paciente);
            facade.AgregarCita(reserva, fecha, hora, reserva);
        }

    }

}
