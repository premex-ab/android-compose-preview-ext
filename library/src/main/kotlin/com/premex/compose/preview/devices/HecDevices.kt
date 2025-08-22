package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HEC device specifications for Android Compose previews.
 *
 * This extension provides HEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hec: Any
  get() = object {
      /** HEC broadway */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HEC dupont */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HEC hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HEC nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
