package org.example;

public class GameConfiguration {

        private int turns;
        private int min;
        private int max;

        public GameConfiguration(int turns, int min, int max) {
            this.turns = turns;
            this.min = min;
            this.max = max;
        }

        public int turns() {
            return turns;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

    }

