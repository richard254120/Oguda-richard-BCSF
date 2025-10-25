# Sui CLI Advanced Cheat Sheet

---

## Move Package Advanced

```bash
# Build with custom output directory
sui move build --output <output_dir>

# Run Move unit tests with verbose output
sui move test --test-threads 1 --verbose

# Run Move prover for formal verification
sui move prove
```

---

## Advanced Transactions

```bash
# Execute a Move call
sui client call --package <package_id> --module <module> --function <function> \
  --args <args> --gas-budget <budget>

# Split coin
sui client split-coin --coin-id <coin_id> --amounts <amounts> --gas-budget <budget>

# Merge coins
sui client merge-coins --primary-coin-id <id> --coin-ids <id1> <id2> --gas-budget <budget>
```

---

## Staking & Validators

```bash
# Stake SUI to a validator
sui client stake-sui --amount <amount> --validator-address <validator_address> --gas-budget <budget>

# Withdraw stake
sui client withdraw-stake --staked-sui-id <id> --gas-budget <budget>
```

---

## Object & NFT Management

```bash
# View object details (including fields)
sui client object <object_id> --json

# List all NFTs owned by your address
sui client objects --type 0x2::nft::NFT
```

---

## Transaction Inspection & Debugging

```bash
# Simulate a transaction (no state change)
sui client dry-run --tx <serialized_tx>

# View transaction effects
sui client transaction <tx_digest> --effects

# View transaction events
sui client transaction <tx_digest> --events
```

---

## Key Management

```bash
# Import a private key
sui keytool import-ed25519 --mnemonic <mnemonic>

# View key details
sui keytool info --address <address>
```

---

## Faucet with Amount

```bash
# Request a specific amount of test SUI
sui client faucet --amount <amount>
```

---

## Developer Tools

```bash
# Generate Move code coverage report
sui move coverage

# Run linter on Move code
sui move lint
```

---

## Miscellaneous

```bash
# Inspect the current epoch and protocol version
sui client info

# Get validator set
sui client validators

# Show client config file location
sui client config
```

---

## Resources

- [Sui CLI Reference](https://docs.sui.io/reference/cli/client)
- [Sui Move Cookbook](https://docs.sui.io/build/move-cookbook)
- [Sui GitHub](https://github.com/MystenLabs/sui)
