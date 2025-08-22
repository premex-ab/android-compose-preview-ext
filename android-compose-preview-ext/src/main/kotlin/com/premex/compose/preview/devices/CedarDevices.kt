package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cedar device specifications for Android Compose previews.
 *
 * This extension provides Cedar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cedar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cedar: Any
  get() = object {
      /** Cedar CT8X2 */
      val CT8X2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cedar CT8XEU */
      val CT8XEU = "spec:width=800,height=1280,unit=px,dpi=240"

  }
