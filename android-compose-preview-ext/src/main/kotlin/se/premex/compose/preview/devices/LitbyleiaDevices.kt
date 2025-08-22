package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LitByLeia device specifications for Android Compose previews.
 *
 * This extension provides LitByLeia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Litbyleia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Litbyleia: Any
  get() = object {
      /** LitByLeia LPD-10W */
      val LPD_10W = "spec:width=1600,height=2560,unit=px,dpi=340"

  }
