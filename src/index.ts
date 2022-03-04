import { registerPlugin } from '@capacitor/core';

import type { InsetsV2Plugin } from './definitions';

const InsetsV2 = registerPlugin<InsetsV2Plugin>('InsetsV2', {
  web: () => import('./web').then(m => new m.InsetsV2Web()),
});

export * from './definitions';
export { InsetsV2 };
