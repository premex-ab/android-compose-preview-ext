package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Digi_C2 device specifications for Android Compose previews.
 *
 * This extension provides Digi_C2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DigiC2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DigiC2: Any
  get() = object {
      /** Digi_C2 Digi_C2 */
      val DIGI_C2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
