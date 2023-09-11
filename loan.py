# Create variables for principal amount, monthly EMI and interest rate
principal = 1000000.00 # Rs. 10,00,000.00
emi = 15000.00 # Rs. 15,000.00
rate = 0.12 # 12% per year

# Calculate the monthly interest rate
monthly_rate = rate / 12

# Initialize a variable to store the number of EMIs
num_emis = 0

# Loop until the principal amount becomes zero or negative
while principal > 0:
    # Calculate the interest for the current month
    interest = principal * monthly_rate

    # Subtract the EMI from the principal and interest
    principal = principal + interest - emi

    # Increment the number of EMIs by one
    num_emis += 1

# Print the number of EMIs
print("The customer should pay", num_emis, "EMIs to complete his loan.")
