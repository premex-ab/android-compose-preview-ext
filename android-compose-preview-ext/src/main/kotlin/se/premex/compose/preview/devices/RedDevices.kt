package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RED device specifications for Android Compose previews.
 *
 * This extension provides RED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Red.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Red: Any
  get() = object {
      /** RED HydrogenONE */
      val HYDROGENONE = "spec:width=1440,height=2560,unit=px,dpi=560"

  }
