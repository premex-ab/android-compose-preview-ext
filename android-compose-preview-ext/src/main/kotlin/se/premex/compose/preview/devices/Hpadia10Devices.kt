package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HPADIA10 device specifications for Android Compose previews.
 *
 * This extension provides HPADIA10 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hpadia10.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hpadia10: Any
  get() = object {
      /** HPADIA10 GACRUX */
      val GACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
