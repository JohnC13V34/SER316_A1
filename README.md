
# SER316-Assignment1
Assignment 1

# Git Practice Project

This is a simple starter project for practicing basic Git operations.

## Purpose

Use this project to practice:
- Initializing a Git repository
- Creating and switching branches
- Making commits
- Merging branches
- Resolving merge conflicts

## Getting Started

1. Navigate to this directory
2. Run `git init` to initialize the repository
3. Follow the instructions in Task 1

## Project Structure

- `Main.java` - A simple Java program that prints a greeting
- `README.md` - This file

## Learning Summary

### Merge
Used to combine branches while preserving history. This was useful for integrating
feature1 into dev after resolving conflicts.

### Rebase
Used to keep history linear by replaying commits onto dev. Feature2 demonstrated
how rebasing rewrites commit history.

### Squash
Used to clean up messy development commits in feature3 by combining multiple commits
into one meaningful commit before merging.

### Cherry-pick
Used to apply a specific commit (hotfix) directly to main without merging an entire branch.
This is useful for urgent production fixes.

### Observations
- feature1 created merge commits
- feature2 resulted in a linear history
- feature3 showed the cleanest history after squashing

### Real-world usage
- Merge: team collaboration
- Rebase: local cleanup before PR
- Squash: final integration
- Cherry-pick: emergency fixes