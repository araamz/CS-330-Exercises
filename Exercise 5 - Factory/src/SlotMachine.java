public abstract class SlotMachine
{

    private String name;
    private String cabinet;
    private String OS;
    private String display;
    private String payment;
    private String GPU;

   public void setname(String Newname)
    {
        name = Newname;



    }
     public void setCabinet(String Newcabinet)
    {
        cabinet = Newcabinet;

    }
     public void setOS(String NewOS)
    {
        OS= NewOS;



    }
     public void setDisplay(String Newdisplay)
    {
        display = Newdisplay;

    }
     public void setPayment(String NewPayment)
    {
        payment = NewPayment;

    }
     public void setGPU(String NewGPU)
    {
        GPU = NewGPU;

    }
    public String getname()
    {

          return name;

    }
     public String getcabinet()
    {

          return cabinet;
    }
     public String getOS()
    {

          return OS;
    }
     public String getdisplay()
    {

          return display;
    }
     public String getpayment()
    {

          return payment;
    }
     public String getGPU()
    {

          return GPU;


    }
}