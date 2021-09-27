public class Main {

    enum Size {

        SMALL, MEDİUM, LARGE, EXTRALARGE;

        public String getSize(){
            switch (this) {
                case SMALL:
                    return "küçük";
                case MEDİUM:
                    return "orta";
                case LARGE:
                    return "büyük";
                case EXTRALARGE:
                    return "ekstra büyük";
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Pizzanın boyutu " + Size.MEDİUM.getSize());

    }
}
