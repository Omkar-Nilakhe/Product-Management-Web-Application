package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

import oracle.net.aso.s;


public class UpdateProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateProdServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int prodid=Integer.parseInt(request.getParameter("prodid"));
		String prodname=request.getParameter("prodname");
		String category=request.getParameter("category");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		double price=Double.parseDouble(request.getParameter("price"));
		ProductDao pd=new ProductDaoImpl();
	    Product p1=new Product(prodid, prodname, category, quantity, price);
	    
		
		pd.updateProduct(p1);
		
		out.println("<h2>"+p1+" updated....</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
