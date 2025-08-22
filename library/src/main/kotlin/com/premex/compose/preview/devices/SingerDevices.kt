package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Singer device specifications for Android Compose previews.
 *
 * This extension provides Singer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Singer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Singer: Any
  get() = object {
      /** Singer longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Singer redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Singer shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
