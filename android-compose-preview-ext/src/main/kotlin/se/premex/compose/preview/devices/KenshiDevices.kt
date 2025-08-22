package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Kenshi device specifications for Android Compose previews.
 *
 * This extension provides Kenshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kenshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kenshi: Any
  get() = object {
      /** Kenshi Kenshi_K10 */
      val KENSHI_K10 = "spec:width=1200,height=2000,unit=px,dpi=340"

  }
