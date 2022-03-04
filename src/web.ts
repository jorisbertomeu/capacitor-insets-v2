import { WebPlugin } from '@capacitor/core';

import type { InsetsV2Plugin } from './definitions';

export class InsetsV2Web extends WebPlugin implements InsetsV2Plugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
