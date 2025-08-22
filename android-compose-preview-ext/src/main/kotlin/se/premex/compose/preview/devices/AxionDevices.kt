package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AXION device specifications for Android Compose previews.
 *
 * This extension provides AXION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axion: Any
  get() = object {
      /** AXION SBAA1011 */
      val SBAA1011 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
