public class Main {
    public static void main(String[] args) {


    }
}

/*

Каждая новая фича — это отдельная ветка от dev.

git checkout -b feature/название-фичи dev
Пример:


git checkout -b feature/authentication dev



После завершения работы:

git add .
git commit -m "Add authentication feature"
git checkout dev
git merge feature/authentication
git push*/
