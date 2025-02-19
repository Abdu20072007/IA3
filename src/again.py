import numpy as np
from scipy.integrate import quad

# Define the integrand
def integrand(s, s0, i0, s_peak):
    # Avoid division by zero
    if s == 0:
        return 0
    try:
        return 1 / (s * (i0 + s0 - s + s_peak * np.log(s / s0)))
    except ValueError:
        # Handle cases where s / s0 < 0 causing log to fail
        return np.inf

# Define the function to compute t(s)
def compute_t(s, s0, i0, beta, s_peak):
    # Perform numerical integration
    result, _ = quad(integrand, s0, s, args=(s0, i0, s_peak))
    return -1 / beta * result

# Parameters

i0 = 1/100000  # Initial infected fraction
s0 = 1-i0  # Initial susceptible fraction
s_peak = 0.1/0.25  # Value of s at the peak
beta = 0.25  # Transmission rate

# Compute t(s) for given values of s
s_values = [0.1 / 0.25, 0.10735]  # Values of s to evaluate
for s in s_values:
    t = compute_t(s, s0, i0, beta, s_peak)
    print(f"t(s = {s:.5f}) = {t:.5f}")
