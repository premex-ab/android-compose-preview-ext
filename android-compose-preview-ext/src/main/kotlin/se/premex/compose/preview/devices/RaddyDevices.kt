package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RADDY device specifications for Android Compose previews.
 *
 * This extension provides RADDY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Raddy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Raddy: Any
  get() = object {
      /** RADDY RADDY_JANJA */
      val RADDY_JANJA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RADDY RADDY_JANJA_PRO */
      val RADDY_JANJA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
