/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SortControl", urlPatterns = {"/sort"})
public class SortControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String type = request.getParameter("type");
        if (type.equals("1")) {
            ProductDAO dao = new ProductDAO();
            int count = dao.count();
            int size = 6;
            String page = request.getParameter("page");
            int endPage = count / size;
            if (count % size != 0) {
                endPage++;
            }
            if (page == null) {
                page = "1";
            }
            int pTid = Integer.parseInt(page);
            List<Product> list2 = dao.pagingProductBySortLow(pTid);
            request.setAttribute("listP", list2);
            request.setAttribute("endPage", endPage);
            request.setAttribute("page", page);
            request.setAttribute("type", type);
            request.getRequestDispatcher("HomeSort.jsp").forward(request, response);
        }
        if (type.equals("2")) {
            ProductDAO dao = new ProductDAO();
            int count = dao.count();
            int size = 6;
            String page = request.getParameter("page");
            int endPage = count / size;
            if (count % size != 0) {
                endPage++;
            }
            if (page == null) {
                page = "1";
            }
            int pTid = Integer.parseInt(page);
            List<Product> list2 = dao.pagingProductBySortHigh(pTid);
            request.setAttribute("listP", list2);
            request.setAttribute("endPage", endPage);
            request.setAttribute("page", page);
            request.setAttribute("type", type);
            request.getRequestDispatcher("HomeSort.jsp").forward(request, response);
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

}
