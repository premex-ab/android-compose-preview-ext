package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BEKO device specifications for Android Compose previews.
 *
 * This extension provides BEKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BEKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BEKO: Any
  get() = object {
      /** BEKO akropoli */
      val AKROPOLI = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** BEKO kunyang */
      val KUNYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BEKO R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BEKO sinchon */
      val SINCHON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BEKO wanchai */
      val WANCHAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
