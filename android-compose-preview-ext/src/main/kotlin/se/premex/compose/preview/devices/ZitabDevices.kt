package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zitab device specifications for Android Compose previews.
 *
 * This extension provides Zitab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zitab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zitab: Any
  get() = object {
      /** Zitab Zitab01 */
      val ZITAB01 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
