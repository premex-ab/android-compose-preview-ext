package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DAIICHI device specifications for Android Compose previews.
 *
 * This extension provides DAIICHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daiichi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daiichi: Any
  get() = object {
      /** DAIICHI martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
