/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.User;

/**
 *
 * @author Meriem
 */
public class UserService  extends AbstractFacade<User> {

    public UserService() {
        super(User.class);
    }
    public int creerUser(String id,String password){
        User user=new User(id, password);
        create(user);
        return 1;
    }
        public int seConnecter(User user){
        User loadUser=find(user.getId());
        if(loadUser==null){
            return -1;
        }else if(!(loadUser.getPassword().equals(user.getPassword()))){
            return -2;
        }
            return 1;
       
    }
    
//     public int seConnecter(User user){
//        User loadUser=find(user.getId());
//        if(loadUser==null){
//            return -1;
//        }else if(!(loadUser.getPassword().equals(HashageUtil.sha256(user.getPassword())))){
//            return -2;
//        }
//            return 1;
//       
//    }
//     
//     @Override
//    public void create(User user){
//        user.setPassword(HashageUtil.sha256(user.getPassword()));
//        super.create(user);
//    }
    
//    public static void main(String[] args) {
//        System.out.println("creerUser");
//        String id = "Bariz";
//        String password = "Meriem";
//        UserService instance = new UserService();
//        instance.creerUser(id, password);
//    }
}
    