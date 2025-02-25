SOURCE_DIR="/d/OneDrive - Olam International/Desktop/Software Training/Day 11 K8s Scripting"
BACKUP_DIR="/d/OneDrive - Olam International/Desktop/Software Training/Day 11 K8s Scripting/Backup"
TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
BACKUP_FILE="backup_$TIMESTAMP.tar.gz"

# Create directory if it does not exist
mkdir -p "$BACKUP_DIR"

# Convert tar file
tar -czf "$BACKUP_DIR/$BACKUP_FILE" "$SOURCE_DIR"