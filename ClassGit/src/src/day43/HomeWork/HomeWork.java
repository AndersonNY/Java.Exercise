package src.day43.HomeWork;

public class HomeWork {

    // Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there

    }

    class Book {

        public String name;
        public String author;
        public int pages;
        private boolean bestSeller;

        public void setBestSeller(boolean bestSeller) {
            this.bestSeller = bestSeller;
        }

        public boolean isBestSeller() {
            return bestSeller;
        }

        public Book(String name, String author, int pages, boolean bestSeller) {
            this.name = name;
            this.author = author;
            this.pages = pages;
            this.bestSeller = bestSeller;
        }

        public int price() {
            return 10;
        }

        public String bookProfile() {
            return "Book name: " + name + "\n"
                    + "Author: " + author + "\n"
                    + "Page number: " + pages + "\n"
                    + "Bestseller: " + bestSeller + "\n"
                    + "Price: $" + price() + "\n\n";
        }
    }

    class ChildrenBook extends Book {

        public ChildrenBook(String name, String author, int pages, boolean bestSeller) {
            super(name, author, pages, bestSeller);
        }

        @Override
        public int price() {
            return super.price() - 3;
        }
    }

    class Comics extends Book {

        public Comics(String name, String author, int pages, boolean bestSeller) {
            super(name, author, pages, bestSeller);
        }

        @Override
        public int price() {
            return super.price() - 5;
        }
    }

    class OnlineCart {
        public static void main(String[] args) {

            Book kidsBook1 = new ChildrenBook("Journey to the Center of the Earth", "Jules Verne", 183, true);
            System.out.println(kidsBook1.bookProfile());

            Book comic1 = new Comics("Batman", "Bob Kane", 113, true);
            System.out.println(comic1.bookProfile());

        }
    }



