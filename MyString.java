 interface MyString {

    public int length();
    public char charAt(int i);
    public MyString substring(int start,int end);
}
 class SimpleMyString implements MyString{
    private char[] a;
    private SimpleMyString(){}
    public SimpleMyString(boolean b){
        a=b ? new char[] {'t','r','u','e'}
            : new char[] {'f','a','l','s','e'};
    }
    public int length()      {   return a.length;   }

    public char charAt(int i) {  return a[i];   }
    public MyString substring(int start,int end){
        SimpleMyString that=new SimpleMyString();
        that.a=new char[end-start];
        System.arraycopy(this.a,start,that.a,0,end-start);
        return that;
    }
}
class FastMyString implements MyString{
    private char[] a;
    private int start;
    private int end;

    private FastMyString(){}

    public FastMyString(boolean b){
        a=b ? new char[] {'t','r','u','e'}
            : new char[] {'f','a','l','s','e'};
        start=0;
        end=a.length;
    }
    public int length() {  return end-start; }

    public char charAt(int i){  return a[start+i]; }

    public MyString substring(int start,int end){
        FastMyString that=new FastMyString();
        that.a=this.a;
        that.start=that.start+start;
        that.end=this.start+end;
        return that;
    }
}
