package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FIGO device specifications for Android Compose previews.
 *
 * This extension provides FIGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Figo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Figo: Any
  get() = object {
      /** FIGO Orbit_ll */
      val ORBIT_LL = "spec:width=480,height=800,unit=px,dpi=240"

      /** FIGO Telecell */
      val TELECELL = "spec:width=480,height=960,unit=px,dpi=180"

  }
