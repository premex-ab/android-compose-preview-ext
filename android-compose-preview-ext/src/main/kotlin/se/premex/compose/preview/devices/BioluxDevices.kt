package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * biolux device specifications for Android Compose previews.
 *
 * This extension provides biolux device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Biolux.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Biolux: Any
  get() = object {
      /** biolux longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** biolux redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
