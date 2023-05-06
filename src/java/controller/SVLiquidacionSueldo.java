/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import services.LiquidacionSueldo_Service;


/**
 *
 * @author micke
 */
@WebServlet(name = "SVLiquidacionSueldo", urlPatterns = {"/SVLiquidacionSueldo"})
public class SVLiquidacionSueldo extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSLiquidacionSueldo/LiquidacionSueldo.wsdl")
    private service.LiquidacionSueldo_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSLiquidacionSueldo/LiquidacionSueldo.wsdl")
    private LiquidacionSueldo_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
              try (PrintWriter out = response.getWriter()) {
                  
                  
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
             out.println("<div style=\"margin: 24px; padding: 24px; border: 1px solid #eee; border-radius: 2em; color: #546E7A\"><h1>Resultado</h1> ");
            if(verificarUsuario(request.getParameter("usuario"),request.getParameter("pass"))){
                out.println("<p>Usuario autorizado!</p>");
                if(request.getParameter("tipo_calculo").equals("bono_mov")){
                out.println("<p>Bono de movilización es:  $"  + bonoMovilizacion(Double.parseDouble(request.getParameter("sueldo_bruto")))+
                " pesos,");
               };
               if(request.getParameter("tipo_calculo").equals("bono_cum")){
                   out.println("<p>Su Bono de cumplimiento es:  $"  + bonoCumplimiento(Double.parseDouble(request.getParameter("sueldo_bruto")))+
                       " pesos,");
               };
               if(request.getParameter("tipo_calculo").equals("dcto_salud")){
                  out.println("<p>Su descuento de salud es:  $"  + dctoSalud(Double.parseDouble(request.getParameter("sueldo_bruto")))+
                       " pesos,");
               };
               if(request.getParameter("tipo_calculo").equals("dcto_afp")){
                  out.println("<p>Su descuento de AFP es:  $"  + dctoAfp(Double.parseDouble(request.getParameter("sueldo_bruto")))+
                       " pesos,");
               };
               if(request.getParameter("tipo_calculo").equals("sueldo_liquido")){
                  out.println("<p>Su sueldo líquido es:  $"  + calcularSueldoLiquido(Double.parseDouble(request.getParameter("sueldo_bruto")))+
                       " pesos,");
               };
            } else {
                out.println("<p>Usuario NO autorizado a ejecutar consulta</p>");
            }
     
              
        
            out.println( "</p><form action=\"index.jsp\" method=\"\"><input style=\"color:#fff; padding: 10px 20px; background: #28892b; border: none; border-radius: 3em; cursor: pointer\" type=\"submit\" value=\"VOLVER A CALCULAR\"  name=\"\" /></form></div>");
            out.println("</body>");
            out.println("</html>");
        }
              
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private double calcularSueldoLiquido(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        services.LiquidacionSueldo port = service.getLiquidacionSueldoPort();
        return port.calcularSueldoLiquido(sueldoBruto);
    }

    private double bonoCumplimiento(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.bonoCumplimiento(sueldoBruto);
    }

    private double bonoMovilizacion(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.bonoMovilizacion(sueldoBruto);
    }

    private double dctoAfp(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.dctoAfp(sueldoBruto);
    }

    private double dctoSalud(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.dctoSalud(sueldoBruto);
    }

    private Boolean verificarUsuario(java.lang.String nombreUsu, java.lang.String contraUsu) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.verificarUsuario(nombreUsu, contraUsu);
    }

    private double bonoCumplimiento_1(double sueldoBruto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LiquidacionSueldo port = service_1.getLiquidacionSueldoPort();
        return port.bonoCumplimiento(sueldoBruto);
    }


}
