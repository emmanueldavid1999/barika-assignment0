public class Energy extends Physics{

        double kineticEnergy(float mass, float velocity)
        {
            return 0.5 * mass * velocity;
        }
        double potential_energy(int mass, int gravity, int height)
        { return mass * gravity * height;
        }
        public int force(int mass, int acceleration){return mass * acceleration;}
        public int acceleration(int initial_velocity, int final_velocity, int time){return initial_velocity - final_velocity /time;}
        public int weight( int mass, int gravity){return mass * gravity;}
    }


