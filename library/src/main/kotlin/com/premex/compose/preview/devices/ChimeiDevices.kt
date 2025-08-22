package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHIMEI device specifications for Android Compose previews.
 *
 * This extension provides CHIMEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chimei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chimei: Any
  get() = object {
      /** CHIMEI hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHIMEI zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
