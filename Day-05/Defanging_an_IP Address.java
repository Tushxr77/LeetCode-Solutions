class Solution {
    public String defangIPaddr(String address) {
       String defanged_IP = address.replace("." , "[.]");
       return  defanged_IP;
    }
}
