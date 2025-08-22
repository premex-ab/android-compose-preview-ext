package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * aigo device specifications for Android Compose previews.
 *
 * This extension provides aigo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aigo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aigo: Any
  get() = object {
      /** aigo A16 */
      val A16 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** aigo A16pro */
      val A16PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
