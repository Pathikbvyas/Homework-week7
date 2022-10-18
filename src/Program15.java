public class Program15 {

    public static class Wall {


        public static void main(String[] args) {

            Wall wall = new Wall(5, 4);
            System.out.println("area= " + wall.getAreawithoutanyparameters());
            wall.setHeightwithoneparameteroftypedouble(-1.5);
            System.out.println("width= " + wall.getWidthwithoutanyparameters());
            System.out.println("height= " + wall.getHeightwithoutanyparameters());
            System.out.println("area= " + wall.getAreawithoutanyparameters());
        }

        private double width;
        private double height;

        public Wall() {
        }


        public Wall(double width, double height) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getWidthwithoutanyparameters() {
            return width;
        }

        public double getHeightwithoutanyparameters() {
            return height;
        }

        public void setWidthwithoneparameteroftypedouble(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public void setHeightwithoneparameteroftypedouble(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getAreawithoutanyparameters() {
            return width * height;
        }
    }

}

