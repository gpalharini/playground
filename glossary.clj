;; vector for easy human reading/editable ordering.
[:asOf
 {:title "asOf"
  :content
  "A database value as of a point in time. With asOf, you can reuse existing queries and rules to ask questions about points in time other than the present."}

 :assertion
 {:title "Assertion"
  :content
  "An atomic fact in the database, associating an <a href=\"/pro/glossary.html#entity\">entity</a>, <a href=\"/pro/glossary.html#attribute\">attribute</a>, <a href=\"/pro/glossary.html#value\">value</a>, and a <a href=\"/pro/glossary.html#tx\">tx</a>. Opposite of a <a href=\"/pro/glossary.html#retraction\">retraction</a>."}

 @@html: <object data="../images/jaretAPI.svg" width="1000" type="image/svg+xml">@@



 :attribute
 {:title "Attribute"
  :content
  "Something that can be said about an <a href=\"/pro/glossary.html#entity\">entity</a>. An attribute has a name, e.g. =:firstName=, and a value type, e.g. =:db.type/long=, and a cardinality."}

 :attribute-identifier
 {:title "Attribute identifier"
  :content
  "An entity identifier that refers to an attribute."}

 :backup-uri
 {:title "Backup URI"
  :content
  "A backup URI is a per-database URI specifying a backup location on a local filesystem path with 'file://full/path/to/backup-directory' or an S3 path with 's3://bucket/prefix'."}

 :basis-t
 {:title "Basis-t"
  :content
  "The database t that is the basis for the current database, i.e. the most recent point-in-time that this database has seen."}

 :cardinality
 {:title "Cardinality"
  :content
  "Property of an <a href=\"/pro/glossary.html#attribute\">attribute</a> that specifies how many values of the attribute can be associated with a single reference entity. Possible values are =:db.cardinality/one= and =:db.cardinality/many=."}

 :caches
 {:title "Caches"
  :content
  "Nodes use a <a href=\"/pro/overview/caching.html\">variety of caches</a>."}

:client
{:title "Client"
:content
"A process that uses a Datomic library to obtain <a href=\"/cloud/glossary.html#connection\">connection</a> to interact with one or more <a href=\"/cloud/glossary.html#database\">database</a>."}

 :closed-world-assumption
 {:title "Closed world assumption"
  :content
  "Assumption that truth is what the database knows. Databases that intend to store data of record typically make the closed-world assumption. Datomic adheres to the closed world model."}

 :component
 {:title "Component"
  :content
  "A <a href=\"/pro/glossary.html#reference\">reference attribute</a> that is part of its <a href=\"/pro/glossary.html#entity\">entity</a>. E.g. your arm is a component of you, but your sister isn't.  An attribute is a component that has ~:db/isComponent~ set to ~true~."}

 :component-attribute
 {:title "Component attribute"
  :content
  "See <a href=\"/pro/glossary.html#component\">component</a>."}

 :compute-group
{:title "Compute-group"
:content
"An Auto Scaling Group of compute resources, either a primary compute group or a query group."}

 :connection
 {:title "Connection"
  :content
  "Client object that provides access to a database. Programs can use a connection to submit transactions and queries."}
 
:consistent-hash-ring
{:title "Consistent hash ring"
:content
"Datomic uses a consistent hash ring to route transactions to a preferred Node per database. This is a performance optimization only: any Primary Compute Node can handle any transaction."}

 :coordination
 {:title "Coordination"
  :content
  "The ability of a group of processes to negotiate who is responsible for the various <a href=\"/pro/glossary.html#role\">roles</a> in a Datomic <a href=\"/pro/glossary.html#system\">system</a>."}

 :covering-index
 {:title "Covering index"
  :content
  "A covering index contains (rather than points to) the data. Datomic indexes are covering indexes."}

 :credentials
 {:title "Credentials"
  :content
  "Information used to authenticate for a particular task. In accordance
with the principle of least privilege, Datomic allows separate
credentials for each different activity performed by a running system."}

 :database
 {:title "Database"
  :content
  "A database is a set of datoms."}

 :database-uri
 {:title "Database URI"
  :content
  "A Unique Resource Identifier pointing to a specific Datomic database. URI syntax is described in the <a href=\"/pro/clojure/index.html#datomic.api/connect\">datomic.api/connect</a> doc string."}

 :data-function
 {:title "Data function"
  :content
  "A function installed in a database, i.e. an attribute value whose type is /:db/fn/."}

 :datom
 {:title "Datom"
  :content
  "An atomic fact in a database, composed of entity/attribute/value/transaction/added. Pronounced like \"datum\", but pluralized as datoms."}

 :datalog
 {:title "Datalog"
  :content
  "A deductive query system, typically consisting of:
<ul>
   <li>A database of facts</li>
   <li>A set of rules for deriving new facts from existing facts</li>
   <li>A query processor that, given some partial specification of a
   fact or rule: finds all instances of that specification implied
   by the database and rules, i.e. all the matching facts</li>
</ul>
Datomic's built-in <a href=\"/pro/glossary.html#query\">query</a> is an implementation of Datalog."}

 :domain-attribute
 {:title "Domain attribute"
  :content
  "An attribute used to model something in your application domain."}

 :edn
 {:title "Edn"
  :content
  "The <a href=\"https://github.com/edn-format/edn\">extensible data notation</a> is used by Datomic and other applications as a data transfer format."}

 :encrypted-credentials
 {:title "Encrypted credentials"
  :content
  "Encrypted form of credentials. Datomic encrypts credentials in places
like EC2 user data to reduce the threat of generic exploits."}

 :ensure
{:title "Ensure"
:content
"An operation that guarantees the existence and correct configuration of a resource. Ensure is typically built out of AWS primitives that create, query, and update resources."}

 :entity
 {:title "Entity"
  :content
  "The first component of a <a href=\"/pro/glossary.html#datom\">datom</a>, specifying who or what the datom is about. Also the collection of datoms associated with a single entity, as in the Java type, Entity."}

 :entity-id
 {:title "Entity id"
  :content
  "An opaque identifier assigned by Datomic that uniquely identifies an entity. Entity ids are integers for efficiency, but application programs should treat them as opaque ids."}

 :entity-identifier
 {:title "Entity identifier"
  :content
  "A value that identifies an entity. It can be an entity id, an ident, or a lookup ref."}

 :environment
 {:title "Environment"
  :content
  "An instantiated set of all the resources need to run an application."}

 :external-key
 {:title "External key "
  :content
  "A unique identifier external to Datomic. Typical external key types are email address, UUID, and URI. External key attributes should be declared as =db.unique/identity=."}

 :epoch
 {:title "Epoch"
  :content
  "Period of time bounded by writing index to storage. During an epoch, indexing is done in memory. At epoch boundaries, the in-memory index is merged with the persistent index, and a new persistent index is written to the storage service (without blocking the system)."}

 :excision
 {:title "Excision"
  :content
  "The complete removal of a set of <a href=\"/pro/glossary.html#datom\">datoms</a> matching a predicate. Excision should be a very infrequent operation, and should not be used to correct erroneous data."}


 :fact
 {:title "Fact"
  :content
  "See <a href=\"/pro/glossary.html#datom\">datom</a>."}

 :fressian
 {:title "Fressian"
  :content
  "<a href=\"https://github.com/Datomic/fressian/wiki/Rationale\">Fressian</a> is an extensible binary format that is used everywhere data is serialized by Datomic: on the wire, at rest, and in caches.  Fressian is designed to be:
<ul> 
   <li>Self-describing</li>
   <li>Language-independent</li>
   <li>Extensible</li>
   <li>Simple to implement and consume</li>
   <li>Compact and fast</li>
   <li>Friendly to dynamic and static languages</li>
   <li>Compressible in domain-specific ways</li>
 </ul>"}

 :keyword
 {:title "Keyword"
  :content
  "Data type representing a name, e.g. =:email= or (with namespace) =:customer/email=."}

 :ident
 {:title "Ident"
  :content
  "A value of type ~:db/ident~ that uniquely identifies an <a href=\"/pro/glossary.html#entity\">entity</a>."}

 :index
 {:title "Index"
  :content
  "Sorted collection of datoms. Indexes are named by the order in which datom components are used for sort, e.g. An index that sorts first by <a href=\"/pro/glossary.html#entity\">entity</a>, then <a href=\"/pro/glossary.html#attribute\">attribute</a>, then <a href=\"/pro/glossary.html#value\">value</a>, then <a href=\"/pro/glossary.html#tx\">tx</a> is called EAVT."}

 :infrastructure
 {:title "Infrastructure"
  :content
  "The set of all environments for an application."}

 :ions
{:title "Ions"
:content
"Your application code, running on Datomic compute nodes."}

 :lookup-ref
 {:title "Lookup-ref"
  :content
  "A list containing a unique attribute and a value that identifies an entity."}

 :lru
{:title "LRU"
:content
"Least Recently Used."}

 :metrics
 {:title "Metrics"
  :content
  "Statistics used to measure the health of a running system. By default, Datomic records metrics using Amazon's CloudWatch."}

 :namespace
 {:title "Namespace"
  :content
  "Prefix portion of a <a href=\"/pro/glossary.html#keyword\">keyword</a> used to make the keyword globally unique. Namespaces serve a similar function to table names in a relational store, without imposing any obligations or limitations, e.g. an entity can have attributes from more than one namespace."}

 :object-cache
 {:title "Object cache"
  :content
  "Nodes maintain an on-heap cache of segments containing the most recently used datoms."}

 :parameters
 {:title "Parameters"
  :content
  "Named slots for application configuration data."}

 :partition
 {:title "Partition"
  :content
  "A logical grouping of entities in a database. Partitions have unique qualified names. Every <a href=\"/pro/glossary.html#entity\">entity</a> belongs to a partition that is assigned when the entity is created. Partitions act as a storage hint, so that larger systems can plan ahead for better locality of reference for entities that are frequently accessed together. Partitions are typically coarser grained than relational tables. Partitioning is invisible to the query system, and therefore has no impact on the code you write to access the database."}

 :peer
 {:title "Peer"
  :content
  "A process that uses the Datomic library to interact with a system, and obtain <a href=\"/pro/glossary.html#connection\">connections</a> to interact with one or more <a href=\"/pro/glossary.html#database\">databases</a>. Peers have in-memory access to database values, and an integrated Datalog query engine. There can be many kinds of peers, with capabilities varying by platform and need."}

 :primary-compute-stack
{:title "Primary compute stack"
:content
"A CloudFormation stack providing computational resources. Every Datomic system has a single primary compute stack, and may also have multiple query groups."}
 
 :pull
 {:title "Pull"
  :content
  "A declarative way to make hierarchical selections of information about entities."}

 :query
 {:title "Query"
  :content
  "Datomic's Datalog system. A query finds <a href=\"/pro/glossary.html#value\">values</a> in a <a href=\"/pro/glossary.html#database\">database</a> subject to the given constraints, and is specified as <a href=\"/pro/glossary.html#edn\">edn</a>."}

 :reference
 {:title "Reference"
  :content
  "An attribute that refers to another entity. References always have the value type =db.type/ref=."}

 :reference-attribute
 {:title "Reference attribute"
  :content
  "See <a href=\"/pro/glossary.html#reference\">reference</a>."}

 :retraction
 {:title "Retraction"
  :content
  "An atomic fact in the database, dissociating an <a href=\"/pro/glossary.html#entity\">entity</a> from a particular <a href=\"/pro/glossary.html#value\">value</a> of an <a href=\"/pro/glossary.html#attribute\">attribute</a>. Opposite of an <a href=\"/pro/glossary.html#assertion\">assertion</a>."}

 :role
 {:title "Role"
  :content
  "Generic name for transactor/peer/persistence service., e.g. \"The process claims the transactor role by placing a well-known value in SDB upon startup.\" Used in the config tools."}

 :rule
 {:title "Rule"
  :content
  "A named group of <a href=\"/pro/glossary.html#query\">query</a> constraints, to allow re-use of logic across queries."}

 :schema
 {:title "Schema"
  :content
  "The set of possible attributes that can be associated with entities. Only defines the characteristics of the attributes themselves, not which attributes can be associated with which entities."}

 :schema-attribute
 {:title "Schema attribute"
  :content
  "A built-in attribute used to define schema,  e.g. all attributes are named by ~:db/ident~."}

 :segment
 {:title "Segment"
  :content
  "Indexes store datoms as a tree of segments, where the leaf nodes contain a few thousand datoms each."}

 :segment-cache
 {:title "Segment cache"
  :content
  "A cache that stores <a href=\"/pro/glossary.html#fressian\">fressian</a>-serialized data, e.g. in memcached. A segment cache takes much less memory than equivalent data in the <a href=\"/pro/glossary.html#object-cache\">object cache</a>, but is slower to access. <a href=\"/pro/glossary.html#peer\">Peer</a> and <a href=\"/pro/glossary.html#transactor\">transactor</a> processes use both object caches and segment caches."}

 :storage-resources
 {:title "Storage resources"
  :content
  "The durable elements managed by a Datomic system."}

 :storage-service
 {:title   "Storage service"
  :content "Subsystem responsible for persistence and nothing else. Datomic is designed so that the persistence layer is pluggable, and so that other functions traditionally associated with persistence are handled elsewhere. In particular, storage is provisioned separately from query and transaction capabilities."}

 :stringified-keyword
 {:title "Stringified keyword"
  :content "A string containing a Clojure keyword, e.g. \":name\" or \":person/name\"."}

 :system
 {:title "System"
  :content
  "A complete Datomic installation, consisting of storage resources, a primary compute stack, and optional query groups."}

 :time-point
 {:title "Time-point"
  :content
  "Data structure that can be resolved to a point in time in a database. It can be a database t, a tx, or a date."}

 :t
 {:title "t"
  :content
  "A point in time in a database. Every transaction is assigned a numeric t value greater than any previous t in the database, and all processes see a <a href=\"/pro/transactions/acid.html#consistency\">consistent</a> succession of ts."}

 :tx
 {:title "tx"
  :content
  "An <a href=\"/pro/glossary.html#entity\">entity</a> representing a <a href=\"/pro/glossary.html#transaction\">transaction</a>. Every <a href=\"/pro/glossary.html#datom\">datom</a> in a Datomic database includes the tx that created it, allowing recovery of the entire history of the database. Transactions are automatically associated with wall-clock time, but are otherwise ordinary entities. In particular, application code can make additional assertions about transactions."}

 :transaction
 {:title "Transaction"
  :content
  "An atomic unit of work in a database. All Datomic writes are transactional, fully serialized, and ACID (Atomic, Consistent, Isolated, and Durable)."}

 :transaction-function
 {:title "Transaction function"
  :content
  "A function that runs inside a transaction, taking the start-of-transaction (db-before) database value plus user arguments and expanding into data to be added by the transaction."}

 :transaction-log
 {:title "Transaction log"
  :content
  "An accumulate-only log of all transactions, stored in DynamoDB."}

 :transactor
 {:title "Transactor"
  :content
  "A process with the ability to commit transactions for a given
database. At any moment in time, a running database has exactly one transactor,
but any number of <a href=\"/pro/glossary.html#peer\">peers</a>."}

 :tuple
 {:title "Tuple"
  :content
  "An ordered list of elements. Datomic queries return sets
of tuples."}

 :unique
 {:title "Unique"
  :content
  "Attribute of an <a href=\"/pro/glossary.html#attribute\">attribute</a>. Each <a href=\"/pro/glossary.html#entity\">entity</a> that has a <a href=\"/pro/glossary.html#value\">value</a> for a =:db/unique= attribute must have a different value. =:db/unique= has two possible values:
<ul>
   <li>=db.unique/value=: attempts to assert a duplicate value will
   fail</li>
   <li>=db.unique/identity=: attempts to assert a duplicate identity
   will <a href=\"/pro/glossary.html#upsert\">upsert</a></li>
 </ul>"}

 :upsert
 {:title "Upsert"
  :content
  "Either insert or update an <a href=\"/pro/glossary.html#entity\">entity</a>, depending on whether the unique entity already exists."}

 :valcache
 {:title "Valcache"
  :content
  "An SSD-backed cache of segments. Valcache is similar in performance to memcached but durable and capacious."}

 :value
 {:title "Value"
  :content
  "Something that does not change, e.g. =42=, =John=, or =/pro/glossary.html#inst \"2012-02-29\"=. A <a href=\"/pro/glossary.html#datom\">datom</a> relates an <a href=\"/pro/glossary.html#entity\">entity</a> to a value through an <a href=\"/pro/glossary.html#attribute\">attribute</a>."}

 :value-type
 {:title "Value type"
  :content
  "Attribute of an <a href=\"/pro/glossary.html#attribute\">attribute</a> that specifies the data structure that can be stored in the attribute. The value type determines how a <a href=\"/pro/glossary.html#value\">value</a> is: <ul>
   <li> Serialized</li>
   <li> Sorted for indexing</li>
   <li> Represented in a programming language type</li>
</ul>"}]
