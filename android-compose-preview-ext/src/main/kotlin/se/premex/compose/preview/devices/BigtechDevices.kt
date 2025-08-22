package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bigtech device specifications for Android Compose previews.
 *
 * This extension provides Bigtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bigtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bigtech: Any
  get() = object {
      /** Bigtech Bigtech_A_RU */
      val BIGTECH_A_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Bigtech Bigtech_B_RU */
      val BIGTECH_B_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
