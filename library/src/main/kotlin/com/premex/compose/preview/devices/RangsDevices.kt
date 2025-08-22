package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RANGS device specifications for Android Compose previews.
 *
 * This extension provides RANGS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rangs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rangs: Any
  get() = object {
      /** RANGS lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RANGS mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
