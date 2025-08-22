package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PrecisionBiometric device specifications for Android Compose previews.
 *
 * This extension provides PrecisionBiometric device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Precisionbiometric.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Precisionbiometric: Any
  get() = object {
      /** PrecisionBiometric PBTAB100-1G3 */
      val PBTAB100_1G3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PrecisionBiometric PBTAB100-2G4 */
      val PBTAB100_2G4 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
