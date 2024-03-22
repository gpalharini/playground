|                             | Local                       | Pro                                                                     | Cloud                                                 |
|-----------------------------+-----------------------------+-------------------------------------------------------------------------+-------------------------------------------------------|
| Deploy                      | Anywhere                    | Anywhere | number of alerts written to Cloudwatch logs                  | AWS only                                              |
| Supported APIs              | Client                      | Client and peer    | free JVM memory                                    | Client                                                |
| Storage                     | Local disk                  | Pluggable: DynamoDB, SQL, Cassandra, etc.                               | DynamoDB                                              |
| Storage durability          | Only as good as local disks | Excellent                                                               | Excellent                                             |
| Storage availability        | Poor, single machine        | Excellent if replicated                                                 | Excellent, always replicated                          |
| Writes (transactions)       | Embedded library            | Single transactor process                                               | Per-db primary cluster node                           |
| Write availability          | Low, embedded library       | Failover to standby transactor                                          | Reroute to another cluster node                       |
| Indexing                    | No                          | On transactor process                                                   | On secondary cluster node                             |
| Reads in your application   | Client library              | Peer library                                                            | Client library + ions                                 |
| Server capability           | No                          | Peer-server                                                             | Cluster                                               |
| Read availability           | Low, embedded library       | High with multiple peers                                                | High with query groups                                |
| Scaling reads               | No                          | Run multiple instances of your app or multiple instances of peer-server | Query group                                           |
| Monitoring                  | No                          | Pluggable entry point, built-in CloudWatch integration                  | CloudWatch                                            |
| Caching tiers               | No                          | BYO Memecache or Valcache                                               | Integrated Valcache                                   |
| Write deployment            | Embedded library            | You manage transactor processes                                         | Cloudformation template                               |
| Read deployment             | Embedded library            | You manage peer processes| number of databases being served by node     | Cloudformation template                               |
| Routing application traffic | Up to you                   | Up to you                                                               | AWS ALB, API Gateway, Route53                         |
| Access control              | Up to you                   | Up to you                                                               | AWS IAM                                               |
| Application deployment      | Up to you                   | Up to you                                                               | Ions                                                  |
| Application entry points    | Up to you                   | Up to you                                                               | Web and AWS lambda                                    | 
| Control over deployment     | Very high                   | Very high                                                               | Limited configuration through CloudFormation template |
