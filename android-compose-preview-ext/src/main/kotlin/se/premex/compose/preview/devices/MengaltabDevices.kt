package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MengalTab device specifications for Android Compose previews.
 *
 * This extension provides MengalTab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mengaltab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mengaltab: Any
  get() = object {
      /** MengalTab Mengaltab_Echague_anzatech */
      val MENGALTAB_ECHAGUE_ANZATECH = "spec:width=600,height=1024,unit=px,dpi=160"

  }
