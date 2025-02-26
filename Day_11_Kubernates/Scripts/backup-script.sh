SOURCE_DIR="/d/OneDrive - Olam International/Desktop/Training/Kubernates/Scripts"
BACKUP_DIR="/d/OneDrive - Olam International/Desktop/Training/Kubernates/Scripts/Backup"
TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
BACKUP_FILE="backup_$TIMESTAMP.tar.gz"

mkdir -p "$BACKUP_DIR"
tar -czf "$BACKUP_DIR/$BACKUP_FILE" -C "$SOURCE_DIR" .
