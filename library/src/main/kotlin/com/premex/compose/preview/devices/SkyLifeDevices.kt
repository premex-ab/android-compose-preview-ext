package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SkyLife device specifications for Android Compose previews.
 *
 * This extension provides SkyLife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyLife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyLife: Any
  get() = object {
      /** SkyLife KSTB6165 */
      val KSTB6165 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SkyLife ma5100 */
      val MA5100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
