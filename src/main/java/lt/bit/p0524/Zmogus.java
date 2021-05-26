package lt.bit.p0524;

import java.util.Objects;

public class Zmogus extends Object {

    private String name;
    private String email;

    public Zmogus(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "vardas: " + name + ", email: " + email;
    }

    @Override
    public boolean equals(Object o) {
        // if (o == null) return false;
        if (!(o instanceof Zmogus)) return false;
        Zmogus z = (Zmogus) o;

        return
        Objects.equals(
              this.name == null ? "" : this.name.trim().replaceAll("\\s+", " ").toLowerCase(),
                z.name == null ?  "" :z.name.trim().replaceAll("\\s+", " ").toLowerCase()) &&
        Objects.equals(
                this.email == null ? "" :this.email.trim().toLowerCase(),
                z.email == null ? "" : z.email.trim().toLowerCase());

//        return this.name != null && z.name != null &&
//               this.name.trim().replaceAll("\\s+", "").equalsIgnoreCase(z.name.trim().replaceAll("\\s", "")) &&
//               this.email != null && z.email != null &&
//               this.email.trim().replaceAll("\\s+", "").equalsIgnoreCase(z.email.trim().replaceAll("\\s", ""));
    }

}
//        !(this.name == null ? "" : this.name).equals(z.name == null ? "" : z.name)
//        this.email == null || this.email.isEmpty() && z.email == null||z.email.isEmpty()
