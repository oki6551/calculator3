#!/bin/bash
test $(curl localhost:8765/mul?a=2\&b=3) -eq 3
