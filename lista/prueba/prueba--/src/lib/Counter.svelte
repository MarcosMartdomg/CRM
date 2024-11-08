<script>
  let count = $state(0)
  const increment = () => {
    if(count < 20){
  count += 1
    }
  
  }
  const restar = () => {
    if(count > 0){
    count -= 1
    }
  }
</script>
<h1> {count}</h1>
<button onclick={increment}>
  +
</button>
<button onclick={restar}>
  -
</button>
