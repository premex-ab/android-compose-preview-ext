package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MotSol device specifications for Android Compose previews.
 *
 * This extension provides MotSol device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Motsol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Motsol: Any
  get() = object {
      /** MotSol mkz_sdm660_64 */
      val MKZ_SDM660_64 = "spec:width=480,height=800,unit=px,dpi=220"

  }
