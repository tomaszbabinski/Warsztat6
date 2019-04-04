package pl.coderslab.warsztat6.filter;

import org.springframework.web.filter.OncePerRequestFilter;
import pl.coderslab.warsztat6.entity.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



@WebFilter(description = "Check if user is logged in and if not then redirect", urlPatterns = { "/*" })
public class LoggedInCheckFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        final HttpServletRequest request = httpServletRequest;
        final String url = request.getRequestURL().toString();

        if(allowedToEveryone(url)){
            filterChain.doFilter(httpServletRequest,httpServletResponse);
            return;
        }

        HttpSession session = request.getSession();
        User user  = (User) session.getAttribute("loggedInUser");

        if(user==null){
            HttpServletResponse response = httpServletResponse;
            httpServletResponse.sendRedirect(request.getContextPath()+ "/user/login");
            return;
        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

    private boolean allowedToEveryone(String url) {
        if(url.endsWith("/user/register") || (url.endsWith("/user/login"))){
            return true;
        }
        return false;
    }
}
