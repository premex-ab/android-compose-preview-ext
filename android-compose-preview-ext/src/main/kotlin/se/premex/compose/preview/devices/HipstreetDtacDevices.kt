package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hipstreet_Dtac device specifications for Android Compose previews.
 *
 * This extension provides Hipstreet_Dtac device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HipstreetDtac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HipstreetDtac: Any
  get() = object {
      /** Hipstreet_Dtac Joey_Jet_2 */
      val JOEY_JET_2 = "spec:width=480,height=800,unit=px,dpi=240"

  }
