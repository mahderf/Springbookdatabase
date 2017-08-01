package bookdb.bookdatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class newController {

    @RequestMapping("/")
    public @ResponseBody String welcome()
    {
        return "Welcome to the book database";
    }
    @RequestMapping("/findbooks")
    public @ResponseBody String findbooks()
    {
        return "Select Catagory";
    }
    @RequestMapping("/findbooksbyauthor")
    public @ResponseBody String byauthor()
    {
        return "Select Author";
    }
    @RequestMapping("/findbooksbysku")
    public @ResponseBody String bysku()
    {
        return "Select SKU";
    }
    @RequestMapping("/addbook")
    public @ResponseBody String addbook()
    {
        return "This is where to add books";
    }
    @RequestMapping ("/deletebook")
    public @ResponseBody String deletebook()
    {
        return "This where to delete books";
    }
    @RequestMapping ("/showallbooks")
    public @ResponseBody String showbooks()
    {
        return "This is the list of al books";
    }
}
