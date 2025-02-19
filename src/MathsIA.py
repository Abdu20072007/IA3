import numpy as np 
import matplotlib.pyplot as plt
from scipy.integrate import odeint

# Define the SIR model
def sir_model(y, t, beta, gamma):
    S, I, R = y
    dS_dt = -beta * S * I
    dI_dt = beta * S * I - gamma * I
    dR_dt = gamma * I
    return [dS_dt, dI_dt, dR_dt]

# Initial parameters
N = 7_800_000  # Total population
I0 = 10**-5    # Initial fraction of infected individuals
S0 = 1 - I0    # Initial fraction of susceptible individuals
R0 = 0         # Initial fraction of recovered individuals
beta = 0.25    # Transmission rate
gamma = 0.1    # Recovery rate

# Initial conditions
initial_conditions = [S0, I0, R0]

# Time points (in days)
t = np.linspace(0, 365, 365)

# Solve the differential equations
result = odeint(sir_model, initial_conditions, t, args=(beta, gamma))
S, I, R = result.T

# Find the value of S at day 244
S_at_day_244 = S[np.argmin(np.abs(t - 244))]

# Print the result
print(f"The value of S at day 244 is approximately {S_at_day_244:.5f}.")
