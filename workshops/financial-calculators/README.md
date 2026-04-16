# Financial Calculators 

## Project Description
This Java application was created as part of a programming assignment to practice Java methods, user input, calculations, and program structure. The application is designed for a financial organization in order to provide a set of financial calculators for their clients. It performs basic calculations for common financial scenarios such as loan payments, compound interest growth, and annuity present value.

<br>

## Features
The application includes the following calculators: 
- Mortgage Calculator
- Future Value Calculator
- Present Value of an Ordinary Annuity Calculator
- Way too many comments explaining what the code is doing

<br>

## Calculator Details
### 1. Mortgage Calculator
This calculates how much a monthly payment for a loan would be and the total interest you would pay over the life of the loan.

<br>

**Inputs:**
- Principal
- Annual interest rate
- Loan term in years

**Outputs:**
- Monthly payment
- Total interest paid

<br>

**Formula Used:**

$$
M = P \times \frac{i(1+i)^n}{(1+i)^n - 1}
$$

$$
\text{Total Interest} = (M \times n) - P
$$


Where:
- `P` = principal
- `i` = monthly interest rate
- `n` = total number of monthly payments

<br>

**Example:**

A $53,000 loan at 7.625% interest for 15 years gives:
- Monthly payment: $495.09
- Total interest paid: $36,115.99

<br>

### 2. Future Value Calculator


This calculates the future value of a one-time deposit using compound interest with daily compounding.

<br>

**Inputs:**
- Initial deposit
- Annual interest rate
- Number of years

**Outputs:**
- Future value
- Total interest earned

<br>

**Formula Used:**

$$
FV = P \times \left(1 + \frac{r}{365}\right)^{365t}
$$

$$
\text{Total Interest Earned} = FV - P
$$

Where:
- `FV` = future value
- `P` = initial deposit
- `r` = annual interest rate in decimal form
- `t` = number of years

<br>

**Example:**

A $1,000 deposit at 1.75% interest for 5 years gives:
- Future value: $1,091.44
- Total interest earned: $91.44

<br>
<br>

### 3. Present Value of an Ordinary Annuity Calculator
This calculator calculates the present value needed today to fund an annuity with fixed monthly payouts.

<br>

**Inputs:**
- Monthly payout
- Expected annual interest rate
- Number of years

**Output:**
- Present value of the annuity

<br>

**Formula Used:**

$$
PV = PMT \times \frac{1 - (1 + r)^{-n}}{r}
$$

Where:
- `PV` = present value
- `PMT` = monthly payout
- `r` = monthly interest rate
- `n` = total number of monthly payments

<br>

**Example:**

To fund an annuity that pays $3,000 monthly for 20 years at 2.5% annual interest, the required present value is:
- $566,141.46

<br>

## Technologies Used
- Java
- IntelliJ IDEA
- Git
- GitHub

<br>

## How to Run
1. Clone this repository to your local machine.
2. Open the project in IntelliJ IDEA or preferred IDE than can run Java.
3. Run the program.
4. Follow the console prompts to select a calculator and enter values that is being prompted for. 

<br>

## Notes
- Results may vary slightly by a few cents because of rounding.
- This project is console-based only.
- ChatGPT used to help with structuring and formatting of the README.md.
