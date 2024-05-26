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


public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       int prodid=Integer.parseInt(request.getParameter("productid"));
        ProductDao pd=new ProductDaoImpl();
		Product p1 = new Product();
		
		p1.setProdid(prodid);
		pd.deleteProduct(p1);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>"+p1+" deleted....</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
