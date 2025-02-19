import numpy as np
from scipy.optimize import fsolve

# Parameters
R0 = 2.5  # Basic reproduction number (beta / gamma)
initial_susceptible = 1 - 0.0001  # Initial susceptible fraction, close to 1
i0 = 0.0001  # Small initial infected fraction

# Define the equation to solve for s
def final_size_eq(s):
    return 1 - s + (1 / R0) * np.log(s / initial_susceptible)

# Solve for s
s_final = fsolve(final_size_eq, 0.99)[0]  # Start guess close to 1
R_inf = 1 - s_final  # Final fraction of the population that was infected and recovered

print(s_final, R_inf)
