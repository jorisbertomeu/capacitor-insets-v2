export interface InsetsV2Plugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
