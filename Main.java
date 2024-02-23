package user;

public class Main {
    
    public static void main(String[] args) {
           
      User user = new User ( "aaa", "bbb");
      User user1 = new User();
      
      user.setUsername("LOL");
      user.setPassword("LIL");
      user.setStatus(false);
      user.setId(0);
      
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
    }
    
}
