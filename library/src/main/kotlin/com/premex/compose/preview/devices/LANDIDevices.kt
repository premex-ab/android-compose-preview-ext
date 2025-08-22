package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LANDI device specifications for Android Compose previews.
 *
 * This extension provides LANDI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LANDI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LANDI: Any
  get() = object {
      /** LANDI AN-LFC */
      val AN_LFC = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** LANDI M20 */
      val M20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LANDI M20SE */
      val M20SE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
