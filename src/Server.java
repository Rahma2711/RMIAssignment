public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
    @Override
    public String  reverse(String R) {
        return new StringBuilder(R).reverse().toString();
}
    @Override
    public char MinChar(String R){
        char ch =R.charAt(0);
        for (int i = 1; i <R.length()  ; i++) {
            if(R.charAt(i) < ch){
                ch=R.charAt(i);
            }
        }
        return ch;
    }
    @Override
    public String CaseChanger(String R){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < R.length() ; i++) {
            if(R.charAt(i) >='a' && R.charAt(i) <='z'){
                res.append((char)(R.charAt(i) - 32));

            }else if(R.charAt(i) >='A' && R.charAt(i) <='Z'){
                res.append((char)(R.charAt(i) + 32));

            }else{
                res.append(R.charAt(i));
            }
        }

        return res.toString();
    }

}
