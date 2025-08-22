package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BALMUDA device specifications for Android Compose previews.
 *
 * This extension provides BALMUDA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Balmuda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Balmuda: Any
  get() = object {
      /** BALMUDA A101BM */
      val A101BM = "spec:width=1080,height=1920,unit=px,dpi=450"

      /** BALMUDA X01A */
      val X01A = "spec:width=1080,height=1920,unit=px,dpi=450"

  }
