package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;



public class Displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Displayservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDao pd=new ProductDaoImpl();
		
		  List<Product> plist = pd.viewallproducts();
           System.out.println(plist);
	        // Set the product list as an attribute in the request
           request.setAttribute("prodlist", plist);

            
	        // Forward the request to the JSP page
	        RequestDispatcher rd=
	        request.getRequestDispatcher("displayProduct.jsp");
	        rd.forward(request, response);
	    }
	
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
