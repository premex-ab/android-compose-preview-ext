package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVUP device specifications for Android Compose previews.
 *
 * This extension provides TVUP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVUP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVUP: Any
  get() = object {
      /** TVUP Denali_B866V2F */
      val DENALI_B866V2F = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TVUP HPA12_8GB */
      val HPA12_8GB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
