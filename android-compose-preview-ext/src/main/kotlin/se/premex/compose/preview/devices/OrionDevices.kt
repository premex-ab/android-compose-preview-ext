package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ORION device specifications for Android Compose previews.
 *
 * This extension provides ORION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orion: Any
  get() = object {
      /** ORION longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ORION redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ORION umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
