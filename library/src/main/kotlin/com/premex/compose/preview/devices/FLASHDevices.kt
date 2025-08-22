package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FLASH device specifications for Android Compose previews.
 *
 * This extension provides FLASH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FLASH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FLASH: Any
  get() = object {
      /** FLASH PRIME_1 */
      val PRIME_1 = "spec:width=480,height=960,unit=px,dpi=220"

  }
