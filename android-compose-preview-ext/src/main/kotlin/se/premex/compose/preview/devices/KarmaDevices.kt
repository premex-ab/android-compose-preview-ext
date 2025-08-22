package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Karma device specifications for Android Compose previews.
 *
 * This extension provides Karma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Karma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Karma: Any
  get() = object {
      /** Karma KG555_Pro */
      val KG555_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Karma KG777Pro */
      val KG777PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
