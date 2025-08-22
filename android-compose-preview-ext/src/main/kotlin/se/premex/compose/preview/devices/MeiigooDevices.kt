package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MEIIGOO device specifications for Android Compose previews.
 *
 * This extension provides MEIIGOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meiigoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meiigoo: Any
  get() = object {
      /** MEIIGOO MEIIGOO_S8 */
      val MEIIGOO_S8 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
