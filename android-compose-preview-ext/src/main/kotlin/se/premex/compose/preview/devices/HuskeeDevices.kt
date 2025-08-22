package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HUSKEE device specifications for Android Compose previews.
 *
 * This extension provides HUSKEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huskee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huskee: Any
  get() = object {
      /** HUSKEE HELIOS */
      val HELIOS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** HUSKEE HELIOS_Plus */
      val HELIOS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
