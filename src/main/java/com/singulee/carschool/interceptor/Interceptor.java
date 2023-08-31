//微信：egvh56ufy7hh ，QQ：821898835


//如果是登录页面则放行
        if (request.getRequestURI().equals("/login/login") || request.getRequestURI().equals("/login/getCode")
                || (request.getRequestURI().equals("/login/resetPassword") && session.getAttribute("smscode") != null)
        ) {
            return true;
        }
//如果用户已登录也放行
        if (session.getAttribute("user") != null) {
            return true;
        }
//用户没有登录挑转到登录页面
        response.sendRedirect("/login.html");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
