# 🎮 Naymathullah’s Java Games – README

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk\&logoColor=white)
![Games](https://img.shields.io/badge/Category-Games-blue)
![Status](https://img.shields.io/badge/Status-Active-success)
![Contributions](https://img.shields.io/badge/Contributions-Welcome-brightgreen)

> Hi! I’m **Naymathullah**. I build small to medium-scale **games in Java** and I’m on a journey to become a **Java developer**. This repository (or monorepo) contains my game projects, experiments, and learning notes.

---

## 📚 Table of Contents

* [About the Repo](#-about-the-repo)
* [Games](#-games)
* [How to Run](#-how-to-run)

  * [Run with `java`/`javac`](#run-with-javajavac)
  * [Run with Gradle](#run-with-gradle)
  * [Run with Maven](#run-with-maven)
* [Tech Stack](#-tech-stack)
* [Project Structure](#-project-structure)
* [Roadmap](#-roadmap)
* [Contributing](#-contributing)
* [Learning Notes](#-learning-notes)
* [Contact](#-contact)
* [License](#-license)

---

## 🧭 About the Repo

This repository is focused **only on games** written in **Java**. It includes:

* Console-based games for fundamentals
* Swing/JavaFX desktop games for UI practice
* Algorithmic/problem-solving mini-games
* Experiments with game loops, OOP design, and basic physics

Each game lives in its own folder with source code and a short README explaining rules and controls.

---

## 🕹️ Games

> Add your games here with a one-line description and how to run them.

* **Simon Says** – Memory & sequence replication game. `console`/`swing`
* **Rock Paper Scissors** – Classic RPS with multiple rounds and scoring. `console`
* **Memory Match** – Flip-and-match pairs with a timer. `swing`
* **Number Guessing** – Randomized guessing with difficulty levels. `console`

*Tip: Link each item to its folder once you push the code.*

---

## 🚀 How to Run

Make sure you have **Java 17+** installed (or your project’s target version). Each game should be runnable via one of the following methods.

### Run with `java`/`javac`

```bash
# Compile
javac -d out src/main/java/**/*.java

# Run (replace with your main class)
java -cp out com.example.game.Main
```

### Run with Gradle

```bash
# From the game folder
./gradlew run            # macOS/Linux
gradlew.bat run          # Windows

# Or build a jar
./gradlew jar
java -jar build/libs/<game-name>-all.jar
```

### Run with Maven

```bash
mvn clean package
java -jar target/<game-name>-jar-with-dependencies.jar
```

> Each game folder includes its own build file if needed (`build.gradle` / `pom.xml`).

---

## 🧱 Tech Stack

* **Language:** Java (Core Java, OOP)
* **UI (when used):** Swing, JavaFX
* **Build Tools:** Gradle / Maven
* **Testing:** JUnit (where applicable)
* **Utilities:** `java.util.Random`, collections, file I/O

---

## 🗂️ Project Structure

```
/ (root)
├── simon-says/
│   ├── src/main/java/...
│   ├── README.md
│   └── build.gradle | pom.xml
├── rock-paper-scissors/
├── memory-match/
├── number-guessing/
├── snake/
└── README.md  ← you are here
```

---

## 🗺️ Roadmap

* [ ] Refactor code into clean OOP (SOLID) patterns
* [ ] Add JavaFX versions of console games
* [ ] Add unit tests for core mechanics
* [ ] Publish runnable JARs / Releases
* [ ] Add CI workflow (build + test) using GitHub Actions
* [ ] Turn Snake into a level-based game with scores

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. Fork the repository
2. Create a feature branch: `git checkout -b feat/your-idea`
3. Commit your changes: `git commit -m "feat: add your idea"`
4. Push to the branch: `git push origin feat/your-idea`
5. Open a Pull Request

> For new games, please include a short README with: **rules**, **controls**, **how to run**, and **screenshots** (if UI-based).

---

## 📒 Learning Notes

I’m passionate about **Java** and documenting what I learn along the way:

* Game loop basics (update → render → sleep)
* Keyboard input handling & event listeners
* Randomness, collections, and state management
* Basic collision detection & grid systems
* Clean code and project structure

Find notes in `/notes` (to be added).

---

## 📫 Contact

**Author:** *Naymathullah*
**Goal:** Become a *Java Developer* soon
**GitHub:** <your-username>
**Email:** [your-email@example.com](mailto:your-email@example.com)

> Feel free to open an issue for questions or suggestions.

---

## 🪪 License

This repository is open-sourced under the **MIT License**. You are free to use the code with attribution. See `LICENSE` for details.

---

### ⭐ If you find these games helpful or fun, please star the repo!
