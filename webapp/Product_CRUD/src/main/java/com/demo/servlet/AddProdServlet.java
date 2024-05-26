package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;


public class AddProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodid=Integer.parseInt(request.getParameter("prodid"));
		String prodname=request.getParameter("prodname");
		String category=request.getParameter("category");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		double price=Double.parseDouble(request.getParameter("price"));
		Product p1=new Product(prodid, prodname, category, quantity, price);
		
		ProductDao pd=new ProductDaoImpl(); 
		pd.addProduct(p1);
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>"+p1+" added....</h2>");
		
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
