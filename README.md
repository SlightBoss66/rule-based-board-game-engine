# Rule-Based Board Game Engine

A rule-based Scrabble-style board game implemented in Java.

This project demonstrates object-oriented game architecture, move validation, AI decision making, configurable boards and scoring mechanics.

## Features

- Human vs Human mode
- Human vs AI mode
- Configurable game boards
- Move validation
- Dictionary validation
- Wildcard support
- Premium letter and word squares
- AI move generation
- Tile bag with configurable scoring
- Open and Closed game modes


## Gameplay

Players alternately place tiles horizontally or vertically to create valid words.

The first move must pass through the start square.

Subsequent moves must connect to the existing crossword.

Premium squares and wildcard tiles influence scoring according to the game rules.

## Project Structure

src/
 ├── ai
 ├── board
 ├── game
 ├── io
 ├── score
 ├── tiles
 ├── validator
 └── main

 ai/
 Computer player.

 board/
 Board representation.

 validator/
 Move legality checking.

 score/
 Score calculation.


## Key Design Decisions

### Move Validation

- validates placement
- validates dictionary
- validates board connectivity
- validates wildcard usage

### Scoring

- premium letter
- premium word
- wildcard
- bingo bonus

### AI

The AI searches for legal moves using the current board state and tile rack before selecting a playable move.


## Technologies

- Java 25
- Object-Oriented Programming
- JUnit 5
- Git


## Future Improvements

- Better AI search strategy
- Save / Load game
- GUI implementation
- Replay system
- Statistics


## What I Learned

During this project I implemented a complete rule-based board game from scratch.

The project strengthened my understanding of:

- Object-oriented design
- Game rule implementation
- Validation systems
- AI search
- State management
- Java Collections