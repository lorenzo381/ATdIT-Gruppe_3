/*package library.persistence.implementation;
//import library.persistence.Service;
//import library.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseREAD implements Service {
    public static List<register> getRegister() throws ServiceException{
        ArrayList<register> registerArrayList = new ArrayList<register>();
        String sql = "SELECT note FROM register";
        try /*(Connection connection = DBConnect.connect();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql)) {
            Connection connection = DBConnect.connect();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);    //Methode zur Abfrage der einzelnen Informationen aus der Datenbank
            System.out.println(result.getInt("note"));


/*
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            while(result.next()){
                Resident resident = new Resident(
                        result.getInt("resID"),result.getString("name"),
                        result.getString("surname"),result.getInt("age"),
                        result.getInt("stationID"),result.getInt("room"));
                residentArrayList.add(resident);
                result.next();
            }

        }catch (SQLException e){
            System.out.println(e);
        }
        return registerArrayList;
    }

    public static void main(String[] args){
        List<register> register = new ArrayList<register>();
        try {
            register = DatabaseREAD.getRegister();
        } catch (ServiceException e){
            System.out.println(e);
        }
        if(!residents.isEmpty()){
            for(Register register: register){
                System.out.println(register.toString());
            }
        }else
            System.out.println("fail");
    }

        } */