public abstract class ServiceWorkers  extends Employee  {
    String document;

    public ServiceWorkers(String name, String mobilephone, int age,String document) {
        super(name, mobilephone, age);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public abstract void calis (String girisSaati, String cikisSaati);



}
